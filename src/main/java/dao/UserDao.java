package dao;

import domains.User;

import java.util.List;

public interface UserDao {
    public boolean clearDB();
    Long create(User user);
    User retrieve(Long id);
    boolean update(Long id);
    boolean delete(Long id);
    List<User> retrieveAll();
}

