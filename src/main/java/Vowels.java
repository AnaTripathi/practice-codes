import java.util.Scanner;

public class Vowels {
    public static void findVowels(String str){
        String vow = "";
        for(int i = 0;i<str.length();i++){
         if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
             Character ch = str.charAt(i);
             vow = vow+ch;
         }
        }
        System.out.println("vowels in a given string are: "+ vow);
        System.out.println("Number of vowels are: "+ vow.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string");
        String inputString = sc.nextLine();
        findVowels(inputString);
    }
}
