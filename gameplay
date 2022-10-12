/*

This program is a two player puzzle game that randomly selects a word from a list of words and will
create a jumble or mixed up version of the word. The players of the game must guess what the original word was
before it had been shuffled. Points are determined based off of how many tries the player needed to guess the word.
The game continues to go on until one of the two players hit 40+ total points in which case that player wins.

Author: Raif Rizwan Karkal
Date: 10th July 2022

 */

// This command is used to package all the classes under one file for inter - connected usage
package Mayham_Game;

// Importing packages for usage in program.
import java.io.IOException;
import java.util.Scanner;

public class Gameplay {
    /**
     *
     This class is responsible for controlling the direction and the logic of the game.
     This class can be regarded as the gameplay. It holds the "main" function which is where
     the different functions and classes are called. This class also holds the
     function - "player 1 and player 2" which are responsible for determining the points gained by each player
     as well as the inputs given by each player.

     */

    public static void main (String[] args) throws IOException {
        /**

         This is the main function. The main function is a public and static function with no
         return statements. This function is responsible for the main logic of the game. It holds
         some part of the user interface and calls the different functions within this class when required.
         This function also calls a different class when required. Additionally, this function, determines
         who wins the game.

         Parameters:  String[] args
         Return:  None

         */

        // printing the name of the game for users
        System.out.println("Welcome To Word Mayham");
        System.out.println(" ");
        System.out.println("The First Player To 40+ Points, Wins!");
        System.out.println(" ");

        // int player_1_total point and int player_2_total_point are used to track points. They are set to zero for now.
        int player_1_total_points = 0;
        int player_2_total_points = 0;

        // While loop used - to make sure the game continues until player 1 or player 2 total score is 40, once that occurs loop breaks.
        while ((player_1_total_points < 40) && (player_2_total_points < 40)){

            // A random word is selected from the class ReadSelectArrangeWords and function ReadWordFile. The word is assigned to variable selected word
            String selectedWord = ReadSelectArrangeWords.ReadWordFile();
            // The selected word is than sent to the class ReadSelectArrangeWords and function RandomArrangedWord as a parameter. The return string is assigned to Rearrangedword
            String Rearrangedword = ReadSelectArrangeWords.RandomArrangedWord(selectedWord);

            // The player_1 function is called with the selected word as the parameter, the return int value is assigned to player_1_points_per_turn
            int player_1_points_per_turn = player_1(selectedWord, Rearrangedword);
            System.out.println("Player 1 - You Scored " + player_1_points_per_turn + " Points" + " In This Turn");
            // After every round the player_1_total_point variable is updated by adding the points gained after each round with the existing points
            player_1_total_points = player_1_total_points + player_1_points_per_turn;
            System.out.println("Player 1 - Your Total Score Is " + player_1_total_points +" Points");
            System.out.println(" ");

            // A random word is selected from the class ReadSelectArrangeWords and function ReadWordFile. The word is assigned to variable selected word 2
            String selectedWord_2 = ReadSelectArrangeWords.ReadWordFile();
            // The selected word is than sent to the class ReadSelectArrangeWords and function RandomArrangedWord as a parameter. The return string is assigned to Rearrangedword 2
            String Rearrangedword_2 = ReadSelectArrangeWords.RandomArrangedWord(selectedWord_2);

            // The player_2 function is called with the selected word 2 as the parameter, the return int value is assigned to player_2_points_per_turn
            int player_2_points_per_turn = player_2(selectedWord_2, Rearrangedword_2);
            System.out.println("Player 2 - You Scored " + player_2_points_per_turn + " Points" + " In This Turn");
            // After every round the player_2_total_point variable is updated by adding the points gained after each round with the existing points
            player_2_total_points = player_2_total_points + player_2_points_per_turn;
            System.out.println("Player 2 - Your Total Score Is " + player_2_total_points +" Points");
            System.out.println(" ");

        }

        if ((player_1_total_points >= 40) && (player_2_total_points >= 40)){
            // Game ends here and player 1 wins
            System.out.println("Player 1 Scored - " + player_1_total_points + " Total Points");
            System.out.println("Player 2 Scored - " + player_2_total_points + " Total Points");
            System.out.println("Therefore, Its A Tie!");

        }

        // if the player_1_total_point variable is grater than or equal to 40 - program continues here
        else if (player_1_total_points >= 40){
            // Game ends here and player 1 wins
            System.out.println("Player 1 Scored - " + player_1_total_points + " Total Points. " + "Therefore, Player 1 Wins!");

        }

        // if the player_2_total_point variable is grater than or equal to 40 - program continues here
        else if (player_2_total_points >= 40){
            // Game ends here and player 2 wins
            System.out.println("Player 2 Scored - " + player_2_total_points + " Total Points. " + "Therefore, Player 2 Wins!");

        }

    }


