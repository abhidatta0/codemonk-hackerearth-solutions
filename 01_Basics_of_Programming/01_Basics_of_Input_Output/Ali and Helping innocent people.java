/* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
         BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
         String input=br.readLine();
        String[] inputAr=input.split("");
        int[] numbers=new int[7];
        if(input.charAt(2) == 'A' || input.charAt(2) == 'E'|| input.charAt(2) == 'I'|| input.charAt(2) == 'O' ||input.charAt(2) == 'U' ||input.charAt(2) == 'Y' ){
            System.out.println("invalid");
            return;
        }
        for(int i=0,k=0;i<inputAr.length;i++){
            if(i==2 || i==6){
                continue;
            }
            numbers[k]=Integer.parseInt(inputAr[i]);
            k++;
        }
        boolean flag=true;
        for(int i=0;i<numbers.length-1;i++){
            if((numbers[i]+numbers[i+1])%2 != 0){
                flag=false;
                break;
            }
            if(i==0 || i==3){
                i++;
            }
        }
        if(!flag){
            System.out.println("invalid");
        }
        else{
            System.out.println("valid");
        }
    }
}

