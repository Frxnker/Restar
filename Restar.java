public class Restar {
    public static void main(String[] args) {

        System.out.println("Dime un número: ");
        int n1 = Integer.parseInt(System.console().readLine());
        System.out.println("Dime otro número: ");
        int n2 = Integer.parseInt(System.console().readLine());

        if (n1 > n2) {
            System.out.println("La resta de los dos números es: " + (n1 - n2));
        } else {
            System.out.println("La resta de los dos números es: " + (n2 - n1));
        }
    }
}