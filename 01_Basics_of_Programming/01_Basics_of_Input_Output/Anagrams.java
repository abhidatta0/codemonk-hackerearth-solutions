/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/anagrams-651/
*/
import java.io.*;
public class Practice {
    public static void show(String s1,String s2){
     int[] table1=new int[128];
     int[] table2=new int[128];

     for(int i=0;i<s1.length();i++){
       table1[s1.charAt(i)]++;
     }
     for(int i=0;i<s2.length();i++){
       table2[s2.charAt(i)]++;
     }
     int count =0;
     for(int i=0;i<128;i++){
       count += Math.abs(table1[i] -table2[i]);
     }
     System.out.println(count);
    }
    public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int N=Integer.parseInt(br.readLine());
      for(int i=0;i<N;i++){
          String s1=br.readLine();
          String s2=br.readLine();
          show(s1,s2);
      }
    }
}

