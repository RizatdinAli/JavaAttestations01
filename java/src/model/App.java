package src.model;

import src.repository.UsersRepositoryFileImpl;

import java.time.LocalDateTime;

public class App {
    public static < UsersRepository > void main(String[] args) {
        String userData = "f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2|2023-12-25T19:10:11.556|noisemc_99|789ghs|789ghs|Крылов|Виктор|Павлович|25|true";

        String[] userDataArray = userData.split("\\|");

        String id = userDataArray[0];
        LocalDateTime registrationDate = LocalDateTime.parse(userDataArray[1]);
        String login = userDataArray[2];
        String password = userDataArray[3];
        String confirmPassword = userDataArray[4];
        String lastName = userDataArray[5];
        String firstName = userDataArray[6];
        String middleName = userDataArray[7];
        int age = Integer.parseInt(userDataArray[8]);
        boolean isWorker = Boolean.parseBoolean(userDataArray[9]);

        User user = new User(id, registrationDate, login, password, confirmPassword, lastName, firstName, middleName, age, isWorker);

        // Дальнейшая работа с объектом user

        UsersRepository usersRepository = (UsersRepository) new UsersRepositoryFileImpl();

        // Реализация проверки функций (создание, поиск по идентификатору, выгрузка всех пользователей, обновление данных пользователя, удаление по идентификатору, удаление всех пользователей)
    }
}
