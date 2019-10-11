/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/sum-it-if-you-can-4867f851/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        long l=Long.parseLong(br.readLine());
        int i=10;
        int ans=0;
        while(l>0){
            ans += (l%10)*i;
            l=l/10;
            i--;
        }
        if(ans % 11 == 0){
            System.out.println("Legal ISBN");
        }
        else{
            System.out.println("Illegal ISBN");
        }
    }
}

