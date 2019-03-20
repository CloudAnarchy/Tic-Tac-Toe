package com.nickpappas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        loop();
    }

    // To programma trexei apo edw
    public static void loop(){

        Board board = new Board();
        boolean yoloPrint = false; // For fun..
        int turns = 1; // Pios paixths paizei ka8e fora


        // Paizei diaforetikos paixths mexri na teleiwsei to paixnidi
        // Eite ephdh nikese kapoios eite ephdh bghke draw
        while(!(board.didGameEnd())){

            board.playerPlays(turns(turns));
            turns++;
        }

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to enable yoloPrint()? (y/n): ");
        if(in.nextLine().equals("y")){1
            yoloPrint = true;
        }else{
            yoloPrint = false;
        }
        */

        switch(board.getWhoWon()){
            case 0:
                System.out.println("Draw!");
                break;
            case 1:
                if(yoloPrint){
                    board.yoloPrint(1);
                }else{
                    System.out.println("\n\nPlayer1 won!!\n");
                }
                break;
            case 2:
                if(yoloPrint){
                    board.yoloPrint(2);
                }else{
                    System.out.println("\n\nPlayer2 won!!\n");
                }
                break;
        }

        playAgain();

    }
    // Ka8e fora pou pou au3enetai to n paizei
    // allos paixths stous artious paizei o player2
    // stous peritous o player1.
    public static int turns(int n){

        if(n % 2 == 0){
            return 2;
        }else{
            return 1;
        }
    }

    // Sou dinei thn eukeria na 3anapai3eis an 8es
    public static void playAgain(){

        System.out.println("Do you want to play again?(y/n)");
        Scanner in = new Scanner(System.in);

         if(in.nextLine().equals("y")){
              clearScreen();
              loop();

         }else System.exit(0);
    }

    // Kanei "clear" to screen (apla typwnei enan pinaka apo '\n'
    public static void clearScreen(){
        //Dirty trick..
        char c = '\n';
        char[] chars = new char[25];
        Arrays.fill(chars, c);
        System.out.print(String.valueOf(chars));
    }




}
