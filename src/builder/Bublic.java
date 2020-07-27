package builder;

/**
 * 生成器
 */
public abstract class Bublic {

    private Worker worker;

    abstract Worker mkColor(String color);

    abstract Worker mkStyle(String style);

    abstract Worker mkFloor(String floor);

    abstract House getHouse();
}
