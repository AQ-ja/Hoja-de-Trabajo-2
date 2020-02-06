/**
 *@author Alfredo Quezada 191002
 * @author Juan Marroquin 19845
 */
public class Calculadora implements Icalculadora{
    // atributos calculadora
    private int operador1;
    private int operador2;
    // constructor de calculadora
    public Calculadora(int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    //getters y setters operador1
    public int getOperador1() {
        return operador1;
    }
    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }
    //getters y  setters operador2
    public int getOperador2() {
        return operador2;
    }
    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
    
    //metdodo suma, suma dos valores y devuelve el resultado
    @Override
    public int Sumar(int operador1, int operador2) {
        int resultado = 0;
        resultado = operador1 + operador2;
        return resultado;
        
    }
    // metodo resta, resta dos valores y devuelve el resultado
    @Override
    public int Restar(int operador1, int operador2) {
        int resultado = 0;
        resultado = operador1 - operador2;
        return resultado;
    }
    // metodo multiplcar, multiplica dos valores y devuelve el resltado
    @Override
    public int Multiplicar(int operador1, int operador2) {
        int resultado = 0;
        resultado = operador1 * operador2;
        return resultado;
    }
    // metodo dividir, divde dos valores y devuelve el resultado
    // debe de comprobar que el divisor no sea 0
    @Override
    public int Dividir(int operador1, int operador2) {
        int resultado = 0;
        resultado = operador1 / operador2;
        return resultado;
    }
    
}
