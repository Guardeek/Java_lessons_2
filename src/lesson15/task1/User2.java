package lesson15.task1;

public class User2 {
    private static String login = "qwerty";
    private static String password = "111111";

    public class Query {
        public void printToLogg() {
            System.out.println("User is " + User2.this);
            System.out.println("login is " + login);
            System.out.println("password is " + password);
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLogg();
    }

    public static void main(String[] args) {
        User2 user2 = new User2();
        user2.createQuery();
        User2.Query query1 = user2.new Query();
        User2.Query query2 = new User2().new Query();
        query1.printToLogg();
        query2.printToLogg();
    }
}
