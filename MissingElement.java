public class MissingElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        int n=arr.length;
        int sum=0;

        // sum of natural numbers
        int sum_of_natural=((n+1)*(n+2))/2;
        System.out.println("Sum of natural no.: "+sum_of_natural);

        // sum of current element
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        System.out.println("value of sum: "+sum);
        int missingElement=sum_of_natural-sum;
        System.out.println("Missing Element is: "+missingElement);
    }
}
