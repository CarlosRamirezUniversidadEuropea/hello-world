public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("Ejercicio 2");

        System.out.println("El IVA de 145€ es: " + 145*0.21 + "€");

        Calculator calculator = new Calculator();

        System.out.println("El IVA de 145€ es: " +calculator.calculateIVA(145d)+ "€");
        System.out.println("El IVA de 258€ es: " +calculator.calculateIVA(258d)+ "€");
    }
}
