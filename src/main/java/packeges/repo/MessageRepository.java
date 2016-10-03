package packeges.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import packeges.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Vlad on 06.09.2016.
 */
public interface MessageRepository extends JpaRepository<Message,Integer> {
    @Query("SELECT mes from Message mes where mes.recipient.id = :param")
    public List<Message> findAllInputMessage(@Param("param")int user);

    @Query("SELECT mes from Message mes where mes.sender.id = :param")
    public List<Message> findAllOutnputMessage(@Param("param")int user);
}
