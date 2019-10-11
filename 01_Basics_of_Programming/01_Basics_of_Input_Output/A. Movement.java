/*https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/a-movement-1/
*/
import java.io.*;
public class Practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int steps=0;
        while(x>0){
            if(x>=5){
                x=x-5;
                steps++;
            }
            else if(x>=4){
                x=x-4;
                steps++;
            }
            else if(x>=3){
                x=x-3;
                steps++;
            }
            else if(x>=2){
                x=x-2;
                steps++;
            }
            else if(x>=1){
                x=x-1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}

