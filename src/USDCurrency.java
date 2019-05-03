import java.sql.SQLOutput;

public class USDCurrency implements Obsever {
    private static double usd = 31.7018; //ค่าเงิน สหรัฐอเมริกา
    @Override
    public void update() {

    }
    public static void Usd(){
        System.out.println("USA Current currency :"+usd+" /1 Bath THAI");
    }
}
