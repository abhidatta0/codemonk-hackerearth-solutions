/* https://www.hackerearth.com/practice/basic-programming/operators/basics-of-operators/practice-problems/algorithm/going-to-office-e2ef3feb/
*/
import java.io.*;
class Practice{
    public static void main(String args[]) throws Exception {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        long distance=Integer.parseInt(br.readLine());
        String[] online=br.readLine().split(" ");
        String[] classic=br.readLine().split(" ");
        long Oc=Long.parseLong(online[0]);
        long Of=Long.parseLong(online[1]);
        long Od=Long.parseLong(online[2]);
        long Cs=Long.parseLong(classic[0]);
        long Cb=Long.parseLong(classic[1]);
        long Cm=Long.parseLong(classic[2]);
        long Cd=Long.parseLong(classic[3]);
        long online_cost,classic_cost;
        online_cost=Oc+(distance-Of)*Od;
        classic_cost=Cb+(distance/Cs)*Cm+distance*Cd;
        if(online_cost <= classic_cost){
            System.out.println("Online Taxi");
        }
        else{
            System.out.println("Classic Taxi");
        }
    }
}

