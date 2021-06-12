const { createPool } = require('mysql');
const pool = createPool(
    {
        // port: process.env.db_port,
        // host: process.env.db_host,
        // user: process.env.db_user,
        // password: process.env.db_password,
        // database: process.env.db_database,
        // connectionLimit: process.env.db_connectionLimit

        port: 3306,
        host: 'database-1.cgjeatbud40v.us-east-2.rds.amazonaws.com',
        user: 'admin',
        password: 'manish123manish',
        database: 'awsmysql',
        connectionLimit: 10

    }
)

// for reuse the connection
module.exports = pool;
