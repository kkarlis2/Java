public class TV extends MainClass{
    public  String type,ports;
    public  String dimension,resolution;
    
    public TV() {

    }
    
        
    public TV(String modelsname,String manufacturer,int code,int year,double price,String type, String dimension, String resolution, String ports){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.dimension = dimension;
        this.resolution = resolution;
        this.ports = ports;
        this.price=price;
    }

    public void settype(String type){
        this.type=type;
    }

    public void setdimension(String dimension){
        this.dimension=dimension;
    }

    public void setresolution(String resolution){
        this.resolution=resolution;
    }

    public void setports(String ports){
        this.ports=ports;
    }


    public String gettype(){
        return this.type;
    }

    public String getdimension(){
        return this.dimension;
    }

    public String getresolution(){
        return this.resolution;
    }

    public String getports(){
        return this.ports;
    }

    public double getprice(){
        return this.price;
    }

    public String toString(){
        return super.toString()+"\nPrice after dicount :"+(getprice()-(getprice()*0.25))+" euro"+"\n\nCharacteristics of this TV are : "+"\nType : "+gettype()+"\nDimension : "+getdimension()+"\nResolution : "+getresolution()+"\nPorts : "+getports()+"\n------------------------";
    }
}