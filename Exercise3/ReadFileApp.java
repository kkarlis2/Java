import java.util.*;
import java.io.*;


class ReadFileApp {
    public ArrayList<Object> products = new ArrayList<Object>();
    public void ReadFile(){
        BufferedReader reader = null;
        Object product= null;
        String line;
        try {
            reader=new BufferedReader(new FileReader(new File("products.txt")));
            line=reader.readLine();
            if (line.trim().equals("ITEM_LIST")||line.trim().equals("item_list")) {
                line=reader.readLine();
                if (line.trim().equals("{")) {
                    line=reader.readLine();
                    while (line != null){
                        
                                if (line.trim().equals("ITEM")||line.trim().equals("item")) {
                                    line=reader.readLine();
                                    if (line.trim().equals("{")) {
                                        line=reader.readLine();
                                        if (line.trim().startsWith("ITEM_TYPE ")||line.trim().startsWith("item_type ")){
                                            if (line.trim().substring(9).trim().equals("TV")||line.trim().substring(9).trim().equals("tv")){
                                                product= new TV();
                                                line=reader.readLine();
                                                if (line.trim().startsWith("CODE ")||line.trim().startsWith("code "))
                                                    ((MainClass)product).setcode(Integer.parseInt(line.substring(6).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("TYPE ")||line.trim().startsWith("type "))
                                                    ((TV)product).settype(line.substring(6).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL ")||line.trim().startsWith("model "))
                                                    ((MainClass)product).setModel(line.substring(7).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL_YEAR ")||line.trim().startsWith("model_year "))
                                                    ((MainClass)product).setYear(Integer.parseInt(line.substring(12).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MANUFACTURER ")||line.trim().startsWith("manufacturer "))
                                                    ((MainClass)product).setMan(line.substring(14).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("PRICE ")||line.trim().startsWith("price "))
                                                    ((MainClass)product).setprice(Double.parseDouble(line.substring(7).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("DIMENSION ")||line.trim().startsWith("dimension "))
                                                    ((TV)product).setdimension(line.substring(11).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("RESOLUTION ")||line.trim().startsWith("resolution "))
                                                    ((TV)product).setresolution(line.substring(12).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("PORTS ")||line.trim().startsWith("ports "))
                                                    ((TV)product).setports(line.substring(7).trim());
                                                line=reader.readLine();
                                                if (line.trim().equals("}"))
                                                    products.add(product);
                                            }else if (line.trim().substring(9).trim().equals("BNDVD")||line.trim().substring(9).trim().equals("bndvd")){
                                                product= new BNDVD();
                                                line=reader.readLine();
                                                if (line.trim().startsWith("CODE ")||line.trim().startsWith("code "))
                                                    ((MainClass)product).setcode(Integer.parseInt(line.substring(6).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("TYPE ")||line.trim().startsWith("type "))
                                                    ((BNDVD)product).settype(line.substring(6).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL ")||line.trim().startsWith("model "))
                                                    ((MainClass)product).setModel(line.substring(7).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL_YEAR ")||line.trim().startsWith("model_year "))
                                                    ((MainClass)product).setYear(Integer.parseInt(line.substring(12).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MANUFACTURER ")||line.trim().startsWith("manufacturer "))
                                                    ((MainClass)product).setMan(line.substring(14).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("PRICE ")||line.trim().startsWith("price "))
                                                    ((MainClass)product).setprice(Double.parseDouble(line.substring(7).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("RESOLUTION ")||line.trim().startsWith("resolution "))
                                                    ((BNDVD)product).setresolution(line.substring(12).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("FORMAT ")||line.trim().startsWith("format "))
                                                    ((BNDVD)product).setformat(line.substring(8).trim());
                                                line=reader.readLine();
                                                if (line.trim().equals("}"))
                                                    products.add(product);
                                            }else if (line.trim().substring(9).trim().equals("Cameras")||line.trim().substring(9).trim().equals("CAMERAS")){
                                                product= new Cameras();
                                                line=reader.readLine();
                                                if (line.trim().startsWith("CODE ")||line.trim().startsWith("code "))
                                                    ((MainClass)product).setcode(Integer.parseInt(line.substring(6).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("TYPE ")||line.trim().startsWith("type "))
                                                    ((Cameras)product).settype(line.substring(6).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL ")||line.trim().startsWith("model "))
                                                    ((MainClass)product).setModel(line.substring(7).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL_YEAR ")||line.trim().startsWith("model_year "))
                                                    ((MainClass)product).setYear(Integer.parseInt(line.substring(12).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MANUFACTURER ")||line.trim().startsWith("manufacturer "))
                                                    ((MainClass)product).setMan(line.substring(14).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("PRICE ")||line.trim().startsWith("price "))
                                                    ((MainClass)product).setprice(Double.parseDouble(line.substring(7).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MEGAPIXEL ")||line.trim().startsWith("megapixel "))
                                                    ((Cameras)product).setmegaPixel(line.substring(11).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("OPTZOOM ")||line.trim().startsWith("optzoom "))
                                                    ((Cameras)product).setoptZoom(line.substring(9).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("DIGZOOM ")||line.trim().startsWith("digzoom "))
                                                    ((Cameras)product).setdigZoom(line.substring(9).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("DIMENSION ")||line.trim().startsWith("dimension "))
                                                    ((Cameras)product).setoptZoom(line.substring(11).trim());
                                                line=reader.readLine();
                                                if (line.trim().equals("}"))
                                                    products.add(product);
                                            }else if (line.trim().substring(9).trim().equals("Consoles")||line.trim().substring(9).trim().equals("CONSOLES")){
                                                product= new consoles();
                                                line=reader.readLine();
                                                if (line.trim().startsWith("CODE ")||line.trim().startsWith("code "))
                                                    ((MainClass)product).setcode(Integer.parseInt(line.substring(6).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("TYPE ")||line.trim().startsWith("type "))
                                                    ((consoles)product).settype(line.substring(6).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL ")||line.trim().startsWith("model "))
                                                    ((MainClass)product).setModel(line.substring(7).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL_YEAR ")||line.trim().startsWith("model_year "))
                                                    ((MainClass)product).setYear(Integer.parseInt(line.substring(12).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MANUFACTURER ")||line.trim().startsWith("manufacturer "))
                                                    ((MainClass)product).setMan(line.substring(14).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("PRICE ")||line.trim().startsWith("price "))
                                                    ((MainClass)product).setprice(Double.parseDouble(line.substring(7).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("CPU ")||line.trim().startsWith("cpu "))
                                                    ((consoles)product).setcpu(line.substring(5).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("GPU ")||line.trim().startsWith("gpu "))
                                                    ((consoles)product).setgpu(line.substring(5).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("SOUND ")||line.trim().startsWith("sound "))
                                                    ((consoles)product).setsound(line.substring(7).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("DISCSPACE ")||line.trim().startsWith("discspace "))
                                                    ((consoles)product).setdiscSpace(Integer.parseInt(line.substring(11).trim()));
                                                line=reader.readLine();
                                                if (line.trim().equals("}"))
                                                    products.add(product);
                                            }else if (line.trim().substring(9).trim().equals("Refrigerators")||line.trim().substring(9).trim().equals("REFRIGERATORS")){
                                                product= new Refrigerators();
                                                line=reader.readLine();
                                                if (line.trim().startsWith("CODE ")||line.trim().startsWith("code "))
                                                    ((MainClass)product).setcode(Integer.parseInt(line.substring(6).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("TYPE ")||line.trim().startsWith("type "))
                                                    ((Refrigerators)product).settype(line.substring(6).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL ")||line.trim().startsWith("model "))
                                                    ((MainClass)product).setModel(line.substring(7).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL_YEAR ")||line.trim().startsWith("model_year "))
                                                    ((MainClass)product).setYear(Integer.parseInt(line.substring(12).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MANUFACTURER ")||line.trim().startsWith("manufacturer "))
                                                    ((MainClass)product).setMan(line.substring(14).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("PRICE ")||line.trim().startsWith("price "))
                                                    ((MainClass)product).setprice(Double.parseDouble(line.substring(7).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("ENERGY_CLASS ")||line.trim().startsWith("energy_class "))
                                                    ((Refrigerators)product).setenClass(line.substring(14).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("CONVCAP ")||line.trim().startsWith("convcap "))
                                                    ((Refrigerators)product).setconvCap(line.substring(9).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("FREEZECAP ")||line.trim().startsWith("freezecap "))
                                                    ((Refrigerators)product).setfreezeCap(line.substring(11).trim());
                                                line=reader.readLine();
                                                if (line.trim().equals("}"))
                                                    products.add(product);
                                            }else if (line.trim().substring(9).trim().equals("Washer")||line.trim().substring(9).trim().equals("WASHER")){
                                                product= new Washer();
                                                line=reader.readLine();
                                                if (line.trim().startsWith("CODE ")||line.trim().startsWith("code "))
                                                    ((MainClass)product).setcode(Integer.parseInt(line.substring(6).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL ")||line.trim().startsWith("model "))
                                                    ((MainClass)product).setModel(line.substring(7).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MODEL_YEAR ")||line.trim().startsWith("model_year "))
                                                    ((MainClass)product).setYear(Integer.parseInt(line.substring(12).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("MANUFACTURER ")||line.trim().startsWith("manufacturer "))
                                                    ((MainClass)product).setMan(line.substring(14).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("PRICE ")||line.trim().startsWith("price "))
                                                    ((MainClass)product).setprice(Double.parseDouble(line.substring(7).trim()));
                                                line=reader.readLine();
                                                if (line.trim().startsWith("ENERGY_CLASS ")||line.trim().startsWith("energy_class "))
                                                    ((Washer)product).setenClass(line.substring(14).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("CAP ")||line.trim().startsWith("cap "))
                                                    ((Washer)product).setcap(line.substring(5).trim());
                                                line=reader.readLine();
                                                if (line.trim().startsWith("TURNS ")||line.trim().startsWith("turns "))
                                                    ((Washer)product).setturns(line.substring(7).trim());
                                                line=reader.readLine();
                                                if (line.trim().equals("}"))
                                                    products.add(product);
                                            }
                                        }    
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
    public static void main(String[] args){
        ReadFileApp app3 = new ReadFileApp ();
		app3.ReadFile();
		app3.PrintList();
    }

}