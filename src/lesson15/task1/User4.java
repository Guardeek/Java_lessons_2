package lesson15.task1;

public class User4 {
    private static String login = "qwerty";
    private static String password = "111111";

    public static class Query {
        void login() {
            System.out.println("login is " + login);
            System.out.println("password is " + password);
        }
    }

    public void createQuery() {
        User4.Query query = new User4.Query();
        query.login();
    }

    public static void main(String[] args) {
        User4 user4 = new User4();
        user4.createQuery();
        User4.Query query2 = new User4.Query();
        query2.login();
    }
}

