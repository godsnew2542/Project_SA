public class Push {
    private Selectbotton selectbottons[];
    public Push(){
        this.selectbottons = new  Selectbotton[10];
        Selectbotton bottons = new BottonS();
        for(int i =0;i< selectbottons.length; i++){
            this.selectbottons[i]=bottons;
        }
    }
    public void setSelectbotton(int slot,Selectbotton selectbotton){
        this.selectbottons[slot]=selectbotton;
    }
    public void bottonwashed(int slot){
        this.selectbottons[slot-1].execute();
    }
    public void print(){
        System.out.println("คุณอยากแลกเงินจาก เงินไทย เป็นเงินประเทศอะไร");
        for (int i =0;i<selectbottons.length;i++){
            System.out.println("[Botton "+(i+1)+"]"+selectbottons[i].getClass().getName());
        }
    }
}