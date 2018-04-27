package pila;


import pila.PilaE;

public class Convertidor {
 
public static String convertirApostfija(String infija){
String postfija= "";
PilaE pila= new PilaE(30);
 int largo =infija.length();
    System.out.println("es largo"+largo);
    
for (int i=0; i<largo; i++){
char letra= infija.charAt(i);
if (esOperador(letra)){
    if (letra== ')'){

        while(pila.getTope()!= '(')
        postfija += pila.pop()+" ";
        if(pila.getTope()== '(')
        pila.pop();
    }
 
    if (pila.vacia()){
        if (letra!= ')')
        pila.push(letra);
    } else{
        if (letra!= ')'){
            double pe= prioridadExp(letra);
            double pp= prioridadPila((char)pila.getTope());
            if (pe > pp){
            pila.push(letra);
            } else {
            postfija +=pila.pop()+" ";
                System.out.println("Posfija"+postfija);
            pila.push(letra);
            }
        }
 
}
 
}else {
    if(i==largo-1)
    {
        postfija += letra + " ";
    }else
    {
       
        if(esOperador(infija.charAt(i+1)))
        {
            postfija += letra +" ";
        }
        else
        {
            postfija += letra;
        }
    }
  

}
}
while (!pila.vacia()){
postfija += pila.pop()+" ";
}
return postfija;
}

 
public static int prioridadExp(char x){
if (x == '^') return 4;
if (x == '*' || x == '/') return 2;
if (x == '+' || x == '-') return 1;
if (x == '(') return 5;
if (x== ')') return 5;
return 0;
}
 
public static int prioridadPila(char x){
if (x == '^') return 3;
if (x == '*' || x == '/') return 2;
if (x == '+' || x == '-') return 1;
if (x == '(') return 0;
if (x== ')') return 0;
return 0;
}
 
public static boolean esOperador(char letra){
if (letra == '*' || letra == '/' || letra == '+' || letra == '-' || letra == '^' || letra == '(' || letra == ')'){
return true;
}
else
return false;
}
}