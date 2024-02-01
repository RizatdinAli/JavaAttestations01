package src.model;


import java.time.LocalDateTime;

public class User {
    private String id;
    private LocalDateTime dateAdded;
    private String login;
    private String password;
    private String confirmPassword;
    private String surname;
    private String name;
    private String patronymic;
    private int age;
    private boolean isWorker;

    public User() {

    }

    private User(String id, LocalDateTime dateAdded, String login, String password, String confirmPassword, String surname, String name, String patronymic, int age, boolean isWorker) {
        this.id = id;
        this.dateAdded = dateAdded;
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.isWorker = isWorker;
    }

    public static User createUser(String id, LocalDateTime dateAdded, String login, String password, String confirmPassword, String surname, String name, String patronymic, int age, boolean isWorker) {
        return new User(id, dateAdded, login, password, confirmPassword, surname, name, patronymic, age, isWorker);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                '}';
    }
}