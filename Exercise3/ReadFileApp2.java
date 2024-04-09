import java.util.*;
import java.io.*;


class ReadFileApp2 {
    public ArrayList<Object> products = new ArrayList<Object>();
    public void ReadFile(){
        BufferedReader reader = null;
        Object product= null;
        String line;
        try {
            reader=new BufferedReader(new FileReader(new File("Sales.txt")));
            line=reader.readLine();
            if (line.trim().equals("SALE_LIST")||line.trim().equals("sale_list")) {
                line=reader.readLine();
                if (line.trim().equals("{")) {
                    line=reader.readLine();
                    while (line != null){
                        if (line.trim().equals("SALE")||line.trim().equals("sale")) {
                            line=reader.readLine();
                            if (line.trim().equals("{")) {
                                    product= new Sales();
                                    line=reader.readLine();
                                    if (line.trim().startsWith("ITEM_TYPE ")||line.trim().startsWith("item_type "))
                                        ((Sales)product).settype(line.substring(11).trim());
                                    line=reader.readLine();
                                    if (line.trim().startsWith("MODEL ")||line.trim().startsWith("model "))
                                        ((Sales)product).setmodelsname(line.substring(7).trim());
                                    line=reader.readLine();
                                    if (line.trim().startsWith("SALESCODE ")||line.trim().startsWith("salescode "))
                                        ((Sales)product).setsalescode(Integer.parseInt(line.substring(11).trim()));
                                    line=reader.readLine();
                                    if (line.trim().startsWith("FULLNAME_AND_NUMBER ")||line.trim().startsWith("fullname_and_number "))
                                        ((Sales)product).setFullnameNPhonenumber(line.substring(21).trim());
                                    line=reader.readLine();
                                    if (line.trim().startsWith("SALEDATE ")||line.trim().startsWith("saledate "))
                                        ((Sales)product).setdate(line.substring(10).trim());
                                    line=reader.readLine();
                                    if (line.trim().startsWith("DISCOUNT ")||line.trim().startsWith("discount "))
                                        ((Sales)product).setdiscount(Integer.parseInt(line.substring(10).trim()));
                                    line=reader.readLine();
                                    if (line.trim().startsWith("PRICE_AFTER_DISCOUNT ")||line.trim().startsWith("price_after_discount ")){
                                        ((Sales)product).setprice(Double.parseDouble(line.substring(22).trim()));
                                    }
                                    line=reader.readLine();
                                    if (line.trim().startsWith("PIECES ")||line.trim().startsWith("pieces "))
                                        ((Sales)product).setpieces(Integer.parseInt(line.substring(8).trim()));
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
