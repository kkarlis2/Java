public class Refrigerators extends MainClass{
    public String type,enClass,convCap,freezeCap;
        
    public Refrigerators(String modelsname,String manufacturer,int code,int year,double price,String type, String enClass, String convCap, String freezeCap){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.enClass = enClass;
        this.convCap = convCap;
        this.freezeCap = freezeCap;
    }

    public String gettype(){
        return type;
    }

    public String getenClass(){
        return enClass;
    }

    public String getconvCap(){
        return convCap;
    }

    public String getfreezeCap(){
        return freezeCap;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.10))+" euro"+"\nCharacteristics of this Refrigerators are :"+"\nType : "+gettype()+"\nEnergy class : "+getenClass()+"\nConvCap : "+getconvCap()+"\nFreezeCap : "+getfreezeCap();
    }
}