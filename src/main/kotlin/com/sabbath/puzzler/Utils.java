package com.sabbath.puzzler;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static final List<User> addNullUser() {
        List<User> users = new ArrayList<User>();
        users.add(null);
        return users;
    }
}
