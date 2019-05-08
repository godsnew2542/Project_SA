public class MYRCurrency implements Obsever {
    public static double myr = 7.5732 ;

    @Override
    public void country() {
        Singleton number = Singleton.getss();
        number.assSingleton();
        System.out.println("Malaysia Current currency 1 MYR:"+myr+" THAI");
    }

}
