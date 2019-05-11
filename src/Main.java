import java.util.Scanner;
public class Main {

    static CountryMoney countryMoney = new CountryMoney();
    static ConditionMoney conditionMoney = new ConditionMoney();
    public static void main(String[] args) {

        countryMoney.Updatecountry();
        conditionMoney.Select();
    }

    public static void Show (){
        USDCurrency USD = new USDCurrency();
        JPYCurrency JPY = new JPYCurrency();
        BNDCurrency BNC = new BNDCurrency();
        CNYCurrency CNY = new CNYCurrency();
        EURCurrency EUR = new EURCurrency();
        GBPCurrency GBP = new GBPCurrency();
        HKDCurrency HKD = new HKDCurrency();
        MYRCurrency MYR = new MYRCurrency();
        SARCurrency SAR = new SARCurrency();
        SGDCurrency SGD = new SGDCurrency();

        countryMoney.register(USD);
        countryMoney.register(JPY);
        countryMoney.register(BNC);
        countryMoney.register(CNY);
        countryMoney.register(EUR);
        countryMoney.register(GBP);
        countryMoney.register(HKD);
        countryMoney.register(MYR);
        countryMoney.register(SAR);
        countryMoney.register(SGD);

        countryMoney.notifyObserver();
        Scanner Select_Int = new Scanner(System.in);
        int select;
        do{
            System.out.println("[1] : ทำต่อ \n" +
                    "[2] : ออกจากระบบ"
            );
            System.out.print("กรุณาใส่หมายเลขที่คุณต้องการ : ");
            select = Select_Int.nextInt();

        }while  (select != 1 && select != 2);
        if(select ==1){
            conditionMoney.Select();
        }else if (select == 2){
            System.out.println("------------ขอบคุณที่ใช่บริการ------------");
        }
    }
}
