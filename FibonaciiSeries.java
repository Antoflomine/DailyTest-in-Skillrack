import java.util.*;
public class FibonaciiSeries {
    public static void fibo(int n,int max){
        int a=0;
        int b=1;
        if(a==n){
            System.out.print(a+" ");
        }
      
        int f=0;
        for(int i=2;i<max;i++){
            f=a+b;
            if(f==n){
                System.out.print(f+" ");
            }
            a=b;
            b=f;
            
        }
        
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int max=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(max<arr[i]){
		        max=arr[i];
		    }
		}
		for(int i=0;i<n;i++){
		  fibo(arr[i],max);
		}
		
        
	}
}