public class CNYCurrency implements Obsever {
    public static double cny = 4.6583 ;//จีน


    @Override
    public void country() {
        System.out.println("Saudi Arabia Current currency 1 CNY:"+cny+" THAI");
    }

    @Override
    public void update(int val) {

    }

}
