public class SARCurrency implements Obsever {
    public static double sar = 8.4768 ;// ซาอุดิอาราเบีย

    @Override
    public void country() {
        Singleton number = Singleton.getss();
        number.assSingleton();
        System.out.println("Saudi Arabia Current currency 1 SAR:"+sar+" THAI");
    }

}
