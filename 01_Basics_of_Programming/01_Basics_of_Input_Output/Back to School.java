/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/back-to-school-1/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        String[] input=br.readLine().split(" ");
        int a=Integer.parseInt(input[0]);
        int b=Integer.parseInt(input[1]);
        int c=Integer.parseInt(input[2]);
        int res=Math.max(a,Math.max(b,c));
        System.out.println(res);
    }
}

