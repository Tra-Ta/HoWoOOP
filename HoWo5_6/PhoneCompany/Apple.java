package HoWo5_6.PhoneCompany;

import HoWo5_6.Phone.Smartphone;

public class Apple extends Smartphone {

    public Apple(String model, double sizeDisplay, int akb, String typeOfAntenna, String osVerion, int price) {
        super(model, sizeDisplay, akb, price, ("iOS " + osVerion) , typeOfAntenna);
    }

    @Override
    public String toString() {
        return "Apple " + super.toString();
    }


}