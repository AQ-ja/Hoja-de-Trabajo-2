
import java.io.IOException;

/**
 *@author Alfredo Quezada
 * @author Juan Marroquin
 */
public class Principal {
   public static void main(String[] args) throws IOException {
       Lectora leer = new Lectora();
       String archivo = "C:\\Users\\Juan Marroquin\\Documents\\Juan Marroquin\\UVG\\Tercer Semestre\\Algoritmos y Estructuras de datos\\Hoja-de-Trabajo-2\\Hoja de trabajo 2\\src/datos.txt";
       int Resultado = leer.Resultado(archivo);
       System.out.println("El resultado del archivo es "+ Resultado);
    }
   
}