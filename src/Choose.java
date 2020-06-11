/**
 * 选择排序
 * 2020年06月11日15:07:05
 */
public class Choose {
    public static void main(String[] args) {
        Integer[] array = {50,2,46,32,7,16,90,34,22,56,13,8,24};

        for (Integer x = 0; x<array.length;x++){
            Integer p = array[x];
            Integer z = array[x];
            Integer c = x;
            for(Integer y = x;y<array.length-1;y++){
                if(z>array[y+1]){
                    z = array[y+1];
                    c = y+1;
                }
            }
            array[x] = array[c];
            array[c] = p;
        }

        for (Integer x:array) {
            System.out.print(x+"，");
        }
    }
}
