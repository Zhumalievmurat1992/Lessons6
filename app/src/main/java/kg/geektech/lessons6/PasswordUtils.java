package kg.geektech.lessons6;

public class PasswordUtils {
    public boolean isStrongPassword(String password) {
        if (password.length() < 7) return false;
        //if (password.length() !=11 ) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*[0-9].*")) return false;
       // if (password.matches(".*[,-.].*")) return false;
        return true;
    }

}
