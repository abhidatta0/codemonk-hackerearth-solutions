/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/i-am-easy/
*/
import java.io.*;
class Practice{
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=1;i<=10;i++){
            System.out.println(N*i);
        }

    }
}