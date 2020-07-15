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
        String x = "2";

        System.out.printf(x);
    }
}
