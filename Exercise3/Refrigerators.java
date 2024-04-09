public class Refrigerators extends MainClass{
    public String type,enClass,convCap,freezeCap;

    public Refrigerators(){
        
    } 
    public Refrigerators(String modelsname,String manufacturer,int code,int year,double price,String type, String enClass, String convCap, String freezeCap){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.enClass = enClass;
        this.convCap = convCap;
        this.freezeCap = freezeCap;
    }
    public void settype(String type){
        this.type=type;
    }

    public void setenClass(String enClass){
        this.enClass=enClass;
    }

    public void setconvCap(String convCap){
        this.convCap=convCap;
    }

    public void setfreezeCap(String freezeCap){
        this.freezeCap=freezeCap;
    }

    public String gettype(){
        return this.type;
    }

    public String getenClass(){
        return this.enClass;
    }

    public String getconvCap(){
        return this.convCap;
    }

    public String getfreezeCap(){
        return this.freezeCap;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.10))+" euro"+"\n\nCharacteristics of this Refrigerators are :"+"\nType : "+gettype()+"\nEnergy class : "+getenClass()+"\nConvCap : "+getconvCap()+"\nFreezeCap : "+getfreezeCap()+"\n------------------------";
    }
}