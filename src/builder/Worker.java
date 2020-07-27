package builder;

/**
 * 工人
 */
public class Worker extends Bublic{

    private House house;

    Worker(){
        house = new House();
    }

    @Override
    Worker mkColor(String color) {
        house.setColor(color);
        return this;
    }

    @Override
    Worker mkStyle(String style) {
        house.setStyle(style);
        return this;
    }

    @Override
    Worker mkFloor(String floor) {
        house.setFloor(floor);
        return this;
    }

    @Override
    House getHouse() {
        return this.house;
    }

}
