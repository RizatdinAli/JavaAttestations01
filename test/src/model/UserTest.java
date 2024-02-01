package src.model;


import org.junit.jupiter.api.Test;
import src.repository.UsersRepository;
import src.repository.UsersRepositoryFileImpl;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private UsersRepository repository = new UsersRepositoryFileImpl();

    @Test
    public void testCreate() {
        User user = User.createUser("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.of(2023, 12, 25, 19, 10, 11), "noisemc_99", "789ghs", "789ghs", "Крылов", "Виктор", "Павлович", 25, true);
        repository.create(user);

        User loadedUser = repository.findById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");
        assertNotNull(loadedUser);
        assertEquals(user, loadedUser);
    }

    @Test
    public void testFindAll() {
        User user1 = User.createUser("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.of(2023, 12, 25, 19, 10, 11), "noisemc_99", "789ghs", "789ghs", "Крылов", "Виктор", "Павлович", 25, true);
        repository.create(user1);

        User user2 = User.createUser("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d3", LocalDateTime.of(2023, 12, 25, 19, 10, 12), "noisemc_99", "789ghs", "789ghs", "Крылов", "Виктор", "Павлович", 25, true);
        repository.create(user2);

        List< User > users = repository.findAll();
        assertEquals(2, users.size());

        assertEquals(user1, users.get(0));
        assertEquals(user2, users.get(1));
    }

    @Test
    public void testFindById() {
        User user = User.createUser("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.of(2023, 12, 25, 19, 10, 11), "noisemc_99", "789ghs", "789ghs", "Крылов", "Виктор", "Павлович", 25, true);
        repository.create(user);

        User loadedUser = repository.findById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");
        assertNotNull(loadedUser);
        assertEquals(user, loadedUser);
    }

    @Test
    public void testUpdate() {
        User user = User.createUser("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.of(2023, 12, 25, 19, 10, 11), "noisemc_99", "789ghs", "789ghs", "Крылов", "Виктор", "Павлович", 25, true);
        repository.create(user);

        User updatedUser = User.createUser("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.of(2023, 12, 25, 19, 10, 11), "noisemc_99", "789ghs", "789ghs", "Крылов", "Виктор", "Павлович", 30, true);
        repository.update(updatedUser);

        User loadedUser = repository.findById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");
        assertNotNull(loadedUser);
        assertEquals(updatedUser, loadedUser);
    }

    @Test
    public void testDelete() {
        User user = User.createUser("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.of(2023, 12, 25, 19, 10, 11), "noisemc_99", "789ghs", "789ghs", "Крылов", "Виктор", "Павлович", 25, true);
        repository.create(user);

        repository.delete("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");

        User loadedUser = repository.findById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");
        assertNull(loadedUser);
    }
}