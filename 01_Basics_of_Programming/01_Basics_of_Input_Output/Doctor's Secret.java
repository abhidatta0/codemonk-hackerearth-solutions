/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/doctors-secret/
*/
import java.io.*;
public class Practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input=br.readLine().split(" ");
        int length=Integer.parseInt(input[0]);
        int pages=Integer.parseInt(input[1]);
        if(length <=23 && (pages>=500 && pages<=1000)){
            System.out.println("Take Medicine");
        }
        else{
            System.out.println("Don't take Medicine");
        }
    }
}

