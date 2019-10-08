/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/e-maze-in-1aa4e2ac/
*/
import java.io.*;
public class Practice {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s=br.readLine();
       int x=0;
       int y=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i) == 'L'){
               x=x-1;
           }
           else if(s.charAt(i) == 'R'){
               x=x+1;
           }
           else if(s.charAt(i) == 'U'){
               y=y+1;
           }
           else{
               y=y-1;
           }
       }
        System.out.println(x+" "+y);

    }
}

