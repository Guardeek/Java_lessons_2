package lesson11.task1;
// массив
public class PrintableDemo {
    public static void main(String[] args) {
        Book sdf = new Book();
        Magazine asdf = new Magazine();
        Printable[] fkdj = {
                sdf, asdf
        };
        printMagazines(fkdj);
    }

    static void printMagazines(Printable[] printable) {
        for (Printable sdf : printable) {
            if (sdf instanceof Magazine) {
                sdf.print();
            }
        }
    }

    static void printBooks(Printable[] printable) {
        for (Printable asdf : printable) {
            if (asdf instanceof Book) {
                asdf.print();
            }
        }
    }
}
