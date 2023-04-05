import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class BD extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }
    public void signUpUser(String firstName, String lastName, String emailAddress, String office, String birthdate, String password){

        String insert = "INSERT INTO" + Const.USER_TABLE + "(" + Const.USERS_FIRSTNAME + "," + Const.USERS_LASTNAME + "," +
                Const.USERS_EMAIL + "," + Const.USERS_OFFICE + "," + Const.USERS_BIRTHDATE + "," + Const.USERS_PASSWORD + ")" +
                "VALUES(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, firstName);
            prSt.setString(2, lastName);
            prSt.setString(3, emailAddress);
            prSt.setString(4, office);
            prSt.setString(5, birthdate);
            prSt.setString(6, password);

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /*public ResultSet getUser(User user){
        ResultSet resSet = null;
        */
        String select = "SELECT * FROM" + Const.USER_TABLE + "WHERE" + Const.USERS_EMAIL + "=? AND" + Const.USERS_PASSWORD + "=?";
    }
}