public class ReversalOfArray {
    public static void main(String args[]){
        int[] array={2,4,6,8,10,12,14};
        int n=array.length;

        for (int i : array) {
            System.out.print(i+",");
        }

        System.out.println();

        for(int i=0; i<n/2; i++){
            int temp=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;
        }

        for (int i : array) {
            System.out.print(i+",");
        }
    }
}
