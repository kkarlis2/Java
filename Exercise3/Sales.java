public class Sales {
    public int pieces,salescode,discount;
    public String type,modelsname,FullnameNPhonenumber,date;
    public double price;
    
    public Sales(){
        
    }
    public  Sales(String type,int salescode,String modelsname,String FullnameNPhonenumber,String date,double price,int discount,int pieces){
        this.type=type;
        this.salescode=salescode;
        this.modelsname=modelsname;
        this.FullnameNPhonenumber=FullnameNPhonenumber;
        this.date=date;
        this.price=(price-(price*(discount/100)));
        this.discount=discount;
        this.pieces=pieces;
    }
    public void setpieces(int pieces){
        this.pieces=pieces;
    }
    public int getpieces(){
        return this.pieces;
    }
    public void settype(String type){
        this.type=type;
    }
    public String gettype(){
        return this.type;
    }
    public void setsalescode(int salescode){
        this.salescode=salescode;
    }
    public void setmodelsname(String modelsname){
        this.modelsname=modelsname;
    }
    public void setFullnameNPhonenumber(String FullnameNPhonenumber){
        this.FullnameNPhonenumber=FullnameNPhonenumber;
    }
    public void setdate(String date){
        this.date=date;
    }
    public void setprice(double price){
        this.price=(price-(price*(discount/100)));
    }
    public void setdiscount(int discount){
        this.discount=discount;
    }
    public int getsalescode(){
        return this.salescode;
    }
    public String getmodelsname(){
        return this.modelsname;
    }
    public String getFullnameNPhonenumber(){
        return this.FullnameNPhonenumber;
    }
    public String getdate(){
        return this.date;
    }
    public double getprice(){
        return this.price;
    }
    public int getdiscount(){
        return this.discount;
    }

    public String toString(){
        if (discount==25){
            return "Your purchase..."+"\nType :"+gettype()+"\nCode of sale : "+getsalescode()+"\nModelsname : "+getmodelsname()+"\nFullname and Phone number : "+getFullnameNPhonenumber()+"\ndate : "+getdate()+"\nPieces :"+getpieces()+"\nPrice after discount is: "+getprice()+" euro";
        }
        else if (discount==10){
            return "Your purchase..."+"\nType :"+gettype()+"\nCode of sale : "+getsalescode()+"\nModelsname : "+getmodelsname()+"\nFullname and Phone number : "+getFullnameNPhonenumber()+"\ndate : "+getdate()+"\nPieces :"+getpieces()+"\nPrice after discount is: "+getprice()+" euro";
        }
        else 
            return "Your purchase..."+"\nType :"+gettype()+"\nCode of sale : "+getsalescode()+"\nModelsname : "+getmodelsname()+"\nFullname and Phone number : "+getFullnameNPhonenumber()+"\ndate : "+getdate()+"\nPieces :"+getpieces()+"\nPrice after discount is: "+getprice() +" euro";
        
    }
}