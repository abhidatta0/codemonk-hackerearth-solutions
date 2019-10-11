/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/teddy-and-tweety/
*/
import java.io.*;
class Practice{
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        if(num%3 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