    public static int player_1 (String Guessing_word, String Rearrangedword){
        /**

         This is the player 1 function. This function is a public static function with an
         integer value as the return value. Additionally, this function has two parameters -
         a string Guessing_word and string Rearrangedword. The Guessing_word parameter is the
         original word the user have to guess while the Rearrangedword parameter is the
         jumbled / mixed up word displayed to the user. This function is responsible
         for displaying the user interface for player 1. Also this function keeps track
         of the number of guesses the user had and the number of points scored per turn for
         player 1. The function returns the number of points scored per turn.

         Parameters:  String Guessing_word, String Rearrangedword
         Return:  Int 5, 4, 3, 2, 1, 0

         */

        // Player_1_guess is an integer that will track the number of guesses the user has had. its initially 0.
        int player_1_guess = 0;

        // Printing the user interface
        System.out.println("Player 1 Turn - " + "Guess The Original Word: " + Rearrangedword);
        System.out.println("Type - 'pass' If you would like to forfeit your turn");
        System.out.println("Enter Your Guess: ");
        // Scanner package is used to hold player_1's inputs. The input is saved to variable player1_input.
        Scanner player1_ans = new Scanner(System.in);
        String player1_input = player1_ans.nextLine();

        // if player 1 input is equal to the guessing word than player 1 got the answer in the first try hence will be awarded 5 points.
        if (player1_input.equals(Guessing_word)){
            System.out.println("Player 1 - That's Correct, The Answer Is: " + Guessing_word);
            // The return indicates the points earned which is 5 in this case.
            return 5;
        }

        // if player 1 input is equal to pass than player 1 has forefeited the turn hence will be awarded 0 points.
        else if (player1_input.equals("pass")) {
            System.out.println("Player 1 - You Forfeited Your Turn, The Answer Is: " + Guessing_word);
            // The return indicates the points earned which is 0 in this case.
            return 0;
        }

        // While loop is used to make sure the user can guess the answer 4 more times after failing to get the answer the first time. If the user doesn't get the answer after 4 more times, the loop breaks.
        while (player_1_guess < 4) {
            // player 1 guess variable is updated by adding a plus one. This is to keep track of the number of guess the user got.
            player_1_guess = player_1_guess + 1;
            // chances left variable is an integer that tracks the number of chances left for the user. This done by doing 5 - player 1 guess
            int chances_left = 5 - player_1_guess;
            System.out.println("Player 1 - Try Again, You Have " + chances_left  + " Chances Left: ");
            System.out.println("Type - 'pass' If you would like to forfeit your turn");
            System.out.println("Enter Your Guess: ");
            // This new string variable holds the new inputs given by the user.
            String player1_input_2 = player1_ans.nextLine();

            // If the user gets the answer correct and the user got the answer correct in his 2nd attempt (player 1 guess == 1 means 2nd attempt as player 1 guess == 0 means first attempt), the user gets 4 points.
            if ((player1_input_2.equals(Guessing_word))&& (player_1_guess == 1)){
                System.out.println("Player 1 - That's Correct, The Answer Is: " + Guessing_word);
                // The return indicates the points earned which is 4 in this case.
                return 4;
            }

            // If the user gets the answer correct and the user got the answer correct in his 3rd attempt (player 1 guess == 2 means 3rd attempt as player 1 guess == 0 means first attempt), the user gets 3 points.
            else if ((player1_input_2.equals(Guessing_word))&& (player_1_guess == 2)){
                System.out.println("Player 1 - That's Correct, The Answer Is: " + Guessing_word);
                // The return indicates the points earned which is 3 in this case.
                return 3;
            }

            // If the user gets the answer correct and the user got the answer correct in his 4th attempt (player 1 guess == 3 means 4th attempt as player 1 guess == 0 means first attempt), the user gets 2 points.
            else if ((player1_input_2.equals(Guessing_word))&& (player_1_guess == 3)){
                System.out.println("Player 1 - That's Correct, The Answer Is: " + Guessing_word);
                // The return indicates the points earned which is 2 in this case.
                return 2;
            }

            // If the user gets the answer correct and the user got the answer correct in his 5th attempt (player 1 guess == 4 means 5th attempt as player 1 guess == 0 means first attempt), the user gets 1 points.
            else if ((player1_input_2.equals(Guessing_word))&& (player_1_guess == 4)){
                System.out.println("Player 1 - That's Correct, The Answer Is: " + Guessing_word);
                // The return indicates the points earned which is 1 in this case.
                return 1;
            }

           // if player 1 input 2 is equal to pass, the player has forefeited the turn hence will be awarded 0 points. This is used in the case that the user forfeits while in the loop.
            else if (player1_input_2.equals("pass")) {
                System.out.println("Player 1 - You Forfeited Your Turn, The Answer Is: " + Guessing_word);
                // The return indicates the points earned which is 0 in this case.
                return 0;
            }

        }

        // if the player does not answer correctly within 5 attempts, the player runs out of chances and hence gets 0 points.
        System.out.println("Player 1 - You Ran Out Of Chances, The Answer Is: " + Guessing_word);
        // The return indicates the points earned which is 0 in this case.
        return 0;
    }


