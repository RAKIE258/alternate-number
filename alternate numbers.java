// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Input  : {1, 2, 3, 4, 5, 6, 7}
//          Output : {7, 1, 6, 2, 5, 3, 4}
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int iter=0,s=0,e=arr.length - 1;
        if(n%2==0){
        while(iter!=n/2){
            System.out.print(arr[e]+" ");
            e--;
            System.out.print(arr[s]+" ");
            s++;
            iter++;
        }
        }
        else{
             while(iter!=n/2){
            System.out.print(arr[e]+" ");
            e--;
            System.out.print(arr[s]+" ");
            s++;
            iter++;
            
        }
        System.out.print(arr[arr.length/2]);
    }
    }
}