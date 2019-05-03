public class GBPCurrency implements Obsever {
   public static double gbp = 41.1675;
    @Override
    public void update(int val) {

    }

    @Override
    public void country() {
        System.out.println("UK Current currency 1 GBP:"+gbp+" THAI");
    }

}
