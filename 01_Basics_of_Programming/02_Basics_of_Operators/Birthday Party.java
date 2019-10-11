/*https://www.hackerearth.com/practice/basic-programming/operators/basics-of-operators/practice-problems/algorithm/birthday-party-12/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String[] input=br.readLine().split(" ");
            int friends=Integer.parseInt(input[0]);
            int choco=Integer.parseInt(input[1]);
            if(choco % friends == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

