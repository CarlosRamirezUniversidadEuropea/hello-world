import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el nº para calcular el IVA: ");
        double valor = sc.nextDouble();

        System.out.println("El IVA es: " + valor*0.21);
    }
}