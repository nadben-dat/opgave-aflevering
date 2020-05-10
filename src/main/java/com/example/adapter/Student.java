package com.example.adapter;

//We want display the student information using the generic table
  //ind given the following Student class


import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlAttr.ID;

public class Student implements Cloneable{

      public Student(){}
      public Student(String ID, String firstName, String lastName, float opStartDato, String class;){

         this.ID=ID;
         this firstName=firstName;
         this=lastName=lastName;
         this opStartDato=opStartdato;
         this class=class;

      }
      public Object clone()
         throws CloneNotSupportedException{
         return;super.clone();
      }


      public String getFirstName()[
              return firstName;]
}
public String getLasName(){
      return lastName;

      public getClass(){
         return class;

   }

   public String getID(){
         returnID;
   }
   public void setFirstname(String firstName){
         This.firstName=firstName;
   }
   public void setFirstname(String lasttName){
      This.lasttName=lasttName;
   }
   public void setclass(String class){
      This.class=class;
   }
   public void setID(String ID){
      This.ID=ID;
   }
   public String toString(){

       StringBuffer s =new StringBuffer(();

   s.append("Student  [");
      s.append("lastName");
      s.append(lastName);
      s.append(";")
      s.append("firstName");
      s.append(firsttName);
      s.append(";")
      s.append("class");
      s.append(class);
      s.append(";")
      s.append("ID=");
      s.append(ID);
      s.append("]")
              return s.toString();
   }
   protected String ID,
   protected String firstName,
   protected String lastName,
   protected float opStartDato,
   protected String class;

}