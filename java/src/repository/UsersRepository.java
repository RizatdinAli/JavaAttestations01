package src.repository;


import src.model.User;

import java.util.List;

public interface UsersRepository {
    // Создание пользователя
    void create(User user);

    // Поиск пользователя по ID
    User findById(String id);

    // Выгрузка всех пользователей
    List<User> findAll();

    // Обновление пользователя
    void update(User user);

    // Удаление пользователя по ID
    void deleteById(String id);

    // Удаление всех пользователей
    void deleteAll();

    void delete(String uuid);
}