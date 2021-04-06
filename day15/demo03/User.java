package day15.demo03;

@Table(value = "t_user")
public class User {

    @Column(name = "no" ,type = "int")
    private int id;
    @Column(name = "username",type = "varchar(20)")
    private String username;
    @Column(name = "pwd",type = "char(6)")
    private String password;
    @Column(name = "email",type = "varchar(50)")
    private String email;

    public User(int id, String username, String password, String email) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
