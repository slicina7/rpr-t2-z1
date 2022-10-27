package org.example;
public class App 
{
    public static void main( String[] args )
    {
        if(args[0].equals("sinus")) {
            double r=Matematika.Sinus(Double.valueOf(args[1]));
            System.out.println("Sinus unesenog ugla je: "+r);
        }else if(args[0].equals("faktorijel")){
            double r=Matematika.Faktorijel(Integer.valueOf(args[1]));
            System.out.println("Faktorijel unesenof broja je: "+r);
        }
    }
}
