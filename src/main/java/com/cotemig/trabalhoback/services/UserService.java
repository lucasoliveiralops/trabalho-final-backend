package com.cotemig.trabalhoback.services;

import com.cotemig.trabalhoback.models.User;
import com.cotemig.trabalhoback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public long createUser(User user) {
    User userCreated = userRepository.save(user);
    return userCreated.getId();
  }

  public User indexUser(long id) {
    Optional<User> user = userRepository.findById(id);

    if (!user.isPresent()) {
      return null;
    }

    return user.get();
  }

  public User updateUser(User user){
    long userId = user.getId();
    Optional<User> userFound = userRepository.findById(userId);

    if(!userFound.isPresent()){
      return null;
    }

    userRepository.save(user);

    Optional<User> userUpdated = userRepository.findById(userId);

    return userUpdated.get();
  }

  public List<User> showUsers() {
    return userRepository.findAll();
  }

  public boolean destroyUser(long id) {
    userRepository.deleteById(id);

    Optional<User> user = userRepository.findById(id);

    return user.isPresent();
  }

  public void mockUsers(){
    if(showUsers().isEmpty()){
      User owner = new User();
      owner.setName("User Owner");
      owner.setImageUrl("https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425_960_720.png");

      User admin = new User();
      admin.setName("User Admin");
      admin.setImageUrl("https://i.pinimg.com/736x/2a/4e/8d/2a4e8dab6791ed643d5180bc72167f6d.jpg");

      User common = new User();
      common.setName("User Common");
      common.setImageUrl("https://cdn.pixabay.com/photo/2018/08/28/14/09/avatar-3637645_960_720.png");

      createUser(owner);
      createUser(admin);
      createUser(common);
    }
  }
}
