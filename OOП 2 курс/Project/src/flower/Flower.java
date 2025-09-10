package models;

public class Flower {
    String name;
    float price;
    int fresh;//свежесть от 1 до 3




    public  Flower(String name,float price,int fresh){

        this.name=name;
        this.price=price;
        this.fresh=fresh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getFresh() {
        return fresh;
    }


    @Override
    public String toString() {
        return "Flower" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", fresh='" + fresh + '\'';
    }
}
