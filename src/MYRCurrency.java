public class MYRCurrency implements Obsever {
    public static double myr = 7.5732 ;


    @Override
    public void update(int val) {

    }

    @Override
    public void country() {
        System.out.println("Malaysia Current currency 1 MYR:"+myr+" THAI");
    }

}
