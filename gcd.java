public class gcd{
    public static void main(String[] args) {
        System.err.println(gcd(12, 36));
        System.err.println(GCD(12, 36));
         int[] arr = {18, 24, 30};
         System.out.println(GCD_array(arr));
    }
    static int gcd(int a , int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b, a%b);
    }
    static int GCD_array(int [] arr){
        
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result=GCD(result, arr[i]);
        }
        return result;
    }

}