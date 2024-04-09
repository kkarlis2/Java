public class TV extends MainClass{
    public  String type,ports;
    public  String dimension,resolution;
    
    
    
        
    public TV(String modelsname,String manufacturer,int code,int year,double price,String type, String dimension, String resolution, String ports){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.dimension = dimension;
        this.resolution = resolution;
        this.ports = ports;
        this.price=price;
    }

    public String gettype(){
        return type;
    }

    public String getdimension(){
        return dimension;
    }

    public String getresolution(){
        return resolution;
    }

    public String getports(){
        return ports;
    }

    public double getprice(){
        return price;
    }

    public String toString(){
        return super.toString()+"\nPrice after dicount :"+(getprice()-(getprice()*0.25))+" euro"+"\nCharacteristics of this TV are : "+"\nType : "+gettype()+"\nDimension : "+getdimension()+"\nResolution : "+getresolution()+"\nPorts : "+getports();
    }
}