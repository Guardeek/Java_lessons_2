package lesson16.task1;

public class TreeGen<T, V, K> {
    T ob1;
    V ob2;
    K ob3;

    TreeGen(T o1, V o2, K o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    void showTypes() {
        System.out.println("Type of T is " +
                ob1.getClass().getName());

        System.out.println("Type of V is " +
                ob2.getClass().getName());

        System.out.println("Type of K is " +
                ob3.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    K getOb3() {
        return ob3;
    }
}
