package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x= scan.nextInt();
        y= scan.nextInt();

        Multiplier mult = new Multiplier(x, y);
        Divider div = new Divider(x, y);

        System.out.println("Result of multiply:" + mult.calc());
        System.out.println("Result of divide:" + div.calc());
    }
}
class Multiplier {
    protected double x;
    protected double y;

    public Multiplier(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calc() {
        return x*y;
    }
}

class Divider extends Multiplier{
    public Divider(double x, double y){
        super(x,y);
    }
    @Override
    public double calc(){
        return x/y;
    }
}
