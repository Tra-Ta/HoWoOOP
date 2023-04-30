package HoWo5_6.ShopService;

import java.util.ArrayList;

import HoWo5_6.Phone.Phone;

public class Shipment implements IntrfTransaction {

    @Override
    public void changingTheBalance(Phone phone, PhoneMag mag) {
        ArrayList<Phone> priceList = new ArrayList<>();
        priceList = mag.getPriceList();
        if (mag.getMoney() >= phone.getPrice()){
            mag.setMoney(mag.getMoney()-phone.getPrice());

            phone.setPrice(phone.getPrice()*1.1);
            priceList.add(phone);
            mag.setPriceList(priceList);
        }
        else{
            PrintMessage.printMassage("Недостаточно средств!");
        }
    }


}
