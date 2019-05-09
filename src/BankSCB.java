import java.text.DecimalFormat;
import java.util.Scanner;

public class BankSCB implements BankIF {

    static Scanner Select_Int = new Scanner(System.in);//int
    static double sum = 0;

    public void ExchangeMoney(){
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

            System.out.print("กรุณาใส่หมายเลขทประเทศที่คุณต้องการ : ");
            select_Country = Select_Int.nextInt();
        }while (select_Country != 1 && select_Country != 2 && select_Country !=3 &&
                select_Country != 4 && select_Country != 5 && select_Country !=6 &&
                select_Country != 7 && select_Country != 7 && select_Country !=9 &&
                select_Country != 10);

        if(select_Country == 1){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 31.37;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " USD");

        }else if (select_Country == 2){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 0.28275;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " JPY");

        }else if (select_Country == 3){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 22.400;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " BND");

        }else if (select_Country == 4){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 4.26250;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " CNY");

        }else if (select_Country == 5){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 34.94875;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " EUR");

        }else if (select_Country == 6){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 40.3825;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " GBP");

        }else if (select_Country == 7){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 3.9072;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " HKD");

        }else if (select_Country == 8){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 6.98000;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " MYR");

        }else if (select_Country == 9){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 6.96000;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " SAR");

        }else if (select_Country == 10){

            System.out.print("จำนวนเงินที่ต้องการของแลก : ");
            int sum1 = Select_Int.nextInt();
            sum = sum1 / 22.83875;
            System.out.println("เงินที่ได้ " + new DecimalFormat("0.000").format(sum) + " SGD");

        }

        ConditionMoney conditionMoney = new ConditionMoney();
        Scanner Select_Int = new Scanner(System.in);
        int select;
        do{
            System.out.println("[1] : ทำรายการอื่นๆ \n" +
                    "[2] : ออกจากระบบ");
            System.out.print("กรุณาใส่หมายเลขที่คุณต้องการ : ");
            select = Select_Int.nextInt();
        }while  (select != 1 && select != 2);
        if(select ==1){
            conditionMoney.Select();
        }else if (select == 2){
            System.out.println("ขอบคุณที่ใช่บริการ");
        }
    }
}
