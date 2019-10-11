/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/friends-relationship-1/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());
        for(int j =0;j<T;j++){
            int N=Integer.parseInt(br.readLine());
            for(int i=N;i>0;i--){
                for(int star=1;star<=N-i+1;star++){
                    System.out.print("*");
                }
                for(int hash=1;hash<=2*i-2;hash++){
                    System.out.print("#");
                }
                for(int star=1;star<=N-i+1;star++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

