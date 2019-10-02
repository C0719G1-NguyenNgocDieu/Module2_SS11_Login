package moddel;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User user = new User();
        user.setName("John");
        user.setAccount("John");
        user.setEmail("john@codegym.com");
        user.setAge(10);
        user.setPassword("123456");
        users.add(user);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount())
                    && (u.getPassword().equals(login.getPassword()))) {
                return u;
            }
        }
        return null;
    }
}
