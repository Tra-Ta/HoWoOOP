package HoWo5_6;

import HoWo5_6.PhoneCompany.Apple;
import HoWo5_6.ShopService.DisplayService;
import HoWo5_6.ShopService.PhoneMag;
import HoWo5_6.ShopService.Sell;
import HoWo5_6.ShopService.Shipment;

public class main {
    public static void main(String[] args) {
        PhoneMag mag = new PhoneMag(100000.0);
        Apple iPhone = new Apple("iPhone 14", 17, 5800, "5g", "14.0", 78000);
        Shipment tranz1 = new Shipment();

        tranz1.changingTheBalance(iPhone, mag);
        DisplayService.pintePriceList(mag);
        Sell tranz2 = new Sell();
        tranz2.changingTheBalance(iPhone, mag);
        DisplayService.pintePriceList(mag);
    }
}
