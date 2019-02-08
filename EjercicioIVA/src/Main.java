import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De que numero quieres calcular el IVA???");
        double x = sc.nextDouble();

       double iva =x * 0.21;
        System.out.println("El IVA es de : "+iva);
    }
}
