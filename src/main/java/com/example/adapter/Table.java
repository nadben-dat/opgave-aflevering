package com.example.adapter;




import java.awt.Color;
import java.awt.Point;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.util.*;

public class Table extends JTable {

    public Table(){

            this(null);
        }

    public Table(List entries) {


   super(new ListTableModel(entries));
   model=(ListTableModel) dataModel;
   getTableHeader().addMouseListener(new MouseAdapter() {

       public void mouseClicked( new MouseAdapter())  {
           public void mousePressed(MouseEvent e){
               Point p = e.getPoint();
               JTableHeader header=(JTableHeader)e.getSource();

                       int column= header.columnAtPoint(p);
               if (model.sort(column)){
                   clearSelection();
                   updateUI();
               }
               }
           });




       setSelectionMode(ListSelectionModel).SINNGLE_SELECTION();
       for (int i=0;i < columnCount;i++){
           TableColumn column=getColumnModel().getColumn(i);
           DefaultTableCellRenderer renderer=new DefaultTableCellRenderer();
           String tip= model.getColumnTip(i);
           column.setCellRenderer(renderer);
           int W= model.getColumnWidth(i);
           if(W>0){
              column.setPreferredWidth(W);
           }
       }

       }
        protected ListTableModel model;
   static class ListTableModel extends AbstractTableModel{



       public ListTableModel(Liste entries) {
           if (entries!=null&&
           entries.size()>0){
               Object obj=entries.get(0);
               if (obj !=null &&
                       obj instanceof TableEntry){
                   this.prototype=(TableEntry)obj;
                   setData(entries) ;
               }
           }
       }

         public ListTableModel(TableEntry prototype) {
             this.prototype = prototype;
         }




       public int getColumnCount() {
           if (prototype != null) {
               return prototype.getColumnCount();

       }
           return 0;
       }


    @Override
    public int getRowCount() {
        if (entries != null) {
            return entries.size();
        } else {
            return 0;
        }
    }

    public String getColumnName(int col){
        if (prototype != null) {
            return prototype.getColumnName();
        }
                return null;
        }

        public Object getValueAt(int row ,int col){
            if (entries != null) {
                TableEntry entry=getTableEntry(row);
                if (entry!= null)  {
                    return entry.getColumnvalue(col);

                }
   }
    return null;
    }
    public Class getColumnClass(int col) {
    if (prototype ! = null){
       return prototype.getColumnClass(col);
    }
    return String.class;
}
   public OpStartDato getColumnOpStartDato(int col) {
   if (prototype ! = null){
      return prototype.getColumnOpStartdato(col);
   }
   return int.OpStartDato;
     }
   



     public Comparator getColumnComparator(int col){
          if (prototype != null) {
              return prototype.getColumnComparator(col);
          }
          return null;
      }
      public int getColumnwidth(int col) {

      if (prototype != null) {
          return prototype.getColumnwidth(col);
      }
      return -1;
  }
  public boolean  isCellEditable(int row, int col) {
         return false;
     }

     public void setValue(Object value, int row, int col){
     }
     public void clearData()  {
         entries=null;
      }

      public void setData(List entries){
          this.entries=entries;
      }
          public boolean sort(int col){
         if (entries!=null&&
         col>0 &&
         col<getColumnCount()) {
             Comparator c=getColumnComparator(col) ;
             if (c!=null) {
                 Collection.sort (entries,c);
                         return true;

            }
             return false;
         }
   public TableEntry getTableEntry(int i)  {
         if (entries !=null &&
         i>=0 &&
         i<entries.size()){
             return (TableEntry)  entries.get(i) ;
         }
         return null;
         }
         protected TableEntry prototype;
         protected list entries;//elemt are instance of tableEntry
      }
 }