package ua.nure.pashneva.SummaryTask4.db.entity;

public class User {

    private int id;
    private String login;
    private String password;
    private String firstName;
    private String secondName;
    private int roleId;
    private int userStatusId;

    public User() {
    }

    public User(int id, String login, String password,
                String firstName, String secondName,
                int roleId, int userStatusId) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.roleId = roleId;
        this.userStatusId = userStatusId;
    }

    public User(String login, String password,
                String firstName, String secondName,
                int roleId, int userStatusId) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.roleId = roleId;
        this.userStatusId = userStatusId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getUserStatusId() {
        return userStatusId;
    }

    public void setUserStatusId(int userStatusId) {
        this.userStatusId = userStatusId;
    }
}
