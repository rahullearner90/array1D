public class DuplicateEle {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5,6,6,6};
        int n=arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Element is: "+arr[j]+" At index "+i+","+j);
                }
            }
        }
    }
}
