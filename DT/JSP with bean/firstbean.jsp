
      <jsp:useBean id = "students" class = "col.students"> 
         <jsp:setProperty name = "students" property = "first" value = "Lenin Raj"/>
         <jsp:setProperty name = "students" property = "last" value = "A"/>
         <jsp:setProperty name = "students" property = "age" value = "RRR"/>
      </jsp:useBean>

      <html>
	   <body>
      <p>Student First Name: 
         <jsp:getProperty name = "students" property = "first"/>
      </p>
      
      <p>Student Last Name: 
         <jsp:getProperty name = "students" property = "last"/>
      </p>
      
      <p>Student Group: 
         <jsp:getProperty name = "students" property = "age"/>
      </p>
      </body>
      </html>
