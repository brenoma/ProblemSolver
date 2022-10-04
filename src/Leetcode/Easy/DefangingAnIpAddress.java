package Leetcode.Easy;

public class DefangingAnIpAddress {
    public static void main(String[] args) {
        String param = "127.0.0.1";

        defangIpAddr(param);
    }

    public static String defangIpAddr(String address) {
        address = address.replace(".", "[.]");

        System.out.println(address);

        return address;
    }
}
