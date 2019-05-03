public class EURCurrency  implements Obsever {
   public static double eur = 35.3385;


    @Override
    public void update() {

    }

    @Override
    public void country() {
        System.out.println("ERU Current currency 1 eur:"+eur+" THAI");
    }

}
