public class HKDCurrency implements Obsever {
    public static double hkd = 4.0209 ;


    @Override
    public void update(int val) {

    }

    @Override
    public void country() {
        System.out.println("Hong Kong Current currency 1 HKD:"+hkd+" THAI");
    }


}
