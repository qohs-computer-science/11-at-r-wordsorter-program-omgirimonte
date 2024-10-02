package WordSorterManager;
import java.util.ArrayList;
import java.util.Scanner;
public class WordSorterManager {
    public ArrayList<String>[] list; 
    public String letters;

    @SuppressWarnings("unchecked")
    public WordSorterManager(){
        list = new ArrayList[26];
        for (int x = 0; x<list.length; x++){
            list[x]= new ArrayList<String>();
        }
        letters = "abcdefghijklmnopqrstuvwxyz";
    }

    public void add(String word){
        list[letters.indexOf(word.toLowerCase().charAt(0))].add(word.toLowerCase());
    }

    public void getInput (Scanner input){
        boolean run = true;
        while (run){
            System.out.println("Choose an option from below:");
            System.out.println("(1) Print out all words starting with a specific letter");
            System.out.println("(2) Print out all words ");
            System.out.println("(3) Print out the total number of unique words  ");
            System.out.println("(4) Search and determine if a word is in the article  ");
            System.out.println("(5) Remove a word from the data structure  ");
            System.out.println("(6) Exit  ");
            int ans = input.nextInt();

            if (ans==1){
                System.out.print("Please enter your specefic letter: ");
                char letter = input.nextLine().charAt(0);
                for (String word : list [letters.indexOf(letter)])
                    System.out.println(word);
            }
            else if(ans==2){
                
            }
            else if(ans==3){
                
            }
            else if(ans==4){
                
            }
            else if(ans==5){
                System.out.println("What is the word you want removed? ");
                String rem = input.nextLine();
                //ArrayList<String>[] temporary = ;
            }
            else if(ans==6){
                run = false;
            }
        }
    }
}
