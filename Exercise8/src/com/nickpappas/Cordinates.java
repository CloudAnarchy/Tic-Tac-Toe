package com.nickpappas;

import java.util.Scanner;

public class Cordinates {
    private int x;
    private int y;
    private Scanner in = new Scanner(System.in);

    // Afhnei mono times apo 1-3 (apo ton xrhsth)
    public int checkCord(int n){
        n = n-1; // Giati o pinakas 3ekinaei apo 0 alla ton xrhsth ton
                 // afhnoume na  dwsei allo input gia typikous logous.

        while(n < 0 || n >= 3){
            System.out.print("Enter a valid value: ");
            n = in.nextInt();
            in.nextLine();
            System.out.println();
            n--;
        }
        return n;
    }

    // Kanei set to X afou dei oti exei valid timh
    public void setX(int x) {
        this.x = checkCord(x);
    }

    // Kanei set to Y afou dei oti exei valid timh
    public void setY(int y) {
        this.y = checkCord(y);
    }


    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}
