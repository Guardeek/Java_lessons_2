package lesson15.task1;

public class User2 {
    private static String login = "qwerty";
    private static String password = "111111";

    public static class Query {
        public void printToLogg() {
            System.out.println("login is " + login);
            System.out.println("password is " + password);
        }
    }

    Query query = new Query();

    public static void main(String[] args) {
    }
}
