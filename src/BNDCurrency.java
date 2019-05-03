public class BNDCurrency implements Obsever {

    public static double bnd = 4.0209 ;

    @Override
    public void country() {
        System.out.println("Brunei Darussalam Current currency 1 BND:"+bnd+" THAI");
    }

    @Override
    public void update(int val) {

    }
}
