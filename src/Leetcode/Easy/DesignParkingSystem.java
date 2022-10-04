package Leetcode.Easy;

public class DesignParkingSystem {

    int big, medium, small;

    public static void main(String[] args) {

        DesignParkingSystem parkingSystem = new DesignParkingSystem(1, 1, 0);
        parkingSystem.addCar(1);
        parkingSystem.addCar(1);

        System.out.println(parkingSystem.big);
    }

    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.big == 0) return false;
                this.big--;
                return true;
            case 2:
                if (this.medium == 0) return false;
                this.medium--;
                return true;
            case 3:
                if (this.small == 0) return false;
                this.small--;
                return true;
            default:
                return false;
        }
    }
}

