
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDb {
    String connectionURL= "jdbc:mysql://127.0.0.1:3306/lab7_task1";
    String username= "root";
    String password= "admin";

    public User getUser(int userId) {
        User user= null;
        try(Connection con= DriverManager.getConnection(connectionURL, username, password);
            PreparedStatement ps = createPreparedStatement(con, userId);
            ResultSet rs= ps.executeQuery()){
            while (rs.next()){
                user=new User(rs.getInt("iduser"),rs.getString("username"), rs.getString("password"));

            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }

    public List<User> getAllUser(){
        List<User> users = new ArrayList<User>();
        try(Connection con= DriverManager.getConnection(connectionURL, username, password);
            PreparedStatement ps = createPreparedStatementgetAllUsers(con);
            ResultSet rs= ps.executeQuery()){
            while (rs.next()){
                users.add(new User(rs.getInt("iduser"),rs.getString("username"), rs.getString("password")));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
return users;

    }

    public void insertUser(User user){
        try(Connection con= DriverManager.getConnection(connectionURL, username, password);
            PreparedStatement ps = createPreparedStatementInsertUser(con, user);) {
                ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteUser(int userId) throws SQLException {
        try(Connection con= DriverManager.getConnection(connectionURL, username, password);
            PreparedStatement ps = createPrepareStatementDeleteUser(con, userId);){
            ps.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private PreparedStatement createPreparedStatementgetAllUsers(Connection con) throws SQLException{
        String sql= "SELECT * FROM user";
        PreparedStatement ps= con.prepareStatement(sql);
        return ps;
    }

    private PreparedStatement createPreparedStatement(Connection con, int userId) throws SQLException{
        String sql = "SELECT iduser, username, password FROM user WHERE iduser=?";
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1, userId);
        return ps;
    }

    private PreparedStatement createPreparedStatementInsertUser(Connection con, User user) throws SQLException{
        String sql= "INSERT INTO user(username, password) "+ "VALUES(?,?)";
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2, user.getPassword());
        return ps;
    }

    private PreparedStatement createPrepareStatementDeleteUser(Connection con, int userId) throws SQLException{
        String sql="DELETE FROM user WHERE iduser=?";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, userId);
        return ps;
    }
}
