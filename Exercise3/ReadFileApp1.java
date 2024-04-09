import java.util.*;
import java.io.*;


class ReadFileApp1 {
    public ArrayList<Object> products = new ArrayList<Object>();
    public void ReadFile(){
        BufferedReader reader = null;
        Object product= null;
        String line;
        try {
            reader=new BufferedReader(new FileReader(new File("Orders.txt")));
            line=reader.readLine();
            if (line.trim().equals("ORDER_LIST")||line.trim().equals("order_list")) {
                line=reader.readLine();
                if (line.trim().equals("{")) {
                    line=reader.readLine();
                    while (line != null){
                        if (line.trim().equals("ORDER")||line.trim().equals("order")) {
                            line=reader.readLine();
                            if (line.trim().equals("{")) {
                                    product= new Orders();
                                    line=reader.readLine();
                                    if (line.trim().startsWith("ITEM_TYPE ")||line.trim().startsWith("item_type "))
                                        ((Orders)product).settype(line.substring(11).trim());
                                    line=reader.readLine();
                                    if (line.trim().startsWith("MODEL ")||line.trim().startsWith("model "))
                                        ((Orders)product).setmodelsname(line.substring(7).trim());
                                    line=reader.readLine();
                                    if (line.trim().startsWith("ORDERCODE ")||line.trim().startsWith("ordercode "))
                                        ((Orders)product).setordercode(Integer.parseInt(line.substring(11).trim()));
                                    line=reader.readLine();
                                    if (line.trim().startsWith("FULLNAME_AND_NUMBER ")||line.trim().startsWith("fullname_and_number "))
                                        ((Orders)product).setFullnameNPhonenumber(line.substring(21).trim());
                                    line=reader.readLine();
                                    if (line.trim().startsWith("ORDERDATE ")||line.trim().startsWith("orderdate "))
                                        ((Orders)product).setdate(line.substring(11).trim());
                                    line=reader.readLine();
                                    if (line.trim().startsWith("DELIVERY_DATE ")||line.trim().startsWith("delivery_date "))
                                        ((Orders)product).setArrivaldate(line.substring(15).trim());
                                    line=reader.readLine();
                                    if (line.trim().startsWith("DISCOUNT ")||line.trim().startsWith("discount "))
                                        ((Orders)product).setDiscount(Integer.parseInt(line.substring(10).trim()));
                                    line=reader.readLine();
                                    if (line.trim().startsWith("PRICE_AFTER_DISCOUNT ")||line.trim().startsWith("price_after_discount "))
                                        ((Orders)product).setprice(Double.parseDouble(line.substring(22).trim()));
                                    line=reader.readLine();
                                    if (line.trim().startsWith("PIECES ")||line.trim().startsWith("pieces "))
                                        ((Orders)product).setpieces(Integer.parseInt(line.substring(8).trim()));
                                    line=reader.readLine();
                                    if (line.trim().startsWith("STATUS ")||line.trim().startsWith("status "))
                                        ((Orders)product).setsituation(line.substring(8).trim());
                                    line=reader.readLine();
                                    if (line.trim().equals("}"))
                                        products.add(product);
                            }
                        }
                        line=reader.readLine();
                        if (line.trim().equals("}"))
                            line=reader.readLine();
                    }
                    reader.close();
                }
            }
        }
        catch (IOException e) {
            System.out.println	("Error reading line ...");
		}
    }
    public void PrintList (){
		for (Object product:products)
			System.out.println(product);
	}
}