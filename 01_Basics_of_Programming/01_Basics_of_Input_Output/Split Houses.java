/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/
*/
import java.io.*;
public class Practice {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(br.readLine());
       String newgrid="";
       for(int i=0;i<N;i++){
           char c=(char)br.read();
           if(c == '.'){
               newgrid +='B';
           }
           if(c == 'H'){
               if(i==0){
                   newgrid +='H';
               }
               if(i > 0){
                 if(newgrid.charAt(i-1) == 'H'){
                     System.out.println("NO");
                     return;
                 }
                 else{
                     newgrid +='H';
                 }
               }
           }
       }
        System.out.println("YES");
        System.out.println(newgrid);
    }
}

