public class BNDVD extends MainClass{
    public String type,resolution,format;
        
    public BNDVD(String modelsname,String manufacturer,int code,int year,double price,String type, String resolution, String format){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.resolution = resolution;
        this.format = format;
    }

    public String gettype(){
        return type;
    }

    public String getresolution(){
        return resolution;
    }

    public String getformat(){
        return format;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.25))+" euro"+"\nCharacteristics  of Video player are :"+"\nType : "+gettype()+"\nResolution : "+getresolution()+"\nFormat : "+getformat();
    }
}