/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/print-the-numbers/
*/
import java.io.*;
public class Practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String[] input=br.readLine().split(" ");
        for(int i=0;i<N;i++){
            System.out.println(Integer.parseInt(input[i]));
        }
    }
}

