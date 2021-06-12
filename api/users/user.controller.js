// get all the services from module
const { create, getAllCustomers, getCustomerById, getCustomerByEmail,
    updateCustomer, deleteCustomerById } = require('../users/user.service');

const { genSaltSync, hashSync, compareSync } = require('bcrypt');

const { sign } = require("jsonwebtoken");


module.exports =
    {
        // inside this module create one controller 'createuser'
        createuser: (req, res) => {
            // all request store in body
            const body = req.body;
            const salt = genSaltSync(10);
            body.password = hashSync(body.password, salt);
            // call the create service
            create(body, (err, results) => {
                // if any error occurred
                if (err) {
                    console.log(err);
                    return res.status(500).json(
                        {
                            success: false,
                            message: 'Database connection error'
                        }
                    )

                }

                // if not any error
                return res.status(200).json({
                    succes: true,
                    data: results
                })
            })

        },


        // inside this module create one controller 'getallcustomers'
        getallcustomers: (req, res) => {

            // call the getAllCustomers service
            getAllCustomers((err, results) => {
                // if any error occurred
                if (err) {
                    console.log(err);
                    return;
                }

                if (!results) {
                    return res.json({
                        success: false,
                        message: 'No More Records'
                    })
                }

                // if retults found
                return res.json({
                    sucsces: true,
                    data: results
                })
            })

        },


        login: (req, res) => {
            const body = req.body;
            getCustomerByEmail(body.email, (err, results) => {
                if (err) {
                    console.log(err);
                }
                if (!results) {
                    return res.json({
                        success: 0,
                        data: "Invalid email or password"
                    });
                }
                const result = compareSync(body.password, results.password);
                if (result) {
                    results.password = undefined;
                    // create token
                    const jsontoken = sign({ result: results.password }, "qwe1234", {
                        expiresIn: "1h"
                    });
                    return res.json({
                        success: 1,
                        message: "login successfully",
                        token: jsontoken
                    });
                } else {
                    return res.json({
                        success: 0,
                        data: "Invalid email or password"
                    });
                }
            });
        },



        // inside this module create one controller 'getcustomerbyid'
        getcustomerbyid: (req, res) => {
            // get the id from body
            const id = req.params.id;

            // call the getCustomerById service
            getCustomerById(id, (err, results) => {
                // if any error occurred
                if (err) {
                    console.log(err);
                    return;
                }

                if (!results) {
                    return res.json({
                        success: false,
                        message: 'No More Records'
                    })
                }

                // if retults found
                return res.json({
                    sucsces: true,
                    data: results
                })
            })

        },


        // inside this module create one controller 'updatecustomer'
        updatecustomer: (req, res) => {
            // all request store in body
            const body = req.body;
            const salt = genSaltSync(10);
            body.password = hashSync(body.password, salt);
            // call the updateCustomer service
            updateCustomer(body, (err, results) => {
                // if any error occurred
                if (err) {
                    console.log(err);
                    return res.status(500).json(
                        {
                            success: false,
                            message: 'Database connection error'
                        }
                    )

                }

                // if not any error
                return res.status(200).json({
                    succes: true,
                    message: 'Record Successfully Updated',
                    data: results
                })
            })

        },



        // inside this module create one controller 'deletecustomerbyid'
        deletecustomerbyid: (req, res) => {
            // get the id from body
            const id = req.params.id;

            // call the  service deleteCustomerById
            deleteCustomerById(id, (err, results) => {
                // if any error occurred
                if (err) {
                    console.log(err);
                    return;
                }

                if (!results) {
                    return res.json({
                        success: false,
                        message: 'No More Records'
                    })
                }

                // if retults found
                return res.json({
                    sucsces: true,
                    message: 'Record Successfully Deleted',
                    data: results
                })
            })

        },






    }



