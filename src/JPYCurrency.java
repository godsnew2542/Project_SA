public class JPYCurrency  implements Obsever{

    public static double jpy = 28.1865 ;

    @Override
    public void country() {
        Singleton number = Singleton.getss();
        number.assSingleton();
        System.out.println("Japan Current currency 100 JPY:"+jpy+" THAI");
    }

}

