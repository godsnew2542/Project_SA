import java.text.DecimalFormat;
import java.util.Scanner;
public class ConditionMoney {

    static Scanner Select_Int = new Scanner(System.in);//int


    public static void Select(){
        int select;
        do{
        System.out.println("[1] : แลกเงิน \n" +
                            "[2] : ดูค่าเงินตลาดโลก \n" +
                            "[3] : ออกจากระบบ");
        System.out.print("กรุณาใส่หมายเลขที่คุณต้องการ : ");
        select = Select_Int.nextInt();

        }while  (select != 1 && select != 2 && select!=3);
            if(select ==1){
                Bank();
            }else if (select == 2){
                Main main = new Main();
                main.Show();
            }
            else{
                System.out.println("ออก");
            }
    }

    public  static void Bank(){
        int bank;

        do{
            System.out.println("[1] : ธนาคารกรุงศรี \n" +
                    "[2] : ธนาคารไทยพานิชณ์\n" +
                    "[3] : ธนาคารกรุงเทพฯ\n" +
                    "[4] : ดูค่าเงินตลาดโลก \n" +
                    "[5] : ย้อนกลับ ");
            System.out.print("กรุณาใส่หมายเลขที่คุณต้องการ : ");
            bank = Select_Int.nextInt();

        }while  (bank != 1 && bank != 2 && bank!=3 && bank!=4 && bank!=5);
        if(bank ==1){
            BankKrung_Sri bankKrung_sri =new BankKrung_Sri();
            bankKrung_sri.ExchangeMoney();

        }else if (bank == 2){
           BankSCB bankSCB = new BankSCB();
           bankSCB.ExchangeMoney();
        }else if (bank == 3){
            Bank_BKK bank_bkk =new Bank_BKK();
            bank_bkk.ExchangeMoney();

        }else if (bank == 4){
            Main main = new Main();
            main.Show();

        }else{
            Select();
        }

    }
}