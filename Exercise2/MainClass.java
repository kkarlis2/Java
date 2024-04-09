public class MainClass {
    public int code,year;
    public String modelsname,manufacturer;
    public double price;

    public MainClass(String modelsname,String manufacturer,int code,int year,double price){
        this.modelsname = modelsname;
        this.manufacturer = manufacturer;
        this.code = code;
		this.year = year;
        this.price=price;
    }

    
    
    public String getModel(){
        return modelsname;
    }
    
    public String getMan(){
        return manufacturer;
    }
    
    public int getCode(){
        return code;
    }
    
    public int getYear(){
        return year;
    }
    
    public double getPrice(){
        return price;
    }

    public String toString(){
        return "------------------------"+"\nProduct's information : "+"\ncode : "+getCode()+"\nmodelsname : "+getModel() + "\nyear of creator : "+getYear() + "\nManufacturer : "+getMan()+"\nPrice : "+getPrice()+" euro"+"\n------------------------";
    }
}