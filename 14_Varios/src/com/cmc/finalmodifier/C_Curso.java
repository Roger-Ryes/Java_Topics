package com.cmc.finalmodifier;

import java.util.ArrayList;

public class C_Curso {

    // Al colocar final en un atributo, evita que el atributo no pueda ser modificado
    // Solo el contructor puede dar valores al atributo final solo si no se dio un valor antes
    private final ArrayList<String> students;
    private final String name;

    public C_Curso(String name){
        students = new ArrayList<String>();
        this.name = name;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setValue(String name){
//        this.students = new ArrayList<>();
        students.add(name);
        students.remove(0);
//        this.name = name;
    }

//    public String metodo(final int i) {
//        for (int y=10; y==i; y--){
//            i++;
//        }
//    }
}
