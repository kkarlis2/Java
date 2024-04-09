import java.util.*;
import java.io.*;

public class CreateFileApp2 {
    ArrayList item3;
	
	public ArrayList <Object> products = new ArrayList<Object>();
	public CreateFileApp2(ArrayList item3){
        this.item3=item3;
        
    }
	public void CreateList () {
		
		
		for(int i=0;i<item3.size();i++){
            products.add(item3.get(i));
        }
        

    }


    public void CreateFile () {
		
		FileWriter writer = null;

		try	{
			writer = new FileWriter(new File("Sales.txt"));
            writer.write("SALE_LIST"+"\n"+"{"+"\n");
			for (Object product:products)
                if (product instanceof Sales) {
                    if (((Sales)product).getdiscount()==20){
                        writer.write ("\tSALE"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE "+((Sales)product).gettype()+"\n\t"+"\t"+"MODEL "+((Sales)product).getmodelsname()+"\n\t"+"\t"+"SALESCODE "+((Sales)product).getsalescode()+"\n\t"+"\t"+"FULLNAME_AND_NUMBER "+((Sales)product).getFullnameNPhonenumber()+"\n\t"+"\t"+"SALEDATE "+((Sales)product).getdate()+"\n\t"+"\t"+"DISCOUNT "+((Sales)product).getdiscount()+"\n\t"+"\t"+"PRICE_AFTER_DISCOUNT "+(((Sales)product).getprice()-((Sales)product).getprice()*0.20)+"\n\t"+"\t"+"PIECES "+((Sales)product).getpieces()+"\n\t"+"}"+"\n");
                    }else if (((Sales)product).getdiscount()==10){
                        writer.write ("\tSALE"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE "+((Sales)product).gettype()+"\n\t"+"\t"+"MODEL "+((Sales)product).getmodelsname()+"\n\t"+"\t"+"SALESCODE "+((Sales)product).getsalescode()+"\n\t"+"\t"+"FULLNAME_AND_NUMBER "+((Sales)product).getFullnameNPhonenumber()+"\n\t"+"\t"+"SALEDATE "+((Sales)product).getdate()+"\n\t"+"\t"+"DISCOUNT "+((Sales)product).getdiscount()+"\n\t"+"\t"+"PRICE_AFTER_DISCOUNT "+(((Sales)product).getprice()-((Sales)product).getprice()*0.10)+"\n\t"+"\t"+"PIECES "+((Sales)product).getpieces()+"\n\t"+"}"+"\n");
                    }else if (((Sales)product).getdiscount()==25){
                        writer.write ("\tSALE"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE "+((Sales)product).gettype()+"\n\t"+"\t"+"MODEL "+((Sales)product).getmodelsname()+"\n\t"+"\t"+"SALESCODE "+((Sales)product).getsalescode()+"\n\t"+"\t"+"FULLNAME_AND_NUMBER "+((Sales)product).getFullnameNPhonenumber()+"\n\t"+"\t"+"SALEDATE "+((Sales)product).getdate()+"\n\t"+"\t"+"DISCOUNT "+((Sales)product).getdiscount()+"\n\t"+"\t"+"PRICE_AFTER_DISCOUNT "+(((Sales)product).getprice()-((Sales)product).getprice()*0.25)+"\n\t"+"\t"+"PIECES "+((Sales)product).getpieces()+"\n\t"+"}"+"\n");
                    }
                }else if(product instanceof Orders){
                    if (((Orders)product).getDiscount()==20){
                        writer.write ("\tSALE"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE "+((Orders)product).gettype()+"\n\t"+"\t"+"MODEL "+((Orders)product).getmodelsname()+"\n\t"+"\t"+"ORDERCODE-SALESCODE "+((Orders)product).getordercode()+"\n\t"+"\t"+"FULLNAME_AND_NUMBER "+((Orders)product).getFullnameNPhonenumber()+"\n\t"+"\t"+"SALESDATE_DATE "+((Orders)product).getArrivaldate()+"\n\t"+"\t"+"DISCOUNT "+((Orders)product).getDiscount()+"\n\t"+"\t"+"PRICE_AFTER_DISCOUNT "+(((Orders)product).getprice()-((Orders)product).getprice()*0.20)+"\n\t"+"\t"+"PIECES "+((Orders)product).getpieces()+"\n\t"+"}"+"\n");
                    }else if (((Orders)product).getDiscount()==10){
                        writer.write ("\tSALE"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE "+((Orders)product).gettype()+"\n\t"+"\t"+"MODEL "+((Orders)product).getmodelsname()+"\n\t"+"\t"+"ORDERCODE-SALESCODE "+((Orders)product).getordercode()+"\n\t"+"\t"+"FULLNAME_AND_NUMBER "+((Orders)product).getFullnameNPhonenumber()+"\n\t"+"\t"+"SALESDATE_DATE "+((Orders)product).getArrivaldate()+"\n\t"+"\t"+"DISCOUNT "+((Orders)product).getDiscount()+"\n\t"+"\t"+"PRICE_AFTER_DISCOUNT "+(((Orders)product).getprice()-((Orders)product).getprice()*0.10)+"\n\t"+"\t"+"PIECES "+((Orders)product).getpieces()+"\n\t"+"}"+"\n");
                    }else if (((Orders)product).getDiscount()==25){
                        writer.write ("\tSALE"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE "+((Orders)product).gettype()+"\n\t"+"\t"+"MODEL "+((Orders)product).getmodelsname()+"\n\t"+"\t"+"ORDERCODE-SALESCODE "+((Orders)product).getordercode()+"\n\t"+"\t"+"FULLNAME_AND_NUMBER "+((Orders)product).getFullnameNPhonenumber()+"\n\t"+"\t"+"SALESDATE_DATE "+((Orders)product).getArrivaldate()+"\n\t"+"\t"+"DISCOUNT "+((Orders)product).getDiscount()+"\n\t"+"\t"+"PRICE_AFTER_DISCOUNT "+(((Orders)product).getprice()-((Orders)product).getprice()*0.25)+"\n\t"+"\t"+"PIECES "+((Orders)product).getpieces()+"\n\t"+"}"+"\n");
                    }
                }
            writer.write("}"); 
            writer.close();
        }
        catch (IOException e) {
            System.err.println("Error writing file.");
        }
    }
    public void PrintFile(){
		
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("Sales.txt")));
			String line = reader.readLine();
			while (line!=null){
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
				
		}
			
		catch (IOException e) {
			System.err.println("Error writing file.");
		}	
	} 

    
}