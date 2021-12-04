package dao;

import domains.User;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class UserDaoJdbc implements UserDao {
    private Connection connection = null;

    public UserDaoJdbc() {
        try {
            InitialContext context = new InitialContext();
            DataSource source = (DataSource) context.lookup("java:comp/env/jdbc/myds");
            connection = source.getConnection();
            System.out.println("we've got new connection:" + connection);

            // а так бы подключались через DriverManager БД напрямую, без пула коннекшнов из JNDI:
//            connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/userdb",
//                    "root", "root");
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
            System.out.println("ошибка получения коннкшн-пула");
        }

    }

    ;

    @Override
    public Long create(User user) {
        Long id = null;
        try {
            PreparedStatement preparedStatementSet = connection.prepareStatement(
                    "INSERT INTO users (name_, lastName, nickName, age, email, group_id, privileges_)" +
                            " VALUES (?, ?, ?, ?, ?, ?, ?);");
            preparedStatementSet.setString(1, user.getName());
            preparedStatementSet.setString(2, user.getLastName());
            preparedStatementSet.setString(3, user.getNickName());
            preparedStatementSet.setInt(4, user.getAge());
            preparedStatementSet.setString(5, user.getEmail());
            preparedStatementSet.setInt(6, user.getGroup().ordinal() + 1);
            preparedStatementSet.setString(7, user.getPrivileges());
            int lines = preparedStatementSet.executeUpdate();
//            System.out.println(lines + " recordings to DB has been made!");

            PreparedStatement preparedStatementGetId = connection.prepareStatement(
                    "SELECT id FROM users WHERE email = ?;");
            preparedStatementGetId.setString(1, user.getEmail());
            ResultSet resultSet = preparedStatementGetId.executeQuery();

            if (resultSet.next()) {
                id = resultSet.getLong("id");
                System.out.println("new user with id: " + id + " has been added to DB!");
            }
        } catch (SQLException e) {
            System.out.println("SQLException communicating with DB !" + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("SQLException closing the DB !" + e.getMessage());
            }
        }
        return id;
    }

    @Override
    public boolean clearDB() {
        try {
            PreparedStatement statementClear = connection.prepareStatement(
                    "TRUNCATE TABLE users;");
            System.out.println("truncating users table now!");
            statementClear.execute();

        } catch (SQLException e) {
            System.out.println("SQLException communicating with DB !" + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("SQLException closing the DB !" + e.getMessage());
            }
        }
        return true;
    }


    @Override
    public User retrieve(Long id) {
        return null;
    }

    @Override
    public boolean update(Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<User> retrieveAll() {
        return null;
    }
}
