/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/ladderophilia/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int steps=Integer.parseInt(br.readLine());
        System.out.println("*   *");
        System.out.println("*   *");
        for(int i=0;i<steps;i++){
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
        }
    }
}

