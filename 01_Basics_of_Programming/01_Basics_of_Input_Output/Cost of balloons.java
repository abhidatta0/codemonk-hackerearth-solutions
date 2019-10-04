import java.io.*;
/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/mojtaba-prepares-contest-29b2a044/
*/
public class Practice {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int T=Integer.parseInt(br.readLine());

       for(int i=0;i<T;i++){
           String[]  cost=br.readLine().split(" ");
           int green_cost=Integer.parseInt(cost[0]);
           int purple_cost=Integer.parseInt(cost[1]);
           int N=Integer.parseInt(br.readLine());
           int test1=0,test2=0;
           for(int j=0;j<N;j++){
               String[] input=br.readLine().split(" ");
               test1 += Integer.parseInt(input[0]);
               test2 +=Integer.parseInt(input[1]);
           }
           System.out.println(test1);
           System.out.println(test2);
           int ans=Math.min(test1,test2)*Math.max(green_cost,purple_cost)+
           Math.max(test1,test2)*Math.min(green_cost,purple_cost);
           System.out.println(ans);
       }
    }
}

