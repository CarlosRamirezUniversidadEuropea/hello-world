import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i<=100; i++){
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce precio");
        double price = sc.nextDouble();
        double iva = price*0.21;

        System.out.println("El iva de " +price+ " es = " +iva);
    }
}
