package org.brohede.marcus.listviewapp;

public class Mountain {
    //Variabler som används i klassen
    private String name;
    private String location;
    private int height;

    //Enkel konstruktor
    public Mountain(){
        name="Saknar namn";
        location="Saknar plats";
        height=-1;
    }
    //Konstruktor som kräver inmatande av data som ska användas (namn (n), plats (l) och höjd (h))
    public Mountain(String n, String l, int h){
        name = n;
        location = l;
        height = h;
    }

    //Skapar en sträng som visar information om ett specifikt berg. Informationssträngen skapas för samtliga berg som konsturerats
    public String info(){
        String tmp = new String();
        tmp+=name+" is located in mountain range "+location+" and reaches "+height+"m above sea level.";
        return tmp;
    }
}
