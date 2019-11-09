<%-- 
    Document   : index
    Created on : Nov 8, 2019, 2:37:39 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista </title>
    </head>
        <form action="miServlet" method="GET" id="form" name="form" onsubmit="return esValido()">
            
          Dato <input type="tel" name="dato" size="3" autofocus>
          <button type="submit" name="operar" >Operar</button>
          <br>
          <br>
          <input type="radio" name="opcion" value="alInicio">Insertar al inicio
          <br>
          <input type="radio" name="opcion" value="alFinal">Insertar al final
          <br>
          <input type="radio" name="opcion" value="eliminar">Eliminar
          <br>
          <br>
          Nodos en la lista
          <br>
          <% 
              String lista; 
              // Validar si lista es null
              if((getServletContext().getAttribute("lista") == null)){
                  // Si es null, se muestra como vacio
                  lista = "";
              } else {
                  // Si no es null, mostramos la lista en el input de salida
                  lista = getServletContext().getAttribute("lista").toString();
              }
          %>
          <input type="text" name="list" readonly value="<%= lista  %>">
          
        </form>
        <script>
            function esValido(e){
                // Obtener ambos valores del dato y la opcion
                var dato = document.forms.form.dato.value;
                var opcion = document.forms.form.opcion.value;                
                var valido;
                // Si tiene valores, ejecutar una accion
                if(!dato || !opcion){
                    valido = false;
                } else {
                // Si tiene valores, ejecutar una accion
                    valido = true;
                }
                
                // Retornar true o false
                return valido;
            };
        </script>
     
</html>
