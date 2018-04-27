
package pila;
import java.util.Scanner;
import java.util.Stack;


public class Pila {

    public static void main(String[] args) {
        //String expr = "2 5+ 83 *"; // equivale a 2*(23+6)-1
       /* Scanner in= new Scanner(System.in);
 
    //System.out.println("Introduzca operacion infija\n");
    String infija=in.next();
        System.out.println("infija: "+infija);
    String expr= Convertidor.convertirApostfija(infija);
    
    System.out.print("Expresion en notación postfija: "+expr+"\n");
    String[] post = expr.split(" ");    
        System.out.println("POst;"+ expr);
    //Declaración de las pilas
    Stack < String > E = new Stack < String > (); //Pila entrada
    Stack < String > P = new Stack < String > (); //Pila de operandos

    //Añadir post (array) a la Pila de entrada (E)
    for (int i = post.length - 1; i >= 0; i--) {
      E.push(post[i]);*/
    //}

    //Algoritmo de Evaluación Postfija
  //  String operadores = "+-*/%"; 
   /* while (!E.isEmpty()) {
      if (operadores.contains("" + E.peek())) {
        P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
      }else {
        P.push(E.pop());
      } 
    }
    
    System.out.println("Expresion: " + expr);
    System.out.println("Resultado: " + P.peek());
    */
    }
    private static double evaluar(String op, String n2, String n1) {
    double num1 = Double.parseDouble(n1);
    double num2 = Double.parseDouble(n2);
    if (op.equals("+")) return  (num1 + num2);
    if (op.equals("-")) return  (num1 - num2);
    if (op.equals("*")) return  (num1 * num2);
    if (op.equals("/")) return  (num1 / num2);
    if (op.equals("%")) return  (num1 % num2);
    return 0;
  }
    public String calcula(String cadena)
            
    {
    //String expr = "2 5+ 83 *"; // equivale a 2*(23+6)-1
        
 
    //System.out.println("Introduzca operacion infija\n");
    
    String expr= Convertidor.convertirApostfija(cadena);
    
    System.out.print("Expresion en notación postfija: "+expr+"\n");
    String[] post = expr.split(" ");    
        System.out.println("POst;"+ expr);
    //Declaración de las pilas
    Stack < String > E = new Stack < String > (); //Pila entrada
    Stack < String > P = new Stack < String > (); //Pila de operandos

    //Añadir post (array) a la Pila de entrada (E)
    for (int i = post.length - 1; i >= 0; i--) {
      E.push(post[i]);
    }

    //Algoritmo de Evaluación Postfija
   String operadores = "+-*/%"; 
    while (!E.isEmpty()) {
      if (operadores.contains("" + E.peek())) {
        P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
      }else {
        P.push(E.pop());
      } 
    }
    
    System.out.println("Expresion: " + expr);
    System.out.println("Resultado: " + P.peek());
    String resultado=P.peek();
    
    return resultado;
    }
}