    public static int player_2 (String Guessing_word_2, String Rearrangedword_2){
        /**

         This is the player 2 function. This function is a public static function with an
         integer value as the return value. Additionally, this function has two parameters -
         a string Guessing_word 2 and string Rearrangedword 2. The Guessing_word parameter is the
         original word the user have to guess while the Rearrangedword parameter is the
         jumbled / mixed up word displayed to the user. This function is responsible
         for displaying the user interface for player 2. Also this function keeps track
         of the number of guesses the user had and the number of points scored per turn for
         player 2. The function returns the number of points scored per turn.

         Parameters:  String Guessing_word_2, String Rearrangedword_2
         Return:  Int 5, 4, 3, 2, 1, 0

         */

        // Player_2_guess is an integer that will track the number of guesses the user has had. its initially 0.
        int player_2_guess = 0;

        // Printing the user interface
        System.out.println("Player 2 Turn - " + "Guess The Original Word: " + Rearrangedword_2);
        System.out.println("Type - 'pass' If you would like to forfeit your turn");
        System.out.println("Enter Your Guess: ");
        // Scanner package is used to hold player_2's inputs. The input is saved to variable player1_input.
        Scanner player2_ans = new Scanner(System.in);
        String player2_input = player2_ans.nextLine();

        // if player 2 input is equal to the guessing word than player 2 got the answer in the first try hence will be awarded 5 points.
        if (player2_input.equals(Guessing_word_2)){
            System.out.println("Player 2 - That's Correct, The Answer Is: " + Guessing_word_2);
            // The return indicates the points earned which is 5 in this case.
            return 5;
        }

        // if player 2 input is equal to pass than player 2 has forefeited the turn hence will be awarded 0 points.
        else if (player2_input.equals("pass")) {
            System.out.println("Player 2 - You Forfeited Your Turn, The Answer Is: " +  Guessing_word_2);
            // The return indicates the points earned which is 0 in this case.
            return 0;
        }

        // While loop is used to make sure the user can guess the answer 4 more times after failing to get the answer the first time. If the user doesn't get the answer after 4 more times, the loop breaks.
        while (player_2_guess < 4) {
            // player 2 guess variable is updated by adding a plus one. This is to keep track of the number of guess the user got.
            player_2_guess = player_2_guess + 1;
            // chances left 2 variable is an integer that tracks the number of chances left for player 2. This done by doing 5 - player 2 guess
            int chances_left_2 = 5 - player_2_guess;
            System.out.println("Player 2 - Try Again, You Have " + chances_left_2 + " Chances Left: ");
            System.out.println("Type - 'pass' If you would like to forfeit your turn");
            System.out.println("Enter Your Guess: ");
            // This new string variable holds the new inputs given by the user.
            String player2_input_2 = player2_ans.nextLine();

            // If the user gets the answer correct and the user got the answer correct in his 2nd attempt (player 2 guess == 1 means 2nd attempt as player 2 guess == 0 means first attempt), the user gets 4 points.
            if ((player2_input_2.equals(Guessing_word_2))&& (player_2_guess == 1)){
                System.out.println("Player 2 - That's Correct, The Answer Is: " + Guessing_word_2);
                // The return indicates the points earned which is 4 in this case.
                return 4;
            }

            // If the user gets the answer correct and the user got the answer correct in his 3rd attempt (player 2 guess == 2 means 3rd attempt as player 2 guess == 0 means first attempt), the user gets 3 points.
            else if ((player2_input_2.equals(Guessing_word_2))&& (player_2_guess == 2)){
                System.out.println("Player 2 - That's Correct, The Answer Is: " + Guessing_word_2);
                // The return indicates the points earned which is 3 in this case.
                return 3;
            }

            // If the user gets the answer correct and the user got the answer correct in his 4th attempt (player 2 guess == 3 means 4th attempt as player 2 guess == 0 means first attempt), the user gets 2 points.
            else if ((player2_input_2.equals(Guessing_word_2))&& (player_2_guess == 3)){
                System.out.println("Player 2 - That's Correct, The Answer Is: " + Guessing_word_2);
                // The return indicates the points earned which is 2 in this case.
                return 2;
            }

            // If the user gets the answer correct and the user got the answer correct in his 5th attempt (player 2 guess == 4 means 5th attempt as player 2 guess == 0 means first attempt), the user gets 1 points.
            else if ((player2_input_2.equals(Guessing_word_2))&& (player_2_guess == 4)){
                System.out.println("Player 2 - That's Correct, The Answer Is: " + Guessing_word_2);
                // The return indicates the points earned which is 1 in this case.
                return 1;
            }

            // if player 2 input 2 is equal to pass, the player has forefeited the turn hence will be awarded 0 points. This is used in the case that the user forfeits while in the loop.
            else if (player2_input_2.equals("pass")) {
                System.out.println("Player 2 - You Forfeited Your Turn, The Answer Is: " + Guessing_word_2);
                // The return indicates the points earned which is 0 in this case.
                return 0;
            }

        }

        // if the player does not answer correctly within 5 attempts, the player runs out of chances and hence gets 0 points.
        System.out.println("Player 2 - You Ran Out Of Chances, The Answer Is: " + Guessing_word_2);
        // The return indicates the points earned which is 0 in this case.
        return 0;
    }

}
