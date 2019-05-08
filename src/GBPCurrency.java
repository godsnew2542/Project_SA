public class GBPCurrency implements Obsever {
   public static double gbp = 41.1675;

    @Override
    public void country() {
        Singleton number = Singleton.getss();
        number.assSingleton();
        System.out.println("UK Current currency 1 GBP:"+gbp+" THAI");
    }

}
