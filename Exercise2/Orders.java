public class Orders {
    public int ordercode,Discount;
    public String modelsname,FullnameNPhonenumber,date,Arrivaldate,situation;
    public  double price;

    public Orders(int ordercode,String modelsname,String FullnameNPhonenumber,String date,String Arrivaldate,double price,int Discount,String situation){
        this.ordercode=ordercode;
        this.modelsname=modelsname;
        this.FullnameNPhonenumber=FullnameNPhonenumber;
        this.date=date;
        this.Arrivaldate=Arrivaldate;
        this.price=price;
        this.Discount=Discount;
        this.situation=situation;
    }

    public int getordercode(){
        return ordercode;
    }

    public String getmodelsname(){
        return modelsname;
    }

    public String getFullnameNPhonenumber(){
        return FullnameNPhonenumber;
    }

    public String getdate(){
        return date;
    }

    public String getArrivaldate(){
        return Arrivaldate;
    }

    public double getprice(){
        return price;
    }

    public String getsituation(){
        return situation;
    }

    public String toString(){
        if (Discount==25){
            return "\n\nYour device has been ordered"+"\nOrdercode :"+getordercode()+"\nmodelsname :"+getmodelsname()+"\nFullname and Phone number : "+getFullnameNPhonenumber() +"\nDate : "+getdate()+"\nArrival date : "+getArrivaldate()+"\nInitial Price : "+getprice()+" euro \nPrice after discount : "+(getprice() - getprice()*0.25)+" euro"+"\nSituation : "+getsituation();
        }else if (Discount==20){
            return "\n\nYour device has been ordered"+"\nOrdercode :"+getordercode()+"\nmodelsname :"+getmodelsname()+"\nFullname and Phone number : "+getFullnameNPhonenumber() +"\nDate : "+getdate()+"\nArrival date : "+getArrivaldate()+"\nInitial Price : "+getprice()+" euro \nPrice after discount : "+(getprice() - getprice()*0.20)+" euro"+"\nSituation : "+getsituation();
        }else
            return "\n\nYour device has been ordered"+"\nOrdercode :"+getordercode()+"\nmodelsname :"+getmodelsname()+"\nFullname and Phone number : "+getFullnameNPhonenumber() +"\nDate : "+getdate()+"\nArrival date : "+getArrivaldate()+"\nInitial Price : "+getprice()+" euro \nPrice after discount : "+(getprice() - getprice()*0.10)+" euro"+"\nSituation : "+getsituation();
    }


}