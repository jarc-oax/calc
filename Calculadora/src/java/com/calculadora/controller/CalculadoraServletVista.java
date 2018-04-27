/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pila.Pila;

/**
 *
 * @author LabInfo01
 */
@WebServlet(name = "CalculadoraServletVista", urlPatterns = {"/CalculadoraServletVista"})
public class CalculadoraServletVista extends HttpServlet {

   
    

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter salida = response.getWriter();
         
        String cadena = request.getParameter("pantalla");
        System.out.println("Operacion: " + cadena);
        Pila pila = new Pila();
        String result = pila.calcula(cadena);
        System.out.println("resulado pruba"+ result);
         
         
    salida.print("<!DOCTYPE html>");

    salida.print("<html>");
    salida.print("<head>");
    salida.print("<title>Calculadora</title>");
    salida.print("<meta charset='UTF-8'>");
    salida.print("<meta name'viewpor' content'width=device-width, initial-scale=1.0'>");
    salida.print("<link rel='stylesheet' href='resource/css/bootstrap.min.css'>");
    salida.print("<link rel='stylesheet' href='resource/font-awesome-4.7.0/css/font-awesome.min.css'>");
    salida.print(" <script src='resource/js/bootstrap.min.js'></script>");
    salida.print(" </head>");
    salida.print("<body>");
    salida.print("<form action='CalculadoraServlet' method='post' name='pantalla'>");
    salida.print("<div >");
    salida.print("<table style='background-color: grey' >");
    salida.print(" <tr>");
    salida.print("<td colspan='5' ><input type='text' name='pantalla' style='width: 200px' value="+result+"></td>");
    salida.print("</tr>");
    salida.print("<tr>");
    salida.print("<td><input class='btn btn-info' type='button' value='1' onclick='pantalla.value+="+"1"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='2' onclick='pantalla.value+="+"2"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='3' onclick='pantalla.value+="+"3"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='C' onclick='pantalla.value+="+""+"' ></td>");
    salida.print("</tr>");
    salida.print("<tr>");
    salida.print("<td><input class='btn btn-info' type='button' value='4' onclick='pantalla.value+='"+"4"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='5' onclick='pantalla.value+='"+"5"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='6' onclick='pantalla.value+='"+"6"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='+' onclick='pantalla.value+='"+"+"+"' ></td>");
    
    salida.print("</tr>");
    salida.print("<tr>");
    salida.print("<td><input class='btn btn-info' type='button' value='7' onclick='pantalla.value+='"+"7"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='8' onclick='pantalla.value+='"+"8"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='9' onclick='pantalla.value+='"+"9"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='-' onclick='pantalla.value+='"+"-"+"' ></td>");
       
    salida.print("</tr>");
    salida.print("<tr>");
    salida.print("<td><input class='btn btn-info' type='button' value='0' onclick='pantalla.value+='"+"0"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='='></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='*' onclick='pantalla.value+='"+"*"+"' ></td>");
    salida.print("<td><input class='btn btn-info' type='button' value='/' onclick='pantalla.value+='"+"/"+"' ></td>");
    salida.print("</tr>");

    salida.print(" </table>");

    salida.print("</div>");

    salida.print("</form>");

    salida.print("</body>");
    salida.print("</html>");
   
    
    }
  

}
