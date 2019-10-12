/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        while(true){
            int num=Integer.parseInt(br.readLine());
            if(num == 42){
                break;
            }
            System.out.println(num);
        }
    }
}

