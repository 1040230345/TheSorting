/**
 * 字符串思考
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);
        System.out.println(str1 == "计算机软件");

        String str2 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str2 == "计算机软件");
        System.out.println(str2.intern() == str2);


        String str3 = new String("计算机软件");
        System.out.println(str3 == "计算机软件");
        System.out.println(str3.intern() == str3);
    }
}
