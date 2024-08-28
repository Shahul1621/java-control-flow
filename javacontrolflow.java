import java.util.*;
public class javacontrolflow {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        if(n==0){
            System.out.println("zero");
        }
        if(n<0){
            System.out.println("negative");
        }
        if(n>0){
            System.out.println("positive");
            switch(n){
                case 1: System.out.print("sunday");
                break;
                case 2: System.out.print("monday");
                break;
                case 3: System.out.print("tuesday");
                break;
                case 4: System.out.println("wednesday");
                break;
                case 5: System.out.print("thursday");
                break;
                case 6: System.out.print("friday");
                break;
                case 7: System.out.print("saturday");
                break;
            }
            for(int j=1; j<=n; j++){
                System.out.println(j);
            }
            while(n!=0){
                System.out.println(n);
                n=n-1;
            }
            do{
                System.out.print("1 2 3");
            }while(n!=0);
        }
    }
    
    
}
