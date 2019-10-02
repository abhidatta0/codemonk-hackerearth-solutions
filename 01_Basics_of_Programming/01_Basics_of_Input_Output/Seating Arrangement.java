/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seating-arrangement-1/
*/
import java.io.*;
public class Practice {
    public static void seatNumber(int seat){
      int rem=seat%12;
      String pos="";
      int num=0;
      if(rem == 0 || rem == 1  || rem == 6 || rem == 7){
         if(rem == 0){
             num=seat-11;
         }
         else if(rem == 1){
             num=seat+11;
         }
         else if(rem == 6){
             num=seat+1;
         }
         else {
            num = seat-1;
         }
         pos="WS";
      }
      else if(rem == 2 || rem == 5 || rem == 8 || rem == 11){
          if(rem == 2){
             num=seat+9;
         }
         else if(rem == 5){
             num=seat+3;
         }
         else if(rem == 8){
             num=seat-3;
          }
          else{
              num=seat -9;
          }
         pos="MS";
      }
      else if(rem == 3 || rem == 4 || rem == 9 || rem == 10){
         if(rem == 3){
             num=seat+7;
         }
         else if(rem == 4){
             num=seat+5;
         }
         else if(rem == 9){
             num=seat-5;
         }
         else{
             num=seat-7;
         }
         pos="AS";
      }
      System.out.println(num+" "+pos);
    }
    public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int T=Integer.parseInt(br.readLine());
      for(int i=0;i<T;i++){
          int seat=Integer.parseInt(br.readLine());
          seatNumber(seat);
      }
    }
}
