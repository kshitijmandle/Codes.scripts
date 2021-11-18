import java.util.*;
class hello{
   public static void main(String[] args) {
       System.out.println("Hello World");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number for pyramid");
       int n = sc.nextInt();
       for(int i=0;i<n;i++){
          for(int j=0;j<i;j++){
              System.out.print("*_");
          }
          System.out.println();
       }
   }
    
}