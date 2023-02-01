// has nothing to do with the package
package TestClass1;

/**
 *
 * author: Chris
 */
//comment for fetch and merge
// added comment for pull
import java.util.Scanner;
public class ReverseWord {
    public static void main(String[] args){
        /*char[] myArray = new char[7];
        myArray[0]='s';
        myArray[1]='t';
        myArray[2]='u';
        myArray[3]='d';
        myArray[4]='e';
        myArray[5]='n';
        myArray[6]='t';
        
        
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i]);
        }*/
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter a word");
        String word = myObj.nextLine();
        // This is how you create an array according to user input
        char[] myLetters = new char[word.length()];
        for(int i = myLetters.length-1; i >= 0; i--){
            myLetters[i] = word.charAt(i);
            System.out.print(myLetters[i]);
        }//end of loop
        
        
    }//end of main
}//end of class
