/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/two-strings-4/
*/
import java.io.*;
import java.util.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int T=Integer.parseInt(br.readLine());
        for(int j=0;j<T;j++){
            String[] input=br.readLine().split(" ");
            String str1=input[0];
            String str2=input[1];
            HashMap<Character,Integer> map1=new HashMap<>();
            for(int i=0;i<str1.length();i++){
                if(map1.containsKey(str1.charAt(i))){
                    map1.put(str1.charAt(i),1+map1.get(str1.charAt(i)));
                }
                else{
                    map1.put(str1.charAt(i),1);
                }
            }
            boolean flag=true;
            for(int i=0;i<str2.length();i++){
                if(map1.containsKey(str2.charAt(i)) && map1.get(str2.charAt(i)) >0){
                    map1.put(str2.charAt(i),map1.get(str2.charAt(i))-1);
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(!flag){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}

