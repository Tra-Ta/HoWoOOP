package HoWo5_6.PhoneCompany;

import HoWo5_6.Phone.Smartphone;

public class Vivo extends Smartphone{

    public Vivo(String model, double sizeDisplay, int akb, String typeOfAntenna, String osVerion, int price) {
        super(model, sizeDisplay, akb, price, ("Android " + osVerion) , typeOfAntenna);
    }

    @Override
    public String toString() {
        return "Vivo "+super.toString();
    }

}
