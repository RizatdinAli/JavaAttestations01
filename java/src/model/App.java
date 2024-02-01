package src.model;


import src.repository.UsersRepository;
import src.repository.UsersRepositoryFileImpl;

import java.time.LocalDateTime;
import java.util.List;

public class App {
    public static void main(String[] args) {
        UsersRepository repository = new UsersRepositoryFileImpl();

        // Создание пользователя
        User user1 = User.createUser("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.of(2023, 12, 25, 19, 10, 11), "noisemc_99", "789ghs", "789ghs", "Крылов", "Виктор", "Павлович", 25, true);
        repository.create(user1);

        // Поиск пользователя по ID
        User user2 = repository.findById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");
        System.out.println(user2);

        // Выгрузка всех пользователей
        List<User> users = repository.findAll();
        System.out.println(users);

        // Обновление пользователя
        User updatedUser = User.createUser("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.of(2023, 12, 25, 19, 10, 11), "noisemc_99", "789ghs", "789ghs", "Крылов", "Виктор", "Павлович", 30, true);
        repository.update(updatedUser);

        // Удаление пользователя по ID
        repository.deleteById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");

        // Удаление всех пользователей
        repository.deleteAll();
    }
}