
package com.example.demo;
import ch.qos.logback.classic.db.names.ColumnName;
import com.example.adapter.Student;
import com.example.adapter.TableEntry;
import com.example.demo.StudentEntryComparator;
import jdk.internal.joptsimple.internal.Classes;
import org.springframework.util.comparator.Comparators;

import java.util.Comparator;

public abstract class StudentEntry extends Student implements TableEntry {
    //position of each column

  public static final int ID_COLUMN      =0;
   public static final int FIRST_NAME_COLUMN   =1;
   public static final  int LAST_NAME_COLUMN         =2;
   public static final  int CLASS_COLUMN        =3;
   public static final int OP_START_DATO_COLUMN     =4;
   public static final int CPR_COLUMN      =5;
     public static final String[] columname= {
             "ID",
             "First Name",
             "Last Name",
             "Class",
             "OpStartDato",
             "CPR",
     };
    public static final String[] columnameTips={
            "ID",
            "First Name",
            "Last Name",
            "Class",
            "OpStartDato",
            "CPR",
    };
    /**
     *
     */
public static final Comparator[] comparator= new Comparator[]{


            new StudentEntryComparator(ID_COLUMN),
            new StudentEntryComparator(FIRST_NAME_COLUMN),
            new StudentEntryComparator(LAST_NAME_COLUMN),
            new StudentEntryComparator(CLASS_COLUMN),
            new StudentEntryComparator(OP_START_DATO_COLUMN),
            new StudentEntryComparator(CPR_COLUMN),
    };

public StudentEntry(String firstName,
                    String lastName,
                    String ID,
                    String Classe,
                    float opStartDato,
                    int Cpr){
    super(ID,firstName,lastName, Classe,opStartDato);
}
 public StudentEntry(Student student){
    if (student !=null){
        this.ID= student.ID;
        this.firstName=student.firstName;
        this.lastName=student.LastName;
        this.Class =student.classe;
        this.CPR=student.CPR;
        this.opStartDato=student.opStartdato;
    }
 }
 public int getColumnCount(){
    return ColumnNames.length;
 }
 public String getcolumnname(int col){
    if (col<=0 && col<columnames.length){
        return columnames [col];
    }
   return null;
}
public Object getColumnValue(int col){
    if (col>=0 &&
            col<columnames.length){
        switch (col){
            case ID_COLUMN:    return ID;
            case FIRST_NAME_COLUMN: return firstName;
            case LAST_NAME_COLUMN: return lastName;

        }

    }

}
}
