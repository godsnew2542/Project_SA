public class Main {
    public static void main(String[] args) {
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
        CountryMoney countryMoney = new CountryMoney();

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

        countryMoney.Updatecountry();

        ConditionMoney conditionMoney = new ConditionMoney();
        conditionMoney.Select();
    }
}
