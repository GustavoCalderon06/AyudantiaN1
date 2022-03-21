import java.util.Scanner;

public class Operaciones {
    public int sumar_arr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        int div = sum / 11;
        int mul = div*11; 
        int res = sum - mul;
        int total = 11 - res;
        System.out.println("su digito verificador es: "+ total);
        if(total > 9) {
            System.out.println("si su resultado es 10 su digito es k, si es 11 su digito es 0");
        }
        return sum;
    }

    public int[] mult_arr(int[] array) {
        int mul = 2;
        for (int i = 0; i < array.length; i++) {
            if(mul==8){
                mul=2;
            } // en el if estamos siguiendo la serie que se nos pide
            array[i] *= mul;
            mul++;
        }
        return array;
    }

    public int[] inv_arr(int[] array) {
        int aux;
        for (int i = 0; i < array.length / 2; i++) {
            aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }

        return array;
    }

    public void mostrar_arr(int[] array) {

        for(int i=0;i< array.length;i++){
            System.out.print("["+array[i]+"]");
        }
        System.out.println(" ");
    }

    public int[] Llenar_Rut(int[] array) {
        Scanner leer= new Scanner(System.in);
        for(int i=0;i<array.length;i++) {
            System.out.println("ingrese el "+(i+1)+" digito de su rut");
            array[i]=leer.nextInt();
        }
        return array;
    }

}
