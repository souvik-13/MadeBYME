package Guessing_Game;
import java.util.Scanner;

import static Guessing_Game.Color.*;

class Game_sources {
    public static void guessing_game(boolean trigger) {
        int actual_num = (int) (99 * (Math.random()) + 1);
        int guess_num = -1;
        int count = 0;
        int highest_score = Integer.MAX_VALUE;

        while (trigger == true) {

            boolean scan = true;
//            Taking First input
            while (scan) {
                try {
                    if(count==0) {
                        System.out.println("Guess a number between [1 - 100] -->");
                    }
                    Scanner num_scan = new Scanner(System.in);
                    guess_num = num_scan.nextInt();
                    ++count;
                    scan = false;
                } catch (Exception err) {
                    System.out.println(ANSI_RED+"Type a valid number between [1 - 100]"+ANSI_RESET);
                    System.out.println("guess again.");
                }
            }

            if (guess_num == -1) {
                System.out.println(ANSI_RED+"You dont have a valid input"+ANSI_RESET);
                break;
            } else if (guess_num > actual_num) {
                System.out.println("Your number is "+ANSI_YELLOW+"greater"+ANSI_RESET+" than the actual.");
                System.out.println("Guess again -->");
                continue;

            } else if (guess_num < actual_num) {
                System.out.println("Your number is "+ANSI_YELLOW+"smaller"+ANSI_RESET+" than the actual.");
                System.out.println("Guess again -->");
                continue;

            }else if (guess_num == actual_num) {
                System.out.println(ANSI_GREEN+"Congratulation!!");
                System.out.println("You guessed it correct"+ANSI_RESET);
                System.out.println(ANSI_PURPLE+"Your score is "+count+ANSI_RESET);
                if(count < highest_score){
                    highest_score = count;
                }
                count = 0;
                System.out.println(ANSI_GREEN+"Your highest score is "+highest_score+""+ANSI_RESET);
                scan = true;
                while(scan) {
                    try{
                        System.out.println("Do you want to play this again[Yes/No] -->");
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

                        scan = false;
                    }catch (Exception err){
                        System.out.println(ANSI_RED+"Invalid input. "+err+ANSI_RESET);

                    }
                }
            }
        }
    }
}
