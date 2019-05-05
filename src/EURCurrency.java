public class EURCurrency implements Obsever {

        public static double eur = 35.3385;

    @Override
    public void update(int val) {

    }

    @Override
    public void country() {
        System.out.println("ERU Current currency 1 EUR:"+eur+" THAI");
    }

}
