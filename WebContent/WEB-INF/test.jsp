<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>

    <body>
        <p>Ceci est une page générée depuis une JSP.</p>
        <p>
        
        <%-- <% mettre du code java entre ces deux balise %> --%>
       
            <% 
            String attribut = (String) request.getAttribute("bidule");
            out.println( attribut );
            attribut = attribut + " "+ (String) request.getAttribute("machin");
            out.println( "<br/>"+ attribut );
            %>
        </p>
    </body>
</html>