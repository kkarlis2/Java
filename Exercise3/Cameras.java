public class Cameras extends MainClass{
    public String type,megaPixel,optZoom,digZoom,dimensions;

    public Cameras(){

    }
    
        
    public Cameras(String modelsname,String manufacturer,int code,int year,double price,String type, String megaPixel, String optZoom, String digZoom, String dimensions){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.megaPixel = megaPixel;
        this.optZoom = optZoom;
        this.digZoom = digZoom;
        this.dimensions = dimensions;
    } 

    public void settype(String type){
        this.type=type;
    }

    public void setmegaPixel(String megaPixel){
        this.megaPixel=megaPixel;
    }

    public void setoptZoom(String optZoom){
        this.optZoom=optZoom;
    }

    public void setdigZoom(String digZoom){
        this.digZoom=digZoom;
    }

    public void setdimensions(String dimensions){
        this.dimensions=dimensions;
    }
    
    public String gettype(){
        return this.type;
    }

    public String getmegaPixel(){
        return this.megaPixel;
    }

    public String getoptZoom(){
        return this.optZoom;
    }

    public String getdigZoom(){
        return this.digZoom;
    }

    public String getdimensions(){
        return this.dimensions;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.25))+" euro"+"\n\nCharacteristics of this camera are :"+"\nType : "+gettype()+"\nMegaPixel : "+getmegaPixel()+"\nOptical zoom : "+getoptZoom()+"\nDigital Zoom : "+getdigZoom()+"\nDimensions : "+getdimensions()+"\n------------------------";
    }
}