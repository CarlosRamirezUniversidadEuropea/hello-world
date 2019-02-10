public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("El IVA de 145 EUR es "+ 145*0.21 +" EUR");
	    System.out.println("El IVA de 145 EUR es "+ ejercicio2.calculateIVA(145) +" EUR");
	    System.out.println("El IVA de 258 EUR es "+ ejercicio2.calculateIVA(258) +" EUR");
    }

    public static double calculateIVA(double x){
    	return x*0.21;
    }
}
