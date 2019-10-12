/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/aman-mrsharma/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int T=Integer.parseInt(br.readLine());
        int count=0;
        for(int j=0;j<T;j++){
            String[] input=br.readLine().split(" ");
            double radius=Double.parseDouble(input[0]);
            int horlicks=Integer.parseInt(input[1]);
            //floating point will cause problem ,so multiply both side by 7
            if(700*horlicks >= 2*22*radius){
                count++;
            }
        }
        System.out.println(count);
    }
}

