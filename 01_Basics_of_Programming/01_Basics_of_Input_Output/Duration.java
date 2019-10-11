/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/duration/
*/
import java.io.*;
public class Practice {
    public static void duration(int SH,int SM,int EH,int EM){
       int starting=60*SH+SM;
       int ending=60*EH+EM;
       int hours=(ending-starting)/60;
       int mins=(ending-starting)%60;
        System.out.println(hours+" "+mins);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String[] input=br.readLine().split(" ");
            int SH=Integer.parseInt(input[0]);
            int SM=Integer.parseInt(input[1]);
            int EH=Integer.parseInt(input[2]);
            int EM=Integer.parseInt(input[3]);
            duration(SH,SM,EH,EM);
        }
    }
}

