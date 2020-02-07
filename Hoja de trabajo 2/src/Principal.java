/**
 * importacion de java.io y java.util
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Stack;
/**
 *@author Alfredo Quezada
 * @author Juan Marroquin
 */

public class Principal {
   public static void main(String[] args) throws IOException {
       //dirreccion del archivo a leer
    String archivo = "C:\\Users\\Quezada\\Desktop\\Hoja-de-Trabajo-2\\Hoja de trabajo 2\\src/datos.txt";
    //importacion de la interface
    Calculadora Calculadora = new Calculadora();
    Stack<String> pila = new Stack<>();
    //creacion de variables que serviran para ejecutar el programa
    String linea;
    int operador1;
    int operador2;
    String[] lista;
    int x;
    String z;
    int resultado = 0;
    
    //lectura del archivo y sumatoria
    FileReader file = new FileReader(archivo);
       //while(count == 0){
       try (BufferedReader a = new BufferedReader(file)) {
           //while(count == 0){
           linea = a.readLine();
           //System.out.println(linea);
           lista = linea.split(" ");
           
           for(int i = 0;i<lista.length;i++){
               pila.push(lista[i]);
               System.out.println(pila);
               if(lista[i].equals("+")){
                   pila.pop();
                   operador1 = Integer.parseInt(pila.pop());
                   operador2 = Integer.parseInt(pila.pop());
                   resultado = Calculadora.Sumar(operador1, operador2);
                   x = resultado;
                   z= Integer.toString(x);
                   pila.push(z);
               }
               if(lista[i].equals("-")){
                   pila.pop();
                   operador1 = Integer.parseInt(pila.pop());
                   operador2 = Integer.parseInt(pila.pop());
                   resultado = Calculadora.Restar(operador1, operador2);
                   x = resultado;
                   z= Integer.toString(x);
                   pila.push(z);
               }
               if(lista[i].equals("*")){
                   pila.pop();
                   operador1 = Integer.parseInt(pila.pop());
                   operador2 = Integer.parseInt(pila.pop());
                   resultado = Calculadora.Multiplicar(operador1, operador2);
                   x = resultado;
                   z= Integer.toString(x);
                   pila.push(z);
                   
               }
               if(lista[i].equals("/")){
                   pila.pop();
                   operador1 = Integer.parseInt(pila.pop());
                   operador2 = Integer.parseInt(pila.pop());
                   resultado = Calculadora.Dividir(operador1, operador2);
                   x = resultado;
                   z= Integer.toString(x);
                   pila.push(z);
               }
               
           }
       }
        System.out.println("El resultado de la operacion posfix es " + resultado);
    }
    
 }
