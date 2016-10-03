package packeges.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import packeges.entity.Message;
import packeges.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Vlad on 06.09.2016.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.username = :param")
     User findUserByUsername(@Param("param") String username);

    @Query("select u.username from User u")
     List<String> allUsername();
}
