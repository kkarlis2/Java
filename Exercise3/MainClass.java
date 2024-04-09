public class MainClass {
    public int code,year;
    public String modelsname,manufacturer;
    public double price;

    public MainClass() {

    }
    public MainClass(String modelsname,String manufacturer,int code,int year,double price){
        this.modelsname = modelsname;
        this.manufacturer = manufacturer;
        this.code = code;
		this.year = year;
        this.price=price;
    }

    public void setModel(String modelsname) {
        this.modelsname=modelsname;
    }

    public void setMan(String manufacturer){
        this.manufacturer=manufacturer;
    }

    public void setcode(int code){
        this.code=code;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setprice(double price){
        this.price=price;
    }
    
    public String getModel(){
        return this.modelsname;
    }
    
    public String getMan(){
        return this.manufacturer;
    }
    
    public int getCode(){
        return this.code;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public double getPrice(){
        return this.price;
    }

    public String toString(){
        return "------------------------"+"\nProduct's information : "+"\ncode : "+getCode()+"\nmodelsname : "+getModel() + "\nyear of creator : "+getYear() + "\nManufacturer : "+getMan()+"\nPrice : "+getPrice()+" euro";
    }
}