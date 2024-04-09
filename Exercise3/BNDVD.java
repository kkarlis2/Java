public class BNDVD extends MainClass{
    public String type,resolution,format;
        
    public BNDVD() {
        
    }
    public BNDVD(String modelsname,String manufacturer,int code,int year,double price,String type, String resolution, String format){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.resolution = resolution;
        this.format = format;
    }

    public void settype(String type){
        this.type=type;
    }

    public void setresolution(String resolution){
        this.resolution=resolution;
    }

    public void setformat(String format){
        this.format=format;
    }
    public String gettype(){
        return this.type;
    }

    public String getresolution(){
        return this.resolution;
    }

    public String getformat(){
        return this.format;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.25))+" euro"+"\n\nCharacteristics  of Video player are :"+"\nType : "+gettype()+"\nResolution : "+getresolution()+"\nFormat : "+getformat()+"\n------------------------";
    }
}