// npm install dotenv used to hide the database connection from others
// to use dotenv use the following
require('dotenv').config();
const  cors  = require("cors");
const express = require('express');
const app = express();
// import the router
const userrouter=require("./api/users/user.router");

// convert to json object
app.use(express.json());

// use cors in app
app.use(cors());


// define the router begin path as /customer/data
app.use("/customer/data",userrouter);
 

// use .env from process.env
// app.listen(process.env.app_port, () => {
//     console.log('server is running on port', process.env.app_port);
// })


const port = process.env.PORT || 3000;
app.listen(port, () => {
  console.log(`Listening on http://localhost:${port}/`);
});
