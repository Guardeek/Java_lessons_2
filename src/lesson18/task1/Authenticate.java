package lesson18.task1;

public class Authenticate {
    public static void main(String[] args) {
        System.out.println(authenticate("myLogin", "myPassword", "myPassword") + "\n");
        System.out.println(authenticate("myLoginmyLoginmyLogin", "myPassword", "myPassword") + "\n");
        System.out.println(authenticate("myLogin", "myPasswordmyPasswordmyPassword", "myPasswordmyPasswordmyPassword") + "\n");
        System.out.println(authenticate("myLogin", "myPassword", "myPassword2") + "\n");
    }

    private static boolean authenticate(String login, String password, String confpassword) {
        try {
            if (login.length() < 20) {
                throw new WrongLoginException("Login more than 20.");
            }
            if (password.length() > 20 || !password.equals(confpassword)) {
                throw new WrongPasswordException("Password is not correct.");
            }
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("Login: " + login);
            System.out.println("Password: " + password);
            System.out.println("ConfPassword: " + confpassword);
        }
        return true;
    }
}

