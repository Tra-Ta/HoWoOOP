package HoWo5_6.ShopService;

import java.util.ArrayList;

import HoWo5_6.Phone.Phone;

public class Sell implements IntrfTransaction{

    @Override
    public void changingTheBalance(Phone phone, PhoneMag mag) {
        ArrayList<Phone> priceList = mag.getPriceList();
        for (Phone phoneL : priceList) {
            if (phoneL.equals(phone)){
                priceList.remove(phoneL);
                mag.setPriceList(priceList);
                mag.setMoney(mag.getMoney()+phone.getPrice());
                break;
            }
        }
    }
}
