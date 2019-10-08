/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/lift-queries/
*/

import java.io.*;
public class Practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int N=Integer.parseInt(br.readLine());
       int posA=0;
       int posB=7;
       for(int i=1;i<=N;i++){
           int floor=Integer.parseInt(br.readLine());
           int pos1=Math.abs(floor - posA);
           int pos2=Math.abs(floor - posB);
           if(pos1 <= pos2){
               posA=floor;
               System.out.println("A");
           }
           else {
               posB=floor;
               System.out.println("B");
           }
       }
    }
}

