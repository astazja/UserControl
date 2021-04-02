package pl.coderslab.entity;

public class MainDao {

    public static void main(String[] args) {

//        New users
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("Anna");
        user.setEmail("ssanna@anna.pl");
        user.setPassword("Annanna");
        userDao.createUser(user);

        User user1 = new User();
        user1.setUserName("Hanna");
        user1.setEmail("hanna@annah.pl");
        user1.setPassword("Hannannah");
        userDao.createUser(user1);
//        read user
        User userRead = userDao.readUser(1);
        System.out.println(userRead);
        User userNull = userDao.readUser(1000);
        System.out.println(userNull);
//        update user
        User userUpdate = userDao.readUser(1);
        userUpdate.setUserName("Nowa Anna");
        userUpdate.setEmail("nowa@anna.pl");
        userUpdate.setPassword("Nowypass");
        userDao.updateUser(userUpdate);
        System.out.println(userUpdate);
//        delete password
        userDao.deleteUser(1);
        System.out.println(userDao.readUser(1));
//          show all users
        userDao.findAllUsers();




    }
}
