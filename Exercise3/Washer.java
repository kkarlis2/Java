public class Washer extends MainClass{
    public String enClass,cap,turns;
    
    public Washer(){

    }
    
    public Washer(String modelsname,String manufacturer,int code,int year,double price,String enClass, String cap, String turns){
        super(modelsname,manufacturer,code,year,price);
        this.enClass = enClass;
        this.cap = cap;
        this.turns = turns;
    }

    public void setenClass(String enClass){
        this.enClass=enClass;
    }

    public void setcap(String cap){
        this.cap=cap;
    }

    public void setturns(String turns){
        this.turns=turns;
    }

    public String getenClass(){
        return this.enClass;
    }

    public String getcap(){
        return this.cap;
    }

    public String getturns(){
        return this.turns;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.10))+" euro"+"\n\nCharacteristics of this Washer are :"+"\nEnergy class : "+getenClass()+"\nCap : "+getcap()+"\nTurns : "+getturns()+"\n------------------------";
    }
}