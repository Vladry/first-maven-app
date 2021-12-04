package domains;

public class User {
    private Long id;
    private String name;
    private String lastName;
    private String nickName;
    private int age;
    private String email;
    private Group group;
    private String privileges;



    public User(Long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;

    }
    public User(Long id, String name, String lastName, String nickName, String email, String privileges, int age, Group group){
        this(id, name, email);
        this.lastName = lastName;
        this.nickName = nickName;
        this.privileges = privileges;
        this.age = age;
        this.group = group;
    }

    public Group getGroup(){
        return group;
    }
    public void setGroup(Group group){
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
