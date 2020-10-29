public class ejercicio1 {

    public static void main(String[] args) {
        int[] my_array = {1,2,3,4,5};
        String[] num_array = {"","primer","segundo","tercero","cuarto","quinto"};

        for(int i : my_array) {
            System.out.printf("Hola %s intento \n",num_array[i]);
            System.out.println(i +",");
        }
    }

}
