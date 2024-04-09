import java.util.*;
import java.io.*;

public class CreateFileApp1 {
    ArrayList item2;
	
	public ArrayList <Object> products = new ArrayList<Object>();
	public CreateFileApp1(ArrayList item2){
        this.item2=item2;
        
    }
	public void CreateList () {
		
		
		for(int i=0;i<item2.size();i++){
            products.add(item2.get(i));
        }
        

    }


    public void CreateFile () {
		
		FileWriter writer = null;

		try	{
			writer = new FileWriter(new File("Orders.txt"));
			writer.write("ORDER_LIST"+"\n"+"{"+"\n");
		
			for (Object product:products)
                if (product instanceof Orders) {
					if (((Orders)product).getDiscount()==20){
                    	writer.write ("\tORDER"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE "+((Orders)product).gettype()+"\n\t"+"\t"+"MODEL "+((Orders)product).getmodelsname()+"\n\t"+"\t"+"ORDERCODE "+((Orders)product).getordercode()+"\n\t"+"\t"+"FULLNAME_AND_NUMBER "+((Orders)product).getFullnameNPhonenumber()+"\n\t"+"\t"+"ORDERDATE "+((Orders)product).getdate()+"\n\t"+"\t"+"DELIVERY_DATE "+((Orders)product).getArrivaldate()+"\n\t"+"\t"+"DISCOUNT "+((Orders)product).getDiscount()+"\n\t"+"\t"+"PRICE_AFTER_DISCOUNT "+(((Orders)product).getprice()-((Orders)product).getprice()*0.20)+"\n\t"+"\t"+"PIECES "+((Orders)product).getpieces()+"\n\t"+"\t"+"STATUS "+((Orders)product).getsituation()+"\n\t"+"}"+"\n");
					}else if (((Orders)product).getDiscount()==10){
						writer.write ("\tORDER"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE "+((Orders)product).gettype()+"\n\t"+"\t"+"MODEL "+((Orders)product).getmodelsname()+"\n\t"+"\t"+"ORDERCODE "+((Orders)product).getordercode()+"\n\t"+"\t"+"FULLNAME_AND_NUMBER "+((Orders)product).getFullnameNPhonenumber()+"\n\t"+"\t"+"ORDERDATE "+((Orders)product).getdate()+"\n\t"+"\t"+"DELIVERY_DATE "+((Orders)product).getArrivaldate()+"\n\t"+"\t"+"DISCOUNT "+((Orders)product).getDiscount()+"\n\t"+"\t"+"PRICE_AFTER_DISCOUNT "+(((Orders)product).getprice()-((Orders)product).getprice()*0.10)+"\n\t"+"\t"+"PIECES "+((Orders)product).getpieces()+"\n\t"+"\t"+"STATUS "+((Orders)product).getsituation()+"\n\t"+"}"+"\n");
					}else if (((Orders)product).getDiscount()==25){
						writer.write ("\tORDER"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE "+((Orders)product).gettype()+"\n\t"+"\t"+"MODEL "+((Orders)product).getmodelsname()+"\n\t"+"\t"+"ORDERCODE "+((Orders)product).getordercode()+"\n\t"+"\t"+"FULLNAME_AND_NUMBER "+((Orders)product).getFullnameNPhonenumber()+"\n\t"+"\t"+"ORDERDATE "+((Orders)product).getdate()+"\n\t"+"\t"+"DELIVERY_DATE "+((Orders)product).getArrivaldate()+"\n\t"+"\t"+"DISCOUNT "+((Orders)product).getDiscount()+"\n\t"+"\t"+"PRICE_AFTER_DISCOUNT "+(((Orders)product).getprice()-((Orders)product).getprice()*0.25)+"\n\t"+"\t"+"PIECES "+((Orders)product).getpieces()+"\n\t"+"\t"+"STATUS "+((Orders)product).getsituation()+"\n\t"+"}"+"\n");
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
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("Orders.txt")));
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