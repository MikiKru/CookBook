package exercise;

public class Gamma extends Beta {
    public void classes(Object a1 , Alpha a2){
        System.out.println(a1.getClass() + " " + a2.getClass());
    }

    public static void main(String[] args) {
//        Gamma g1 = new Alpha();
//        Gamma g2 = new Beta();
//        System.out.println(g1.getType() + " " + g2.getType());
        Alpha beta = new Beta();
//        System.out.println(beta.getClass());
        Alpha gamma = new Gamma();
//        System.out.println(gamma.getClass());
        Beta gamma2 = new Gamma();
//        System.out.println(gamma2.getClass());

        new Gamma().classes(beta, gamma2);
        new Gamma().classes(new Gamma(), new Beta());

    }
}
