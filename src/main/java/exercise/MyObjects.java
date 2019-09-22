package exercise;

public class MyObjects {
    int a = 1;
    public static void main(String[] args) {
        MyObjects t1 = new MyObjects();
        MyObjects t2 = t1;

        System.out.println(++t2.a);
        System.out.println(t1.a);
        t2 = new MyObjects();
        System.out.println(t1.a);
        System.out.println(t2.a);
    }
}

