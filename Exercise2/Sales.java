public class Sales {
    public int salescode,discount;
    public String modelsname,FullnameNPhonenumber,date;
    public double price;

    public  Sales(int salescode,String modelsname,String FullnameNPhonenumber,String date,double price,int discount){
        this.salescode=salescode;
        this.modelsname=modelsname;
        this.FullnameNPhonenumber=FullnameNPhonenumber;
        this.date=date;
        this.price=price;
        this.discount=discount;
    }


    public String toString(){
        if (discount==25){
            return "Your purchase..."+"\n Code of sale : "+salescode+"\nModelsname : "+modelsname+"\nFullname and Phone number : "+FullnameNPhonenumber+"\n date : "+date+"\nPrice after discount is: "+(price - price*0.25)+" euro";
        }
        else if (discount==10){
            return "Your purchase..."+"\n Code of sale : "+salescode+"\nModelsname : "+modelsname+"\nFullname and Phone number : "+FullnameNPhonenumber+"\n date : "+date+"\nPrice after discount is: "+(price - price*0.10)+" euro";
        }
        else 
            return "Your purchase..."+"\n Code of sale : "+salescode+"\nModelsname : "+modelsname+"\nFullname and Phone number : "+FullnameNPhonenumber+"\n date : "+date+"\nPrice after discount is: "+(price - price*0.20)+" euro";
        
    }
}