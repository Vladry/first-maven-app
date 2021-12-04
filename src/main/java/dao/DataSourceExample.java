package dao;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import javax.sql.PooledConnection;
import java.sql.SQLException;

public class DataSourceExample {
    public static void main(String[] args) throws SQLException {
        // jdbc:mysql://localhost:3306/users
        MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
        dataSource.setServerName("localhost");
        dataSource.setPort(3306);
        dataSource.setDatabaseName("userdb");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setAllowMultiQueries(true);

        PooledConnection pooledConnection = dataSource.getPooledConnection();
        System.out.println(pooledConnection);
        pooledConnection.close();
    }

}
