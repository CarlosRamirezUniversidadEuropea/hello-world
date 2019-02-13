public class Main {

    public static void main(String[] args){

        System.out.println("Ejercicio 1:");

        for(int i = 0; i <= 100; i++){
                System.out.println(i);
        }

        System.out.println("Ejercicio 2:");

        double x = 145;
        double iva= x*0.21;
        System.out.println("El iva de 30 euros es: " + iva);

        Calculator calculator1 = new Calculator();
        System.out.println("El iva de 145 euros es: " + calculator1.calculateIVA(145d) + " euros");
        System.out.println("El iva de 258 euros es: " + calculator1.calculateIVA(258d) + " euros");

    }
}
