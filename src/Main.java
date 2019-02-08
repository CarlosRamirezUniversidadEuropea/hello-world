public class Main {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1");

        for (int i=0; i<=100; i++){
            System.out.println(i);
        }

        System.out.println("Ejercicio 2");

        System.out.println("El IVA de 145€ es: " + 145*0.21 + "€");

        Calculator calculator = new Calculator();

        System.out.println("El IVA de 145€ es: " + calculator.calculateIVA(145) +"€");
        System.out.println("El IVA de 258€ es: " + calculator.calculateIVA(258) +"€");


    }
}
