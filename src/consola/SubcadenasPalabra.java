
package consola;
// Importar la clase ArrayList desde el paquete java.util
import java.util.ArrayList;

// Definir una clase llamada SubcadenasPalabra
public class SubcadenasPalabra {

    // Definir una función que toma una palabra como parámetro y devuelve una lista de subcadenas
    public static ArrayList<String> obtenerTodasLasPalabras(String palabra) {
        // Crear una nueva ArrayList para almacenar las subcadenas
        ArrayList<String> subcadenas = new ArrayList<>();

        // Obtener la longitud de la palabra
        int n = palabra.length();

        // Iterar sobre todas las posibles subcadenas de la palabra
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // Agregar la subcadena actual a la lista
                subcadenas.add(palabra.substring(i, j));
            }
        }

        // Devolver la lista de subcadenas
         return subcadenas;
    }

    // Función principal que se ejecuta al correr el programa
    public static void main(String[] args) {
        // Definir una palabra de ejemplo
        String palabra = "cab";

        // Llamar a la función para obtener las subcadenas de la palabra
        ArrayList<String> subcadenas = obtenerTodasLasPalabras(palabra);

        // Imprimir las subcadenas en la consola
        for (String subcadena : subcadenas) {
            System.out.print("\"" + subcadena + "\", ");
        }
    }
}

