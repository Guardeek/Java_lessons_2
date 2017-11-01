package lesson15.task1;

public class User {
    private String login = "qwerty";
    private String password = "111111";

    public class Query {
        public void printToLogg() {
            System.out.println("User is " + User.this);
            System.out.println("login is " + login);
            System.out.println("password is " + password);
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLogg();
    }

    public static void main(String[] args) {
        User user = new User();
        user.createQuery();
        User.Query query1 = user.new Query();
        User.Query query2 = new User().new Query();
        query1.printToLogg();
        query2.printToLogg();
    }
}
