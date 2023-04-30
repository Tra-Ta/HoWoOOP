from Phone import Phone
from ShopService import PhoneMag
from ShopService import PrintMassage


class Shipment:
    @staticmethod
    def changingTheBalance( phone:Phone,  mag:PhoneMag):
        priceList = mag.getPriceList()
        if mag.getMoney() >= phone.getPrice():
            mag.setMoney(mag.getMoney()-phone.getPrice())

            phone.setPrice(phone.getPrice()*1.1)
            priceList.append(phone)
            mag.setPriceList(priceList)
        else:
            PrintMassage.printMassage("Недостаточно средств!")