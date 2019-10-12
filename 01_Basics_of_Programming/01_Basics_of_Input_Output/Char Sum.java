/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/char-sum-2d3a6ab5/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        String str=br.readLine();
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum += str.charAt(i)-97+1;
        }
        System.out.println(sum);
    }
}

