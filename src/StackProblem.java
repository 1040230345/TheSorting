import java.util.Stack;

/**
 * 栈问题
 * 2020-7-15 14:39:12
 * jackson
 */
public class StackProblem {
    public static void main(String[] args) {
//        char[] s = new char[]{'(', ')', '{', '}', '[', ']'};
        char[] s = new char[]{'{','[','(',')','(',')',']','}'};
        System.out.println(myStack(s));
    }

    public static boolean myStack(char[] s){
        Stack stack = new Stack();

        for(int x =0; x<s.length;x++){

            //判断是左括号或者是右括号
            if(isLeft(s[x])){
                stack.push(s[x]);
            }else {
                if (stack.empty()) {
                    return false;
                }
                char p = (char) stack.pop();
                if (isPair(p, s[x])) {
                    continue;
                }else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
    //是左括号
    private static boolean isLeft(char c){
        if (c=='('||c=='['||c=='{'){
            return true;
        }
        return false;
    }
    //判断左右括号是否匹配
    private static boolean isPair(char p, char curr) {
        if ((p == '{' && curr == '}') || (p == '[' && curr == ']') || (p == '(' && curr == ')' )) {
            return true;
        } else {
            return false;
        }
    }
}
