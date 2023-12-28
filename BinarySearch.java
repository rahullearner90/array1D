import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearchEl(int arr[],int x){
        int result=0;
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }else if (arr[mid]<x) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }

        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store :");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter the elements into the array :");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target elements");
        int x=sc.nextInt();

        int result=BinarySearchEl(arr,x);

        if(result==0){
            System.out.println("Searching elements is not found.");
        }else{
            System.out.println(x+" is found at index "+result);
        }
    }
}
