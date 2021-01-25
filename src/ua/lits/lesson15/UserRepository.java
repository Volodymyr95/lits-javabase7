package ua.lits.lesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {

  Map<String, User> userCache = new HashMap<>();

  public UserRepository() {
    this.userCache.put("1", new User("1", "Peter", "Griffin"));
    this.userCache.put("2", new User("2", "Tony", "Stark"));
    this.userCache.put("3", new User("3", "Peter", "Parker"));
    this.userCache.put("4", new User("4", "Natasha", "Romanov"));
  }

  public User findById(String id) throws EntityNotFoundException {
    return Optional.ofNullable(userCache.get(id))
        .orElseThrow(() -> new EntityNotFoundException("User does not exist with id:" + id));
  }
}
