public class Singleton {
    public static int cont;
    private static Singleton singleton = new Singleton();

    public static Singleton getss(){

        return singleton;
    }

    public Singleton(){

        cont = 0;
    }

    void assSingleton(){
        cont+=1;
        System.out.print(cont + " : ");
        if(cont == 10){
            cont = 0;
        }
    }
}
