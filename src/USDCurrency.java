public class USDCurrency implements Obsever {
   public static double usd = 31.7018; //ค่าเงิน สหรัฐอเมริกา

    @Override
    public void country() {
        System.out.println("USA Current currency 1 USD:"+usd+" THAI");
    }

    @Override
    public void update(int val) {

    }
}
