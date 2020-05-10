package com.example.adapter;

import java.util.Comparator;
    public interface TableEntry {
        public int ColumnCount();

        public String getColumnName(int col);

        public Object getColumnvalue(int col);

        public String getColumnTip(int col);

        public class getColumnClass(
        int col);

        public comparator getColumnComparator(int col);

        public int getColumnWidth(int col);

    }