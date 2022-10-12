*

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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Random;
import java.util.Scanner;

public class ReadSelectArrangeWords {

    // The following code reads the word list file and selects a random word from the list of words.
    public static String ReadWordFile() throws IOException {


        File wordlist = new File("/Users/raif/IdeaProjects/Assignment_1/src/Mayham_Game/Word_list.txt"); // Be sure to update the path on this line.
        FileReader fileReader = new FileReader(wordlist);
        LineNumberReader reader = new LineNumberReader(fileReader);

        int count = 1;

        FileInputStream fileInput = new FileInputStream(wordlist);
        Scanner scannerObject = new Scanner(fileInput);
        while (scannerObject.hasNextLine()) {
            scannerObject.nextLine();
            count += 1;
        }

        // This section selects a random word from the list of words.
        Random r = new Random();
        int random = r.nextInt(count);
        String word = "";
        int lines = 0;
        while (word != null) {
            lines += 1;
            word = reader.readLine();;
            if (lines == random) {
                break;
            }
        }

        reader.close();
        fileReader.close();
        scannerObject.close();
        return word; // Returns the selected word.

    }


    static String RandomArrangedWord(String selectedWord) {
        /**

         This is the random arranged word function. This function is a static function with a string value as the return
         value. The function has the parameter String selectedWord. The selectedWord parameter is the randomly selected word
         from the world list that will be jumbled / mixed up. This function is responsible for taking in the selected word
         from the function read word file and than jumble or mix up the selected word for usage in the game. The function
         follows an algorithm which randomly jumbles up the selected word. The jumbled up word is than returned.

         Parameters: String selectedWord
         Return:  rearranged_word

         */

        Random r = new Random();

        // Assigning the length of the selected word to variable word length
        int wordlength = selectedWord.length();

        // if the word length variable is equal to 2, program continues here
        if (wordlength == 2){
            // selected word is converted to characters and put into an array called selected word char
            char [] selected_word_char = selectedWord.toCharArray();
            // The first character in the array which is selected_word_char[0] is assigned to variable Char FirstCharacter
            char FirstCharacter = selected_word_char[0];

            // The first character is changed to the 2nd character (selected_word_char[1])
            selected_word_char[0] = selected_word_char[1];
            // The 2nd character is changed to the 1st character which is variable FirstCharacter
            selected_word_char[1] = FirstCharacter;

            // The rearranged word is converted back to string's from characters in an array
            String rearranged_word = String.valueOf(selected_word_char);
            // The new rearranged word is returned.
            return rearranged_word;
        }

        // An integer value is randomly generated from 0 to the length of the word. The value is assigned to random_num_1
        int random_num_1 = r.nextInt(wordlength);

        // A 2nd integer value is randomly generated from 0 to the length of the word. The value is assigned to random_num_2
        int random_num_2 = r.nextInt(wordlength);
        // If the 2nd integer value randomly generated is equal to the 1st integer value generated than a new 2nd value will be generated.
        while (random_num_2 == random_num_1) {
            random_num_2 = r.nextInt(wordlength);
        }

        // A 3rd integer value is randomly generated from 0 to the length of the word. The value is assigned to random_num_3
        int random_num_3 = r.nextInt(wordlength);
        // If the 3rd integer value randomly generated is equal to the 1st integer value generated or 2nd integer value generated than a new 3rd value will be generated.
        while ((random_num_3 == random_num_1) || (random_num_3 == random_num_2)){
            random_num_3 = r.nextInt(wordlength);
        }

        // selected word is converted to characters and put into an array called selected word char
        char [] selected_word_char = selectedWord.toCharArray();
        // The first character that's randomly picked in the array is selected_word_char[random_num_1]. This character is assigned to variable Char FirstCharacter
        char FirstCharacter = selected_word_char[random_num_1];
        // The third character that's randomly picked in the array is selected_word_char[random_num_3]. This character is assigned to variable Char ThirdCharacter
        char ThirdCharacter = selected_word_char[random_num_3];

        // The first character randomly generated is changed to the 2nd character randomly generated.
        selected_word_char[random_num_1] = selected_word_char[random_num_2];
        // The second character randomly generated is changed to the first character randomly generated.
        selected_word_char[random_num_2] = FirstCharacter;
        // The 3rd character randomly generated is changed to the first character randomly generated.
        selected_word_char[random_num_3] = selected_word_char[random_num_1];
        // The first character randomly generated is changed to the third character randomly generated.
        selected_word_char[random_num_1] = ThirdCharacter;

        // The rearranged word is converted back to string's from characters in an array
        String rearranged_word = String.valueOf(selected_word_char);
        // The new rearranged word is returned.
        return rearranged_word;

    }
}
