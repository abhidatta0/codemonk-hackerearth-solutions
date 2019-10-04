/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/
*/
import java.io.*;
public class Practice {

    public static long modulo(int[] ar){
        long answer=1;
        for(int i=0;i<ar.length;i++){
            answer=(answer * ar[i])%(long)(Math.pow(10,9)+7);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] ar=new int[N];
        String[] sArr=br.readLine().split(" ");
        for(int i=0;i<ar.length;i++){
          ar[i]=Integer.parseInt(sArr[i]);
        }
        System.out.println(modulo(ar));
    }
}

