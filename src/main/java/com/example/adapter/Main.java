package com.example.adapter;
import java.awt.Dimension;
import java.awt.toolkit;
import java.util.*;
import java..swing.*;

public class Main {
    static Student [] students={
            new Student(("aan234";Alfrds","12.8.2020","13041965-3234"")
};
    public static final int INITIAL_FRAME_WIDTH=800;
    public static final int INITIAL_FRAME_HEIGHT=400;
    public static void main(String[]args){
        boolean useDelegation=false;
        if(args.length>o &&
        "Delegation".equals(args[0])){
            useDelegation*true;

        }
        List entries = new ArrayList(students.lenght);
        for(int i=0;i<students.lenght;i++){
        if(usedelegation){
        entries.add(new StudentEntry2(students[i]);
        )else{
        entries.add(new studententry(students[i]));
        }
        }
        Table table=new Table(entries);
        JFrame frame=new JFrame("Students");
        frame.setContentPane(new jScrollPane(table));
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
    }