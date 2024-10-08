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
        }// end for 
        letters = "abcdefghijklmnopqrstuvwxyz";
    }// end constructor

    public void add(String word){
        list[letters.indexOf(word.toLowerCase().charAt(0))].add(word.toLowerCase());
    }

    public void getInput (){
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run){
            //ask users questions on what options they want 
            System.out.println("Choose an option from below:");
            System.out.println("(1) Print out all words starting with a specific letter");
            System.out.println("(2) Print out all words ");
            System.out.println("(3) Print out the total number of unique words  ");
            System.out.println("(4) Search and determine if a word is in the article  ");
            System.out.println("(5) Remove a word from the data structure  ");
            System.out.println("(6) Exit  ");
            int ans = input.nextInt();
            input.nextLine();
            if (ans==1){
                // uses a for loop to print all specefic words 
                System.out.print("Please enter your specefic letter: ");
                char letter = input.nextLine().charAt(0);
                for (String word : list [letters.indexOf(letter)])
                    System.out.println(word);
            }// end 1
            else if(ans==2){
                // uses a loop again to print all the words 
                int total = 0;
                // uses loop to add the length of all the lists together 
                for (int x = 0; x<list.length;x++) {
                    total = total + list[x].size();
                }// end loop
                if (total>0){
                    for(int x = 0; x<list.length;x++){
                        System.out.println("List for letter \""+ letters.charAt(x)+"\""+": ");
                        for(int i =0; i<list[x].size(); i++){
                            System.out.println(list[x].get(i));
                        }// end loop
                    }// end for each
                
                }// end if 
                else{
                    System.out.println("Empty List");
                }
            }// end 2
            else if(ans==3){
                int total = 0;
                // uses loop to add the length of all the lists together 
                for (int x = 0; x<list.length;x++) {
                    total = total + list[x].size();
                }// end loop
                System.out.println("Total of unique words: "+total);
            }// end 3
            else if(ans==4){
                System.out.println("What is the word you want to find? ");
                String word = input.nextLine();
                boolean found = false;
                ArrayList<String> cur = list[letters.indexOf(word.toLowerCase().charAt(0))];
                for(int x = 0; x<cur.size();x++){
                        if (cur.get(x).equals(word)){
                            found=true;
                            break;
                        }// end if statement 
                        
                }// end loop
                // if statement that tells user if it is in it
                if (found){
                    System.out.println("The word was found in the list!");
                }
                else{
                    System.out.println("The word was NOT found in the list!");
                }// end if else
            }//end 4
            else if(ans==5){
                // asks user for what word they want removed a and uses a loop to find it and remove it 
                System.out.println("What is the word you want removed? ");
                String rem = input.nextLine();
                boolean found = false;
                ArrayList<String> temporary = list[letters.indexOf(rem.toLowerCase().charAt(0))];
                for(int x = 0; x<temporary.size();x++){
                        if (temporary.get(x).equals(rem)){
                            temporary.remove(x);
                            x--;
                            found=true;
                            //break;
                        }// end loop
                }
                // if statement that tells user if the word was rmeoved or not 
                if (found){
                    System.out.println("The word was found in the list and removed!");
                }
                else{
                    System.out.println("The word was NOT found in the list!");
                }// end if else
            }// end 5
            else if(ans==6){
                // changes boolean value to stop running code
                run = false;
            }// end 6
        }//end while loop
        input.close();
    }//end add method 
}// end class
