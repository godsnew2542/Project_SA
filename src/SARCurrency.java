public class SARCurrency implements Obsever {
    public static double sar = 8.4768 ;// ซาอุดิอาราเบีย


    @Override
    public void update() {

    }

    @Override
    public void country() {
        System.out.println("Saudi Arabia Current currency 1 SAR:"+sar+" THAI");
    }

}
