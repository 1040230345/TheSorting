/**
 * 冒泡排序
 * 2020年06月11日12:05:45
 */
public class TheBubbling {

    public static void main(String[] args) {
        Integer[] array = {50,2,46,32,7,16,90,34,22,56,13,8,24};

        for (Integer i = 0;i<array.length;i++){
            for(Integer y = 0;y<array.length-1-i;y++){
                Integer z = array[y];
                if(z>array[y+1]){
                    array[y] = array[y+1];
                    array[y+1] = z;
                }
            }
        }
        for (Integer x:array) {
            System.out.println(x);
        }
    }

}
