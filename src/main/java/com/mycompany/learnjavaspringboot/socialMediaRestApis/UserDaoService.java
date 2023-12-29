package com.mycompany.learnjavaspringboot.socialMediaRestApis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int userIds = 0;

    static {
        users.add(new User(++userIds, "James", LocalDate.now().minusYears(50)));
        users.add(new User(++userIds, "Cameron", LocalDate.now().minusYears(40)));
        users.add(new User(++userIds, "William", LocalDate.now().minusYears(33)));
    };

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserDetails(Integer userId) {
        Predicate<? super User> predicate = user -> user.getId().equals(userId);
        return users.stream().filter(predicate).findFirst().get();
    }

    public User addUser(User user) {
        user.setId(++userIds);
        users.add(user);
        return user;
    }
}
