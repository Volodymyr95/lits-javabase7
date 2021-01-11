package ua.lits.ny_project.repository;

import ua.lits.ny_project.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> usersDB = new ArrayList<>();


    public List<User> getAll() {
        return usersDB;
    }

}
