package org.example;

public class Matematika {
    public static int Faktorijel(int n){
        int r=1;
        for(int i=1;i<=n;i++)
        r*=i;
        return r;
    }
    public static double Sinus(double x){
        x*=Math.PI/180;
        double r=0;
        int predznak=1;
        for(int i=1;i<20;i+=2){
            r+=predznak*Math.pow(x,i)/Faktorijel(i);
            predznak*=-1;
        }
        return r;
    }
}
