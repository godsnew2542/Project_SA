public class CNYCurrency implements Obsever {

    public static double cny = 4.6583 ;//จีน



    @Override
    public void country() {
        Singleton number = Singleton.getss();
        number.assSingleton();
        System.out.println("China Current currency 1 CNY:"+cny+" THAI");
    }

}
