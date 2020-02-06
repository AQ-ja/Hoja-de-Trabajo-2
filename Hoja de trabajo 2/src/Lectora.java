/**
 *@author Alfredo Quezada
 *@author Juan Marroquin
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
        

public class Lectora {
    Calculadora Calculadora = new Calculadora();
    String linea;
    Stack<String> pila = new Stack<String>();
    int operador1;
    int operador2;
    String[] lista;
    int x;
    String z;
    int count;
    
    
    //constructor
    public Lectora() {
    }
    public int Resultado(String archivo) throws FileNotFoundException, IOException{
        int resultado = 0;
        count = 0;
        FileReader file = new FileReader(archivo);
        BufferedReader a = new BufferedReader(file);
        while(count == 0){
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
            a.close();
        }
        return resultado;
    }
    
}
