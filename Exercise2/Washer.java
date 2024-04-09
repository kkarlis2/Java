public class Washer extends MainClass{
    public String enClass,cap,turns;
    
        
    public Washer(String modelsname,String manufacturer,int code,int year,double price,String enClass, String cap, String turns){
        super(modelsname,manufacturer,code,year,price);
        this.enClass = enClass;
        this.cap = cap;
        this.turns = turns;
    }

    public String getenClass(){
        return enClass;
    }

    public String getcap(){
        return cap;
    }

    public String getturns(){
        return turns;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.10))+" euro"+"\nCharacteristics of this Washer are :"+"\nEnergy class : "+getenClass()+"\nCap : "+getcap()+"\nTurns : "+getturns();
    }
}