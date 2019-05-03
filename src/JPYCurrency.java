public class JPYCurrency  implements Obsever{

    public static double jpy = 28.1865 ;


    @Override
    public void update() {

    }

    @Override
    public void country() {
        System.out.println("Japan Current currency 100 JPY:"+jpy+" THAI");
    }

}

