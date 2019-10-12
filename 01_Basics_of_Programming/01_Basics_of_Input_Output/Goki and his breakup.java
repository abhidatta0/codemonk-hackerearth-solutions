/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/tds-and-his-breakup/
*/

import java.io.*;
class Practice{
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int X=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int num=Integer.parseInt(br.readLine());
            if(num >= X){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
