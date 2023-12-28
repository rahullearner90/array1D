import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements want to store :");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements you want to store :");
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target value from array :");
        int x=sc.nextInt();

        for(int i=0; i<n; i++){
            if(x==arr[i]){
                System.out.println("value of x is :"+x+" found at index :"+i+" which is "+arr[i]);
            }
        }
    }
}
