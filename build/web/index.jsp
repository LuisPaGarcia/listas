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
        <title>JSP Page</title>
    </head>
        <form action="miServlet" method="POST" id="form" name="form" onsubmit="return esValido()">
            
          Dato <input type="tel" name="dato" size="3">
          <button type="submit" name="operar" >Operar</button>
          <br>
          <br>
          <input type="radio" name="opcion" value="alInicio" checked>Insertar al inicio
          <br>
          <input type="radio" name="opcion" value="alFinal">Insertar al final
          <br>
          <input type="radio" name="opcion" value="eliminar">Eliminar
          <br>
          <br>
          Nodos en la lista
          <br>
          <input type="text" name="list" readonly value="<%= (getServletContext().getAttribute("salida") == null) ? "" : getServletContext().getAttribute("salida")  %>">
          
        </form>
        <script>
            function esValido(e){
                
                var dato = document.forms.form.dato.value;
                var opcion = document.forms.form.opcion.value;                
                var valido;
                
                if(dato === '' || opcion === ''){
                    valido = false;
                } else {
                    valido = true;
                }
                
                return valido;
            };
        </script>
     
</html>
