package ejercicio_1.pkg7;

public class Ejercicio_17 {

    public static void main(String[] args) {
        double pi = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        System.out.println("π - primera aproximación: " + pi);
        pi += 1.0 / 13;
        System.out.println("π - segunda aproximación: " + pi);
    }

}
