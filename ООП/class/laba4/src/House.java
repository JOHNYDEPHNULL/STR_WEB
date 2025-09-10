import java.util.ArrayList;
public class Main {
    private int id;
    private int apartmentNumber;
    private double area;
    private int floor;
    private int numOfRooms;
    private String street;
    private String buildingType;
    private int yearsInUse;

    public Main(int id, int apartmentNumber, double area, int floor, int numOfRooms, String street, String buildingType, int yearsInUse) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numOfRooms = numOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.yearsInUse = yearsInUse;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public double getArea() {
        return area;
    }

    public static void main(String[] args) {
        ArrayList<Main> houseList = new ArrayList<>();
        houseList.add(new Main(1, 101, 80.0, 1, 2, "Main Street", "Apartment", 5));
        houseList.add(new Main(2, 202, 120.0, 3, 4, "Broadway", "Condo", 10));
        houseList.add(new Main(3, 305, 100.0, 2, 3, "Park Avenue", "Townhouse", 8));
        houseList.add(new Main(4, 305, 100.0, 4, 3, "Park Avenue", "Townhouse", 8));
        houseList.add(new Main(5, 305, 100.0, 3, 3, "Park Avenue", "Townhouse", 8));

        // список квартир, имеющих заданное число комнат
        int numOfRooms = 2;
        for (Main house : houseList) {
            if (house.getNumOfRooms() == numOfRooms) {
                System.out.println("Apartment with " + numOfRooms + " room(s): " + "id" + " "+ house.getId());
            }
        }

        // список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке
        int numOfRooms2 =3;
        int minFloor = 1;
        int maxFloor = 4;
        for (Main house : houseList) {
            if (house.getNumOfRooms() == numOfRooms2 && house.getFloor() >= minFloor && house.getFloor() <= maxFloor) {
                System.out.println("Apartment with " + numOfRooms2 + " room(s) on floor " + minFloor + "-" + maxFloor +": " + "id" + " " + house.getId());
            }


        }

        // список квартир, имеющих площадь, превосходящую заданную
        double minArea = 90.0;
        for (Main house : houseList) {
            if (house.getArea() > minArea) {
                System.out.println("Apartment with area greater than " + minArea + ": " + "id" + " " + house.getId());
            }
        }
    }

    public int getId() {
        return id;
    }
}

