public class Orders {
    public int ordercode,Discount,pieces;
    public String type,modelsname,FullnameNPhonenumber,date,Arrivaldate,situation;
    public  double price;

    public Orders(){

    }
    
    public Orders(String type,int ordercode,String modelsname,String FullnameNPhonenumber,String date,String Arrivaldate,double price,int Discount,String situation,int pieces){
        this.type=type;
        this.ordercode=ordercode;
        this.modelsname=modelsname;
        this.FullnameNPhonenumber=FullnameNPhonenumber;
        this.date=date;
        this.Arrivaldate=Arrivaldate;
        this.price=price;
        this.Discount=Discount;
        this.situation=situation;
        this.pieces=pieces;
    }
    public String gettype(){
        return this.type;
    }

    public void settype(String type){
        this.type=type;
    }
    public void setpieces(int pieces){
        this.pieces=pieces;
    }

    public void setordercode(int ordercode){
        this.ordercode=ordercode;
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

    public void setArrivaldate(String Arrivaldate){
        this.Arrivaldate=Arrivaldate;
    }

    public void setprice(double price){
        this.price=price;
    }

    public void setDiscount(int Discount){
        this.Discount=Discount;
    }

    public void setsituation(String situation){
        this.situation=situation;
    }

    public int getDiscount(){
        return this.Discount;
    }
    public int getpieces(){
        return this.pieces;
    }

    public int getordercode(){
        return this.ordercode;
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

    public String getArrivaldate(){
        return this.Arrivaldate;
    }

    public double getprice(){
        return this.price;
    }

    public String getsituation(){
        return this.situation;
    }

    public String toString(){
        if (Discount==25){
            return "\n\nYour device has been ordered"+"\nType : "+gettype()+"\nOrdercode :"+getordercode()+"\nmodelsname :"+getmodelsname()+"\nFullname and Phone number : "+getFullnameNPhonenumber() +"\nDate : "+getdate()+"\nArrival date : "+getArrivaldate()+"\nInitial Price : "+getprice()+" euro \nPrice after discount : "+(getprice() - getprice()*0.25)+" euro"+"\nSituation : "+getsituation()+"\nPieces : "+getpieces();
        }else if (Discount==20){
            return "\n\nYour device has been ordered"+"\nType : "+gettype()+"\nOrdercode :"+getordercode()+"\nmodelsname :"+getmodelsname()+"\nFullname and Phone number : "+getFullnameNPhonenumber() +"\nDate : "+getdate()+"\nArrival date : "+getArrivaldate()+"\nInitial Price : "+getprice()+" euro \nPrice after discount : "+(getprice() - getprice()*0.20)+" euro"+"\nSituation : "+getsituation()+"\nPieces : "+getpieces();
        }else
            return "\n\nYour device has been ordered"+"\nType : "+gettype()+"\nOrdercode :"+getordercode()+"\nmodelsname :"+getmodelsname()+"\nFullname and Phone number : "+getFullnameNPhonenumber() +"\nDate : "+getdate()+"\nArrival date : "+getArrivaldate()+"\nInitial Price : "+getprice()+" euro \nPrice after discount : "+(getprice() - getprice()*0.10)+" euro"+"\nSituation : "+getsituation()+"\nPieces : "+getpieces();
    }


}