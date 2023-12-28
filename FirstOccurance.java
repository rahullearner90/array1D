import java.util.Scanner;
public class FirstOccurance {
    public static int  firstOccurance(int[] arr, int target){
        int result=0;
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }


        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.print("Enter the elements of the array :");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the target :");
        int target=sc.nextInt();

        int result=firstOccurance(arr, target);

        if(result==0){
            System.out.println(target+" is not found in array.");
        }else{
            System.out.println(target+"'s first occurance found at index no "+result);
        }
    }
}
