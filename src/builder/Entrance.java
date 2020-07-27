package builder;

/**
 * 入口
 */
public class Entrance {
    public static void main(String[] args) {
        House house = new Worker().getHouse();

        System.out.println(house.toString());

        House house1 = new Worker().mkColor("red").mkFloor("o").getHouse();

        System.out.println(house1.toString());

        House house2 = new House.myBublic().mkColor("red").getHouse();

        System.out.println(house2);
    }
}
