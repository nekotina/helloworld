package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {
    private String  users = new String("Hello, World");

    public String getHelloWorld() {
        return users;
    }
}