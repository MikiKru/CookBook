package exercise;

public class Truthy {
    public static void main(String[] args) {
        int x = 7;
//        (x == 6) ? "x == 6" : "x != 6";
        String result = (x == 6) ? "x == 6" : "x != 6";
        System.out.println((x == 6) ? "x == 6" : "x != 6");
    }
}

