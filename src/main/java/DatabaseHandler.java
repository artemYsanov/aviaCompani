import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }
    public void signUpUser(User user){

        String insert = "INSERT INTO" + Const.USER_TABLE + "(" + Const.USERS_FIRSTNAME + "," + Const.USERS_LASTNAME + "," +
                Const.USERS_EMAIL + "," + Const.USERS_OFFICE + "," + Const.USERS_BIRTHDATE + "," + Const.USERS_PASSWORD + ")" +
                "VALUES(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, user.getFirstName());
            prSt.setString(2, user.getLastname());
            prSt.setString(3, user.getEmail());
            prSt.setString(4, user.getOffice());
            prSt.setString(5, user.getBirthdate());
            prSt.setString(6, user.getPassword());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        public ResultSet getUser(User user){
        ResultSet resSet = null;

        String select = "SELECT * FROM" + Const.USER_TABLE + "WHERE" + Const.USERS_EMAIL + "=? AND" + Const.USERS_PASSWORD + "=?";

            try {
                PreparedStatement prSt = getDbConnection().prepareStatement(select);
                prSt.setString(1, user.getEmail());
                prSt.setString(2, user.getPassword());

                resSet = prSt.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return resSet;

    }
}