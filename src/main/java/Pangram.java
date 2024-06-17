import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

    public static void inputString(String[] arrOfSent){
        for(int i = 0;i<arrOfSent.length;i++){
            String str = arrOfSent[i].toLowerCase();
            isPangram(str);
        }
    }

    public static void isPangram(String str){
        Set <Character> set = new HashSet<>();
        for(char ch: str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                set.add(ch);
            }
        }
        if(set.size() == 26){
            System.out.println(str + " : This is panagram");
        }
        else {
            System.out.println(str + " : This is not a panagram");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings to check");
        int numOfSentence = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your string");
        String [] arrOfSentences = new String [numOfSentence];
        String s;
        for(int i =0;i< numOfSentence;i++){
            s = sc.nextLine();
           arrOfSentences[i] = s;
        }
        inputString(arrOfSentences);
    }
}
