import java.util.ArrayList;

public class CountryMoney {

    ArrayList<Obsever> observers = new ArrayList<>();

    public void register(Obsever obs){
        this.observers.add(obs);
    }

    public void unregister(Obsever obs){

        this.observers.remove(obs);
    }

    public void notifyObserver(){
        for (Obsever obs: this.observers){
            obs.country();
        }
    }

    public void Updatecountry(){
        System.out.println("************** W E L C O M E *************");
        System.out.println("****** Kingsman Currency Exchange ********");
    }
}