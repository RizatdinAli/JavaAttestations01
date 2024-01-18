package src.repository;

import src.model.User;

import java.util.List;

public class UsersRepositoryFileImpl implements UsersRepository {
    @Override
    public void create(User user) {
        // Реализация создания пользователя и записи в файл
    }

    @Override
    public User findById(String id) {
        // Реализация поиска пользователя по идентификатору в файле
        return null;
    }

    @Override
    public List< User > findAll() {
        // Реализация выгрузки всех пользователей из файла
        return null;
    }

    @Override
    public void update(User user) {
        // Реализация обновления данных пользователя в файле
    }

    @Override
    public void deleteById(String id) {
        // Реализация удаления пользователя по идентификатору из файла
    }

    @Override
    public void deleteAll() {
        // Реализация удаления всех пользователей из файла
    }
}