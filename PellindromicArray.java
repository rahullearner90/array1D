class PellindromicArray{
    public static void main(String args[]){
        int count=0;
        int[] array={1,2,3,4,5,4,3,2,1};
        int n=array.length-1;
        int flag=0;


        for(int i=0; i<=n/2; i++){

            if(array[i] != array[n-i]){
                flag=1;
                System.out.println("It is not pellindromic array.");
                if(flag==1){
                    break;
                }
            }else{
                count++;
                if(count==n/2){
                    System.out.println("It is pellindromic array.");
                }
            }

        }
    }
}