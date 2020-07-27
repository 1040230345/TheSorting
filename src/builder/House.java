package builder;

/**
 * 房子模型
 */
public class House {

    private String color = "green";//颜色
    private String style = "European";//款式
    private String floor = "3";//几楼


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }

    public static class myBublic{

        private House house;

        myBublic(){
            house = new House();
        }

        myBublic mkColor(String color) {
            house.setColor(color);
            return this;
        }

        myBublic mkStyle(String style) {
            house.setStyle(style);
            return this;
        }

        myBublic mkFloor(String floor) {
            house.setFloor(floor);
            return this;
        }

        House getHouse() {
            return this.house;
        }
    }
}
