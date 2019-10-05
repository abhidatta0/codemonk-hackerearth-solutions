/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-factorial/
*/
import java.io.*;
public class Practice {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int num=Integer.parseInt(br.readLine());
       int fact=1;
       for(int i=1;i<=num;i++){
           fact=fact*i;
       }
        System.out.println(fact);
    }
}

