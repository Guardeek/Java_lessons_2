package lesson8.task1;

public class Phone {
    double model;
    double number;
    double weight;

    Phone(double width, double height, double depth) {
       // this();
        this.model = width;
        this.number = height;
        this.weight = depth;
    }
    public static void main (String args []){
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(21, 34, 26);
        phone1.receiveCall ("blue" );
        System.out.println("D,F");
    }
    public void receiveCall (String color) {
        System.out.print("Звонит"+ color);
    }

    public void receiveCall (String name, String number) {
        System.out.print("Звонит номер"+ name + number);

    }
    Phone( ) {
        System.out.println("A,B,C");
        System.out.println("A,B,C");


    }
}
