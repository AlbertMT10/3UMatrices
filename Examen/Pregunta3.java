package Examen;

public class Pregunta3 {
    public static void main(String[] args) {

        //la tabla del 13
        
        int numeroTabla = 13;
        imprimirTabla(numeroTabla);
    }

    public static void imprimirTabla(int numeroDeTabla) {
        for (int x = 1; x <= 10; x++) {
            String formato = "%d x %d = %d";
            String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
            System.out.println(linea);
        }
    }
}
    

