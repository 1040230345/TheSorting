import java.util.HashMap;

/**
 * 测试类
 */
public class test {

    /**
     * 测试方法中的final全局是否共享(调用不到)
     */

    public static void myFinal(){
        final String x ="1";
    }

    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE/10;

        System.out.println(isPalindrome(121));
        HashMap map  = new HashMap();

        System.out.println( java.util.UUID.randomUUID());
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y =x;
        int num = 0;
        while(x!=0){
            int pop = x%10;
            x/=10;
            if(pop==0){
                return false;
            }
            num = num*10+pop;
        }
        if(num==y){
            return true;
        }
        return false;
    }
}
