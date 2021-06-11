// create database service
const pool = require('../../config/database');

// export module with the method "create" which receive "data" from controller
// and "callback"
module.exports = {

    // 'create' service to insert data
    create: (data, callback) => {

        // get the database pool to insert data
        pool.query(`insert into customers(email,name,active,password) values(?,?,?,?)`,
            [
                data.email,
                data.name,
                data.active,
                data.password
            ],

            // callback place here
            (error, results, fields) => {
                if (error) {
                    return callback(error);
                }

                // if not error
                return callback(null, results);
            }
        )
    },

    // 'getAllCustomers' service
    getAllCustomers: (callback) => {
        pool.query(`select id,email,name,active,password from customers`, [],
            //callback place here
            (error, results, fields) => {
                if (error) {
                    return callback(error)
                }

                // if not error
                return callback(null, results);
            }
        )
    },


    // 'getCustomerById' service
    getCustomerById: (id, callBack) => {
        pool.query(
            `select id,email,name,active,password from customers where id = ?`,
            [id],
            (error, results, fields) => {
                if (error) {
                    callBack(error);
                }
                return callBack(null, results);
            }
        );
    },

    getCustomerByEmail: (email, callBack) => {
        pool.query(
          `select * from customers where email = ?`,
          [email],
          (error, results, fields) => {
            if (error) {
              callBack(error);
            }
            return callBack(null, results[0]);
          }
        );
      },


    // 'updatecustomer' service to update data after give the appropritae id
    updateCustomer: (data, callback) => {

        // get the database pool to insert data
        pool.query(`update customers set email=?,name=?,active=?,password=? where id=?`,
            [
                data.email,
                data.name,
                data.active,
                data.password,
                data.id
            ],

            // callback place here
            (error, results, fields) => {
                if (error) {
                    return callback(error);
                }

                // if not error
                return callback(null, results);
            }
        )
    },


    // deleteCustomerById service to delete record after giving the appropriate id
    deleteCustomerById: (id, callBack) => {
        pool.query(`delete from customers where id=?`,
            [id],
            (error, results, fields) => {
                if (error) {
                    callback(error);
                }

                return callBack(null, results)
            }
        )
    }

}