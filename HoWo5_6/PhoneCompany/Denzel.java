package HoWo5_6.PhoneCompany;

import HoWo5_6.Phone.Phone;

public class Denzel extends Phone{



    public Denzel(String model, double sizeDisplay, int akb, int price) {
        super(model, sizeDisplay, akb, price);
    }

    @Override
    public void charge() {
        System.out.println("опять эта рухлядь разрядилась");
    }

    @Override
    public String toString() {
        return "Denzel ["+ super.toString()+"]";
    }


}
