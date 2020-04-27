import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        UserDb userDb=new UserDb();
        User userToBeInserted= new User("Rares3", "1234");
        userDb.insertUser(userToBeInserted);
        System.out.println((userDb.getUser(4)));

        userDb.deleteUser(12);


        System.out.println((userDb.getAllUser()));

    }
}
