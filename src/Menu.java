public class Menu {
    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        int[] arreglo = new int[8];
        Operaciones m8= new Operaciones();
        m8.Llenar_Rut(arreglo);
        m8.mostrar_arr(arreglo);
        m8.inv_arr(arreglo);
        m8.mult_arr(arreglo);
        m8.sumar_arr(arreglo);


    }
}
