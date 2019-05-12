package ejercicio_1.pkg10;

public class Ejercicio_110 {

    public static void main(String[] args) {
        double d = 14, t = (45 * 60) + 30, v;
        d /= 1.6;
        t /= 3600;
        v = d / t;
        System.out.println("Velocidad: " + v + " millas por hora");
    }

}
