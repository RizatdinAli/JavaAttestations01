package src.repository;

import src.model.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryFileImpl implements UsersRepository {
    private static final String USERS_FILE_NAME = "users.dat";
    private List<User> users;

    public UsersRepositoryFileImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void create(User user) {
        try {
            File file = new File(USERS_FILE_NAME);
            FileWriter writer = new FileWriter(file);
            writer.write(user.toString());
            writer.flush();
            writer.close();
            users.add(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void update(User user) {
        int index = users.indexOf(user);
        if (index != -1) {
            users.set(index, user);
        } else {
            users.add(user);
        }
    }

    @Override
    public void deleteById(String id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.remove(i);
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        users.clear();
    }

    /**
     * @param uuid
     */
    @Override
    public void delete(String uuid) {

    }
}