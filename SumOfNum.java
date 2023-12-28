class Demo{
    double sum(int n){
        if(n<=0){
            return 0;
        }
        return n+sum(n-1);
    }
}
public class SumOfNum{
    public static void main(String args[]){
        Demo ref=new Demo();
        double value = ref.sum(5);
        System.out.println(value);
    }
}