public class consoles extends MainClass{
    public String type,cpu,gpu,sound;
    public int discSpace;

    public consoles(){
        
    }
        
    public consoles(String modelsname,String manufacturer,int code,int year,double price,String type, String cpu, String gpu, String sound, int discSpace){
        super(modelsname,manufacturer,code,year,price);
        this.type = type;
        this.cpu = cpu;
        this.gpu = gpu;
        this.sound = sound;
        this.discSpace = discSpace;
    }

    public void settype(String type){
        this.type=type;
    }

    public void setcpu(String cpu){
        this.cpu=cpu;
    }

    public void setgpu(String gpu){
        this.gpu=gpu;
    }

    public void setsound(String sound){
        this.sound=sound;
    }

    public void setdiscSpace(int discSpace){
        this.discSpace=discSpace;
    }

    public String gettype(){
        return this.type;
    }

    public String getcpu(){
        return this.cpu;
    }

    public String getgpu(){
        return this.gpu;
    }

    public String getsound(){
        return this.sound;
    }

    public int getdiscSpace(){
        return this.discSpace;
    }

    public String toString() {
        return super.toString()+"\nPrice after dicount :"+(price-(price*0.10))+" euro"+"\n\nCharacteristics of this consola are :"+"\nType : "+gettype()+"\nProcessor : "+getcpu()+"\nGraphics : "+getgpu()+"\nSound : "+getsound()+"\nDiscspace : "+getdiscSpace() + "GB"+"\n------------------------";
    }
}