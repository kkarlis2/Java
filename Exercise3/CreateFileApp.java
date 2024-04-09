import java.util.*;
import java.io.*;

public class CreateFileApp {
    ArrayList item1;
	
	public ArrayList <Object> products = new ArrayList<Object>();
	public CreateFileApp(ArrayList item1){
        this.item1=item1;
        
    }
    
	public void CreateList () {
		
		for(int i=0;i<item1.size();i++){
            products.add(item1.get(i));
        }
        

    }

    

    public void CreateFile () {
		
		FileWriter writer = null;

		try	{
			writer = new FileWriter(new File("products.txt"));
		writer.write("ITEM_LIST"+"\n"+"{"+"\n");
			for (Object product:products)
                if (product instanceof TV) {
                    writer.write ("\tITEM"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE TV"+"\n\t"+"\t"+"CODE "+((MainClass)product).getCode()+"\n\t"+"\t"+"TYPE "+((TV)product).gettype()+"\n\t"+"\t"+"MODEL "+((MainClass)product).getModel()+"\n\t"+"\t"+"MODEL_YEAR "+((MainClass)product).getYear()+"\n\t"+"\t"+"MANUFACTURER "+((MainClass)product).getMan()+"\n\t"+"\t"+"PRICE "+((MainClass)product).getPrice()+"\n\t"+"\t"+"DIMENSION "+((TV)product).getdimension()+"\n\t"+"\t"+"RESOLUTION "+((TV)product).getresolution()+"\n\t"+"\t"+"PORTS "+((TV)product).getports()+"\n\t"+"}"+"\n");
                }
                else if(product instanceof BNDVD) {
                    writer.write(("\tITEM"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE BNDVD"+"\n\t"+"\t"+"CODE "+((MainClass)product).getCode()+"\n\t"+"\t"+"TYPE "+((BNDVD)product).gettype()+"\n\t"+"\t"+"MODEL "+((MainClass)product).getModel()+"\n\t"+"\t"+"MODEL_YEAR "+((MainClass)product).getYear()+"\n\t"+"\t"+"MANUFACTURER "+((MainClass)product).getMan()+"\n\t"+"\t"+"PRICE "+((MainClass)product).getPrice()+"\n\t"+"\t"+"RESOLUTION "+((BNDVD)product).getresolution()+"\n\t"+"\t"+"FORMAT "+((BNDVD)product).getformat()+"\n\t"+"}"+"\n"));
                }
                else if(product instanceof Cameras){
                    writer.write(("\tITEM"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE Cameras"+"\n\t"+"\t"+"CODE "+((MainClass)product).getCode()+"\n\t"+"\t"+"TYPE "+((Cameras)product).gettype()+"\n\t"+"\t"+"MODEL "+((MainClass)product).getModel()+"\n\t"+"\t"+"MODEL_YEAR "+((MainClass)product).getYear()+"\n\t"+"\t"+"MANUFACTURER "+((MainClass)product).getMan()+"\n\t"+"\t"+"PRICE "+((MainClass)product).getPrice()+"\n\t"+"\t"+"MEGAPIXEL "+((Cameras)product).getmegaPixel()+"\n\t"+"\t"+"OPTZOOM "+((Cameras)product).getoptZoom()+"\n\t"+"\t"+"DIGZOOM "+((Cameras)product).getdigZoom()+"\n\t"+"\t"+"DIMENSION "+((Cameras)product).getdimensions()+"\n\t"+"}"+"\n"));
                }else if(product instanceof consoles){
                    writer.write(("\tITEM"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE Consoles"+"\n\t"+"\t"+"CODE "+((MainClass)product).getCode()+"\n\t"+"\t"+"TYPE "+((consoles)product).gettype()+"\n\t"+"\t"+"MODEL "+((MainClass)product).getModel()+"\n\t"+"\t"+"MODEL_YEAR "+((MainClass)product).getYear()+"\n\t"+"\t"+"MANUFACTURER "+((MainClass)product).getMan()+"\n\t"+"\t"+"PRICE "+((MainClass)product).getPrice()+"\n\t"+"\t"+"CPU "+((consoles)product).getcpu()+"\n\t"+"\t"+"GPU "+((consoles)product).getgpu()+"\n\t"+"\t"+"SOUND "+((consoles)product).getsound()+"\n\t"+"\t"+"DISCSPACE "+((consoles)product).getdiscSpace()+"\n\t"+"}"+"\n"));
                }else if(product instanceof Refrigerators){
                    writer.write(("\tITEM"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE Refrigerators"+"\n\t"+"\t"+"CODE "+((MainClass)product).getCode()+"\n\t"+"\t"+"TYPE "+((Refrigerators)product).gettype()+"\n\t"+"\t"+"MODEL "+((MainClass)product).getModel()+"\n\t"+"\t"+"MODEL_YEAR "+((MainClass)product).getYear()+"\n\t"+"\t"+"MANUFACTURER "+((MainClass)product).getMan()+"\n\t"+"\t"+"PRICE "+((MainClass)product).getPrice()+"\n\t"+"\t"+"ENERGY_CLASS "+((Refrigerators)product).getenClass()+"\n\t"+"\t"+"CONVCAP "+((Refrigerators)product).getconvCap()+"\n\t"+"\t"+"FREEZECAP "+((Refrigerators)product).getfreezeCap()+"\n\t"+"}"+"\n"));
                }else if(product instanceof Washer){
                    writer.write(("\tIETM"+"\n\t"+"{"+"\n\t"+"\t"+"ITEM_TYPE Washer"+"\n\t"+"\t"+"CODE "+((MainClass)product).getCode()+"\n\t"+"\t"+"MODEL "+((MainClass)product).getModel()+"\n\t"+"\t"+"MODEL_YEAR "+((MainClass)product).getYear()+"\n\t"+"\t"+"MANUFACTURER "+((MainClass)product).getMan()+"\n\t"+"\t"+"PRICE "+((MainClass)product).getPrice()+"\n\t"+"\t"+"ENERGY_CLASS "+((Washer)product).getenClass()+"\n\t"+"\t"+"CAP "+((Washer)product).getcap()+"\n\t"+"\t"+"TURNS "+((Washer)product).getturns()+"\n\t"+"}"+"\n"));
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
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("products.txt")));
			String line = reader.readLine();
			while (line!=null){
				line = reader.readLine();
			}
			reader.close();
				
		}
			
		catch (IOException e) {
			System.err.println("Error printing file.");
		}	
	} 

    
}

    