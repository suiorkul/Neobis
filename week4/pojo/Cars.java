package week3;

public class Cars {
    private  long id;
    private String name;
    private int price;
    private String color;
    private String typeOfColor;


    public Cars(String name, int price, String color, String typeOfColor) {

        this.name = name;
        this.price = price;
        this.color = color;
        this.typeOfColor = typeOfColor;
    }
    public Cars(){}


    public long getId() {
        return id;
    }

    public Cars setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Cars setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Cars setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Cars setColor(String color) {
        this.color = color;
        return this;
    }

    public String getTypeOfColor() {
        return typeOfColor;
    }

    public Cars setTypeOfColor(String typeOfColor) {
        this.typeOfColor = typeOfColor;
        return this;
    }





}
