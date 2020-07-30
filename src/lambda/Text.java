package lambda;

public class Text {

    public static void main(String[] args) {

        Mylambda mylambda = (a,b)->{
            return a*b;
        };

        System.out.println(mylambda.get(1,4));
    }
}
