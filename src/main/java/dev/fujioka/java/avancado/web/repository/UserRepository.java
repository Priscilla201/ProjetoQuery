package dev.fujioka.java.avancado.web.repository;
import dev.fujioka.java.avancado.web.domain.User;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE u.password = :password")	
    List<User> findUserByPassword(String password);
	
	@Query("SELECT u FROM User u WHERE u.login = :login")
    List<User> findUserByLogin(String login);
    
 @Query	("SELECT u FROM User u WHERE u.firstName = :firstName")
 List<User> acharUserByFirstName(String firstName);

 @Query("SELECT u FROM User u WHERE u.lastName = :lastName")
 List<User> acharUserByLastName(String lastName);
 
// @Query("SELECT u FROM User u WHERE u.Id = :id")
// List<User> findUserById(Long id);
	
}