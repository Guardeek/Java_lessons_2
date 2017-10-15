package lesson10.task1;

public class Aspirant extends Student {

    String sceunceWork;

    public Aspirant(String firstName, String lastName, String group, String sceunceWork) {

      super (firstName,  lastName,  group);
        this.sceunceWork = sceunceWork;

    }
    public int getScholarship() {
        return 200;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "sceunceWork='" + sceunceWork + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
