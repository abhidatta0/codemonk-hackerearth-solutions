/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/
*/
import java.io.*;

public class Practice {
    public static void validate(int W,int H,int L){
      if(W <L || H <L ){
          System.out.println("UPLOAD ANOTHER");
      }
      else if((W == L && H == L) || W == H){
          System.out.println("ACCEPTED");
      }
      else{
          System.out.println("CROP IT");
      }
    }
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int L=Integer.parseInt(br.readLine());
       int N=Integer.parseInt(br.readLine());
       for(int i=0;i<N;i++){
           String[] dimensions=br.readLine().split(" " );
           int W=Integer.parseInt(dimensions[0]);
           int H=Integer.parseInt(dimensions[1]);
           validate(W,H,L);
       }
    }
}

