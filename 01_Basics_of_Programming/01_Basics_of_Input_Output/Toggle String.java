import java.io.*;
public class Practice {

    public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String str=br.readLine();
      String newString="";
      for(int i=0;i<str.length();i++){
          if(str.charAt(i) >=97 && str.charAt(i) <=122){
              newString +=(char) (str.charAt(i)-32);
          }
          if(str.charAt(i) >=65 && str.charAt(i) <=90){
              newString +=(char) (str.charAt(i)+32);
          }
      }
      System.out.println(newString);
    }
}
