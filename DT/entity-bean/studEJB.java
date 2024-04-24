import java.util.*;
import javax.ejb.*;

public class studEJB implements EntityBean {

   public String studId;
   public String name;
   public int age;

   private EntityContext context;

   public void setage(int age) {

      this.age = age;
   }

   public int getage() {

      return age;
   }

   public String getname() {

      return name;
   }

   public String ejbCreate(String studId, String name, 
      int age) throws CreateException {
	 if (studId == null) {
        	 throw new CreateException("The studId is required.");
      }

      this.studId = studId;
      this.name = name;
      this.age = age;

	

	return studId;
         }

   public void setEntityContext(EntityContext context) {


   }

   public void ejbActivate() { 

   }

   public void ejbPassivate() {

   }

   public void ejbRemove() { }
   public void ejbLoad() { }
   public void ejbStore() { }
   public void unsetEntityContext() { }
   public void ejbPostCreate(String studId, String name, 
      int age) { }

} // 
