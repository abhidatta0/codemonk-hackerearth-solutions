/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/conject-it/
*/
import java.io.*;
import java.math.BigInteger;
class Practice{
    public static void main(String args[]) throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      for(int i=0;i<n;i++){
          //We just have to take BigInteger as input
           String s=br.readLine();
           BigInteger num=new BigInteger(s);
           System.out.println("YES");
      }
    }
}

