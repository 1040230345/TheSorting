import java.util.NoSuchElementException;

/**
 * 快慢指针题
 * 2020-7-15 10:33:36
 * jackson
 */

public class HowFastPointer {

    public static void main(String[] args) {
//        //已知基数长度数组x，求中间值
//        int[] x = {1,2,3,4,5,6,7,8,9};
//        //快慢指针
//        int j=0,s=0;
//        for(;s<x.length;j++,s=s+2){
//
//        }
//        System.out.printf(String.valueOf(x[j-1]));
        //========================================================
        /**
         * 然而，数组是没意义的，因为数组知道下标以及有length，使用快慢指针反而更复杂
         *
         * 下面展示链表的快慢指针
         */

        MyLink<Integer> myLink = new MyLink<>();

        myLink.addLink(1);
        myLink.addLink(2);
        myLink.addLink(3);
//        myLink.addLink(4);
//        myLink.addLink(5);

        //快慢指针
        MyLink.Node<Integer> s=myLink.getFirstNode(),e=myLink.getFirstNode();
        while (e!=null){
            if(e.next==null||e.next.next==null){
                break;
            }
            e=e.next.next;
            s=s.next;
        }
        System.out.println(s.item);
        /**
         * 然而 现在的java linkedList 也有size以及用下标获取值，他的计算方式采用了二分法，效率提升。
         *
         * 本题只能拿来练练数据结构了
         */
    }

}

class MyLink<E>{
    private MyLink.Node<E> last;
    private MyLink.Node<E> header;

    public MyLink.Node<E> getLast(){
        return this.getLast();
    }

    public boolean addLink(E e){
        final MyLink.Node<E> l = last;
        final MyLink.Node<E> newNode = new MyLink.Node<E>(e,null);
        last = newNode;

        if (l == null)
            header = newNode;
        else
            l.next = newNode;
        return true;
    }

    public static class Node<E> {
        E item;
        MyLink.Node<E> next;
        Node(E element, MyLink.Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    public MyLink.Node<E> getFirstNode() {
        final MyLink.Node<E> f = header;
        if (f == null)
            throw new NoSuchElementException();
        return f;
    }

}

