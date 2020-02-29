package dao;

import exceptions.DBException;
import model.User;

import java.util.List;

public interface UsreDAO {
    public void createTable() throws DBException;

    public void dropTable() throws DBException;

    public List<User> getAllUsers();

    public boolean isNotReg(String name);

    public void addUser(User user);

    public boolean removeUser(long id);

    public void updateUser(String name, String password, Long id);

    public List<User> getUserById(long id);
}
