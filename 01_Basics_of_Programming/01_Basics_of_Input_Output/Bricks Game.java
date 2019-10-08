/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/bricks-game-5140869d/
*/
import java.io.*;
public class Practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int bricks=Integer.parseInt(br.readLine());
       int i=1;
       while(bricks > 0 ){
           int p=i;
           bricks=bricks-p;
           if(bricks <= 0 ){
               System.out.println("Patlu");
               return;
           }
           int m=i*2;
           bricks=bricks-m;
           if(bricks <= 0){
               System.out.println("Motu");
               return;
           }
           i++;
       }
    }
}

