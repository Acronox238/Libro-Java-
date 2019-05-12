package ejercicio_1.pkg11;

public class Ejercicio_111 {

    public static void main(String[] args) {
        long tiempo = (5 * 365 * 24 * 60 * 60);
        long birth = tiempo / 7;
        long death = tiempo / 13;
        long inmi = tiempo / 45;
        long población = 312032486 + birth + inmi - death;
        System.out.println("Población en 5 años: " + población);
    }
}
