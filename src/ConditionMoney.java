import java.util.Scanner;
public class ConditionMoney {

    static Scanner Select_string = new Scanner(System.in);//string
    static Scanner Select_Int = new Scanner(System.in);//int
    static double sum = 0;

    public static void Select(){
        String select;
        char index;
        do{
        System.out.println("Y/y : แลกเงิน \n" +
                            "N/n : ออก");
        System.out.print("your is : ");
        select = Select_string.nextLine();
        index = select.charAt(0);
        }while (index!= 'Y' && index!= 'y' && index!= 'N' && index!= 'n');
            if(index == 'N' || index == 'n'){
                System.out.println("2");
            }else if (index == 'Y' || index == 'y'){
                ExchangeMoney();
            }
    }

    public static void ExchangeMoney(){
        int select_Country;
        Bottonmore bottonmore = new Bottonmore();
        Push push = new Push();
        USA usa= new USA(bottonmore);
        Japan japan= new Japan(bottonmore);
        Brunei_Darussalam brunei_darussalam= new Brunei_Darussalam(bottonmore);
        China china= new China(bottonmore);
        ERU eru= new ERU(bottonmore);
        UK uk= new UK(bottonmore);
        Hong_Kong hong_kong= new Hong_Kong(bottonmore);
        Malaysia malaysia= new Malaysia(bottonmore);
        Saudi_Arabia saudi_arabia= new Saudi_Arabia(bottonmore);
        Singapore singapore=new Singapore(bottonmore);

        push.setSelectbotton(0,usa);
        push.setSelectbotton(1,japan);
        push.setSelectbotton(2,brunei_darussalam);
        push.setSelectbotton(3,china);
        push.setSelectbotton(4,eru);
        push.setSelectbotton(5,uk);
        push.setSelectbotton(6,hong_kong);
        push.setSelectbotton(7,malaysia);
        push.setSelectbotton(8,saudi_arabia);
        push.setSelectbotton(9,singapore);
        do{
            push.print();

            System.out.print("your is number: ");
            select_Country = Select_Int.nextInt();
        }while (select_Country != 1 && select_Country != 2 && select_Country !=3 &&
                select_Country != 4 && select_Country != 5 && select_Country !=6 &&
                select_Country != 7 && select_Country != 7 && select_Country !=9 &&
                select_Country != 10);
        //push.bottonwashed(select_Country);
        if(select_Country == 1){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 31.7018; // 1 USD:31.7018 THAI
            System.out.println("เงินที่ได้ " + sum + "USD");

        }else if (select_Country == 2){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 28.1865 *  100; // ไม่แน่ใจ 100 JPY:28.1865 THAI
            System.out.println("เงินที่ได้ " + sum + "JPY");

        }else if (select_Country == 3){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 4.0209; // 1 BND:4.0209 THAI
            System.out.println("เงินที่ได้ " + sum + "BND");

        }else if (select_Country == 4){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 4.6583; // 1 CNY:4.6583 THAI
            System.out.println("เงินที่ได้ " + sum + "CNY");

        }else if (select_Country == 5){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 35.3385; // 1 EUR:35.3385 THAI
            System.out.println("เงินที่ได้ " + sum + "EUR");

        }else if (select_Country == 6){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 41.1675; // 1 GBP:41.1675 THAI
            System.out.println("เงินที่ได้ " + sum + "GBP");

        }else if (select_Country == 7){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 4.0209; // 1 HKD:4.0209 THAI
            System.out.println("เงินที่ได้ " + sum + "HKD");

        }else if (select_Country == 8){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 7.5732; // 1 MYR:7.5732 THAI
            System.out.println("เงินที่ได้ " + sum + "MYR");

        }else if (select_Country == 9){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 8.4768; // 1 SAR:8.4768 THAI
            System.out.println("เงินที่ได้ " + sum + "SAR");

        }else if (select_Country == 10){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 23.1446 * 100; // 100 SGD:23.1446 THAI
            System.out.println("เงินที่ได้ " + sum + "SGD");

        }

}
}