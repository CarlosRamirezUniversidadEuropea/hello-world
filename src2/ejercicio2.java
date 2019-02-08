public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número: ");
        double a = sc.nextDouble();

       double IVA = 0.21*a;
        System.out.println("El IVA ES " +IVA);
    }
}
