package Guessing_Game;

import java.util.Scanner;

import static Guessing_Game.Color.*;

public class Guessing_Game {
     public static void play(){
        boolean trigger = false;
        boolean Scan = true;
        while(Scan) {
            try{
                System.out.println("Play Guessing_Game ?[Yes/No]");
                Scanner choise_scan = new Scanner(System.in);
                String choise = choise_scan.next();
                if(choise.equalsIgnoreCase("yes")){
                    trigger = true;
                }
                else if(choise.equalsIgnoreCase("no")){
                    trigger = false;
                } else {
                    throw new Exception("Type yes or no");
                }
//                    num_scan.close();
                Scan = false;
            }catch (Exception err){
                System.out.println(ANSI_RED+"Type yes or no."+ANSI_RESET);
//                        System.out.println("Guess a number between [1 - 100] -->");
            }
            Game_sources.guessing_game(trigger);
        }
    }

}

