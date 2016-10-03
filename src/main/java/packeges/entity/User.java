package packeges.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Vlad on 06.09.2016.
 */
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String username;

    @Column
    private String password;

    @Transient
    private String passwordConfirm;

    @Column
    private String email;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "sender")
    private List<Message> OutputMessageList;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "recipient")
    private List<Message> InputMessageList;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Message> getOutputMessageList() {
        return OutputMessageList;
    }

    public void setOutputMessageList(List<Message> outputMessageList) {
        OutputMessageList = outputMessageList;
    }

    public List<Message> getInputMessageList() {
        return InputMessageList;
    }

    public void setInputMessageList(List<Message> inputMessageList) {
        InputMessageList = inputMessageList;
    }
}
