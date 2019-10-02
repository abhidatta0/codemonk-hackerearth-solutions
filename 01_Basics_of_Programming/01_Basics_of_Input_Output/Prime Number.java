/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/
*/
import java.io.*;
public class Practice {
    //function to check if prime or not
    public static boolean isPrime(int n){
      for(int i=2;i<n;i++){
          if(n%i == 0){
              return false;
          }
      }
      return true;
    }
    public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int N=Integer.parseInt(br.readLine());

      for(int i=2;i<=N;i++){
        boolean p=isPrime(i);
        if(p){
            System.out.print(i+" ");
        }
      }
    }
}
