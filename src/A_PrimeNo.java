public class A_PrimeNo {
    public static void main(String[] args) {
        System.out.println(firstApproach(7));
        System.out.println(SecondApproach(7));

    }
    public static boolean firstApproach(int x){
        if(x == 1 || x == 2 || x == 3) return true;
        int count = 0;
        for(int i = 1;i<x;i++){
            if(count > 1) return false;
            if(x % i == 0) count++;
        }
        return true;
    }
    public static boolean SecondApproach(int x){
        if(x == 1 || x == 2 || x == 3) return true;
        for(int i = 2 ;i < Math.sqrt(x);i++ ){
            if(x % i == 0) return false;
        }
        return true;
    }

}
