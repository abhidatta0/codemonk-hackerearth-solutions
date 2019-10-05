/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/
*/
import java.io.*;
public class Practice {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int count=0;
       String[] str=br.readLine().split(" ");
       int l=Integer.parseInt(str[0]);
       int r=Integer.parseInt(str[1]);
       int k=Integer.parseInt(str[2]);
      for(int i=l;i<=r;i++){
          if(i%k == 0){
            count++;
          }
      }
      System.out.println(count);
    }
}

