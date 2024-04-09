public class consoles extends MainClass{
    public String type,cpu,gpu,sound;
    public int discSpace;
        
    public consoles(String modelsname,String manufacturer,int code,int year,double price,String type, String cpu, String gpu, String sound, int discSpace){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.cpu = cpu;
        this.gpu = gpu;
        this.sound = sound;
        this.discSpace = discSpace;
    }

    public String gettype(){
        return type;
    }

    public String getcpu(){
        return cpu;
    }

    public String getgpu(){
        return gpu;
    }

    public String getsound(){
        return sound;
    }

    public int getdiscSpace(){
        return discSpace;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.10))+" euro"+"\nCharacteristics of this consola are :"+"\nType : "+gettype()+"\nProcessor : "+getcpu()+"\nGraphics : "+getgpu()+"\nSound : "+getsound()+"\nDiscspace : "+getdiscSpace() + "GB";
    }
}