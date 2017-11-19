package lesson18.task1;

public class Authenticate {
    public static void main(String[] args)  {
        try {
        authenticate("myLogin", "myPassword", "myPassword");
        authenticate("myLoginmyLoginmyLogin", "myPassword", "myPassword");
        authenticate("myLogin", "myPasswordmyPasswordmyPassword", "myPasswordmyPasswordmyPassword");
        authenticate("myLogin", "myPassword", "myPassword2");
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
           System.out.println(e.getMessage());
        }
    }

    private static boolean authenticate(String login, String password, String confpassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() < 20) {
            throw new WrongPasswordException("Login more than 20.");
        }
        if (password.length() > 20 || !password.equals(confpassword)) {
            throw new WrongPasswordException("Password more than 20.");
        }
        return true;
    }
}

