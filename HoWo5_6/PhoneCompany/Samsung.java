package HoWo5_6.PhoneCompany;

import HoWo5_6.Phone.Smartphone;

public class Samsung extends Smartphone {

    public Samsung(String model, double sizeDisplay, int akb, String typeOfAntenna, String osVerion, int price) {
        super(model, sizeDisplay, akb, price, ("Android " + osVerion) , typeOfAntenna);
    }

    @Override
    public String toString() {
        return "Samsung "+ super.toString();
    }


}
