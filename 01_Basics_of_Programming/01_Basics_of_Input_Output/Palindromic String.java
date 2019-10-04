/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/
*/
import java.io.*;
public class Practice {

    public static boolean isPalindrome(String str){
      if(str.length() == 0 || str.length() ==1){
          return true;
      }
      if(str.charAt(0) != str.charAt(str.length()-1)){
          return false;
      }
      return isPalindrome(str.substring(1,str.length()-1));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String answer=isPalindrome(str) ? "YES" : "NO";
        System.out.println(answer);
    }
}

