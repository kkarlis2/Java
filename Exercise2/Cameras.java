public class Cameras extends MainClass{
    public String type,megaPixel,optZoom,digZoom,dimensions;
    
        
    public Cameras(String modelsname,String manufacturer,int code,int year,double price,String type, String megaPixel, String optZoom, String digZoom, String dimensions){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.megaPixel = megaPixel;
        this.optZoom = optZoom;
        this.digZoom = digZoom;
        this.dimensions = dimensions;
    } 
    
    public String gettype(){
        return type;
    }

    public String getmegaPixel(){
        return megaPixel;
    }

    public String getoptZoom(){
        return optZoom;
    }

    public String getdigZoom(){
        return digZoom;
    }

    public String getdimensions(){
        return dimensions;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.25))+" euro"+"\nCharacteristics of this camera are :"+"\nType : "+gettype()+"\nMegaPixel : "+getmegaPixel()+"\nOptical zoom : "+getoptZoom()+"\nDigital Zoom : "+getdigZoom()+"\nDimensions : "+getdimensions();
    }
}