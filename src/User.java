/**
 * Created by KJCurtis on 11/18/16.
 */


public class User {
    String email;
    String username;
    String password;
    String permissionLevel;
    boolean isAdmin;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username= username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
