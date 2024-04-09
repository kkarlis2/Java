import java.util.*;
import java.lang.reflect.Array;
import java.io.*;

public class MainApp {
    public static void main(String[] args){
        String[] Categories={"Picture and Sound","Gaming","Appliances"};
        String[] PictureNsound={"Televisions","Blu ray and DVD players","Cameras"};
        String[] Gaming={"consoles"};
        String[] Appliances={"Refrigerators","Washing machine"};
        String[] Televisions={"LCD","LED","Plasma"};
        String[] BorDVD={"Blue ray","DVD"};
        String[] Cameras={"compact", "DSLR", "Action camera"};
        String[] consoles={"PS4", "PS3", "Xbox"};
        String[] Refrigerators={"one door","two doors","closet"};
        String[] models={"TV LG 32LK6200","TCL TV 65DP672","TV LG 43UM7390","TV TCL 32ΕS560","TV LG 49SM8600","TV Sony KD-55XG9505","Sony UBP-X700","Panasonic DP-UB824EGK","Thomson DVD80K","Denon DBP-4010UD","Canon Powershot SX620 HS","Panasonic Lumix FZ300","Nikon D3500 Kit (AF-P DX 18-55mm VR)","Canon EOS 2000D Kit (EF-S 18-55mm III)","GoPro Hero8 Black","Sony HDR-AS50","Sony PlayStation 4 Pro","Sony PlayStation 3 Slim","MICROSOFT XBOX ONE S","Refrigerators A+ RSSA250K20W","Refrigerators A++ ARS-130RN","Refrigerators NoFrost A++ GTB382SHCZD","Refrigerators  A+ TAA 5","Refrigerators NoFrost Inox A++ GSL760PZUZ","Refrigerators NoFrost Inox A+ GN1416221JX","Pitsos WQP1200G9","Samsung WW90J5445FW/LV","Whirlpool TDLR70230 Zen"};

        MainClass A = new TV("TV LG 32LK6200","LG",1000,2018,224.78,"LCD","742*445*86.5","Full HD","HDMI");
        MainClass B = new TV("TCL TV 65DP672","TCL",1001,2019,518.80,"LCD","1446*904*255","4K Ultra HD","DVI");
        MainClass C = new TV("TV LG 43UM7390","LG",1002,2019,294.00,"LED","973*572*85","4K Ultra HD","DVI");
        MainClass D = new TV("TV TCL 32ΕS560","TCL",1003,2019,178.70,"LED","732*435*80","HD Ready","COMPOSITE");
        MainClass E = new TV("TV LG 49SM8600","LG",1004,2019,564.89,"PLASMA","1096*640*63.6","4K Ultra HD","HDMI");
        MainClass F = new TV("TV Sony KD-55XG9505","Sony",1005,2019,997.10,"PLASMA","1228*709*69","4K Ultra HD","DVI");

        MainClass G = new BNDVD("Sony UBP-X700","Sony",1006,2018,188.99,"Blu Ray","4K Ultra HD","BD-R");
        MainClass H = new BNDVD("Panasonic DP-UB824EGK","Panasonic",1007,2019,447.87,"Blu Ray","Ultra HD","BD-RD");
        MainClass I = new BNDVD("Thomson DVD80K","Thomson",1008,2017,69.90,"DVD player","HD","DVD-RW");
        MainClass J = new BNDVD("Denon DBP-4010UD","Denon",1009,2019,1870.00,"DVD player","4K Ultra HD","DVD+RW");

        MainClass K = new Cameras("Canon Powershot SX620 HS","Canon",1010,2016,194.63,"Compact","20.2 MP","25 x","4 x","3 inches");
        MainClass L = new Cameras("Panasonic Lumix FZ300","Panasonic",1011,2018,326.00,"Compact","12.1 MP","24 x","4 x","3 inches");
        MainClass M = new Cameras("Nikon D3500 Kit (AF-P DX 18-55mm VR)","Nikon",1012,2019,415.00,"DSLR","24.2 MP"," - "," - ","3 inches");
        MainClass N = new Cameras("Canon EOS 2000D Kit (EF-S 18-55mm III)","Canon",1013,2020,345.00,"DSLR","24.1 MP"," - "," - ","3 inches");
        MainClass O = new Cameras("GoPro Hero8 Black","GoPro",1014,2018,375.00,"Action Camera","12 MP"," - "," - ","2 inches");
        MainClass P = new Cameras("Sony HDR-AS50","Sony",1015,2017,179.00,"Action Camera","11.1 MP"," - ", " - ","2 inches");

        MainClass R = new consoles("Sony PlayStation 4 Pro","Sony",1016,2018,358.92,"PS4","AMD 'Jaguar' x86-64, 8-Core","4.2 TFLOPS, AMD next-generation Radeon","Dolby Digital",1000);
        MainClass S = new consoles("Sony PlayStation 3 Slim","Sony",1017,2013,195.00,"PS3","AMD 'Jaguar'","Radeon 77xx","Dolby Digital",500);
        MainClass T = new consoles("MICROSOFT XBOX ONE S","Microsoft",1018,2018,214.00,"Xbox","AMD Jaguar x86-64","Radeon 77xx","Dolby Atmos",1000);

        MainClass U = new Refrigerators("Refrigerators A+ RSSA250K20W","Beko",1019,2015,350.00,"One door","A +","203 lt","19 lt");
        MainClass V = new Refrigerators("Refrigerators A++ ARS-130RN","Arielli",1020,2016,107.50,"One door","A ++","83 lt","14 lt");
        MainClass W = new Refrigerators("Refrigerators NoFrost A++ GTB382SHCZD","LG",1021,2013,343.00,"Two doors","A ++","165 lt","44 lt");
        MainClass X = new Refrigerators("Refrigerators  A+ TAA 5","Indesit",1022,2016,289.90,"Two doors","A +","333 lt","82 lt");
        MainClass Y = new Refrigerators("Refrigerators NoFrost Inox A++ GSL760PZUZ","LG",1023,2015,954.00,"Closet","A++","405 lt","196 lt");
        MainClass Z = new Refrigerators("Refrigerators NoFrost Inox A+ GN1416221JX","Beko",1024,2018,1099.99,"Closet","A+","376 lt","154 lt");

        MainClass AA = new Washer("Pitsos WQP1200G9","Pitsos",1025,2014,384.99,"A+++","9 kg","1200/min");
        MainClass AB = new Washer("Samsung WW90J5445FW/LV","Samsung",1026,2017,394.00,"A+++","8 kg","1400/min");
        MainClass AC = new Washer("Whirlpool TDLR70230 Zen","Whirlpool",1027,2018,379.00,"A+++","7 kg","1200/min");
        ArrayList <Object> file = new ArrayList<Object>();
        ArrayList <Object> file1 = new ArrayList<Object>();
        ArrayList <Object> file2 = new ArrayList<Object>();
        
        
        


        Object[] Washer1={AA,AB,AC};
        HashMap<Object, Integer> Availabledev = new HashMap<Object, Integer>();
        Availabledev.put(A,0);
        Availabledev.put(B,1); 
        Availabledev.put(C,0);
        Availabledev.put(D,2);
        Availabledev.put(E,0);
        Availabledev.put(F,2);
        Availabledev.put(G,3);
        Availabledev.put(H,0);
        Availabledev.put(I,1);
        Availabledev.put(J,0);
        Availabledev.put(K,2);
        Availabledev.put(L,1); 
        Availabledev.put(M,2);
        Availabledev.put(N,0);
        Availabledev.put(O,3);
        Availabledev.put(P,0);
        Availabledev.put(R,1);
        Availabledev.put(S,6);
        Availabledev.put(T,1); 
        Availabledev.put(U,0);
        Availabledev.put(V,1);
        Availabledev.put(W,0);
        Availabledev.put(X,1);
        Availabledev.put(Y,0);
        Availabledev.put(Z,2);
        Availabledev.put(AA,1);
        Availabledev.put(AB,1);
        Availabledev.put(AC,0);
        HashMap<Object, Integer> Orders1 = new HashMap<Object, Integer>();
        HashMap<Object, Integer> Sales1 = new HashMap<Object, Integer>();
        int salescode=4000;
        int orderscode=8000;
        List<Object> numorders = new ArrayList<>();
        
        


        boolean done=true;
        Scanner myObj = new Scanner(System.in);
        Scanner myObj1 = new Scanner(System.in);
        while(done) {

            System.out.println("\n\n0. Device overview");
            System.out.println("1. Order overview");
            System.out.println("2. sales overview ");
            System.out.println("3. Exit\n\n");
            int answer=myObj.nextInt();
            if (answer==0) {
                if (file.isEmpty()==false)
                    file.clear();
                System.out.println("-----------------------------------------"+"\n Categories"+"\n 1. Picture and sound"+"\n 2. Gaming"+"\n 3. Appliances"+"\n -----------------------------------------");
                System.out.println("Give your choise(number)");
                int menuchoise=myObj.nextInt();
                if(menuchoise!=3&&menuchoise!=2&&menuchoise!=1){
                    System.out.println("This choise doesn't exist...Please enter a right one");
                    int newmchoise=myObj.nextInt();
                    menuchoise=newmchoise;
                    System.out.println("\n\nYou have chosen the category "+ Categories[menuchoise-1]);
                }else{
                    System.out.println("\n\nYou have chosen the category "+ Categories[menuchoise-1]);
                }
                if (menuchoise==1){
                    System.out.println("This category includes : "+"\n1. Televisions"+"\n2. Blue ray and DVD players"+"\n3. Cameras");
                    System.out.println("\n\nGive your choise(number)");
                    int catchoise=myObj.nextInt();
                    if(catchoise!=3&&catchoise!=2&&catchoise!=1){
                        System.out.println("This choise doesn't exist...Please enter a right one");
                        int newchoise=myObj.nextInt();
                        catchoise=newchoise;
                        System.out.println("\n\nYou have chosen the category "+ PictureNsound[catchoise-1]);
                    }else {
                        System.out.println("\n\nYou have chosen the category "+ PictureNsound[catchoise-1]);
                    }
                    if(catchoise==1){
                        System.out.println("\n\n Chose type of Television"+"\n1. LCD \n2. LED\n3. Plasma");
                        int typechoise=myObj.nextInt();
                        if (typechoise==1){
                            System.out.println("You have chosen the type : "+Televisions[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(A);
                            file.add(B);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+A+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(A)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales A1=new Sales("TV",salescode,models[0],nameNnumber,"15/05/2020",pieces*224.78,25,pieces);
                                        file2.add(A1);
                                        System.out.println(A1+"\n\nThank you for your Purchase!");
                                        Sales1.put(A,pieces);
                                        Availabledev.replace(A,(Availabledev.get(A)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(A)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders A2=new Orders("TV",orderscode,models[0],nameNnumber,"15/05/2020","20/05/2020",pieces*224.78,25,"Remaining",pieces);
                                            file1.add(A2);
                                            System.out.println(A2);
                                            Orders1.put(A2,pieces);
                                            numorders.add(A2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    } 
                                  
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+B+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(B)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales B1=new Sales("TV",salescode,models[1],nameNnumber,"15/05/2020",pieces*518.80,25,pieces);
                                        file2.add(B1);
                                        System.out.println(B1+"\n\nThank you for your Purchase!");
                                        Sales1.put(B,pieces);
                                        Availabledev.replace(B,(Availabledev.get(B)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(B)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders B2=new Orders("TV",orderscode,models[1],nameNnumber,"15/05/2020","20/05/2020",pieces*518.80,25,"Remaining",pieces);
                                            file1.add(B2);
                                            System.out.println(B2);
                                            Orders1.put(B2,pieces);
                                            numorders.add(B2);
                                        }

                                    } 
                                    
                                    
                                }else if(finalchoise==2){
                                    continue;
                                }
                                
                            }
                        }else if (typechoise==2){
                            System.out.println("You have chosen the type : "+Televisions[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(C);
                            file.add(D);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+C+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(C)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales C1=new Sales("TV",salescode,models[2],nameNnumber,"15/05/2020",pieces*294.00,25,pieces);
                                        file2.add(C1);
                                        System.out.println(C1+"\n\nThank you for your Purchase!");
                                        Sales1.put(C,pieces);
                                        Availabledev.replace(C,(Availabledev.get(C)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(C)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders C2=new Orders("TV",orderscode,models[2],nameNnumber,"15/05/2020","20/05/2020",pieces*294.00,25,"Remaining",pieces);
                                            file1.add(C2);
                                            System.out.println(C2);
                                            Orders1.put(C2,pieces);
                                            numorders.add(C2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+D+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(D)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales D1=new Sales("TV",salescode,models[3],nameNnumber,"15/05/2020",pieces*178.70,25,pieces);
                                        file2.add(D1);
                                        System.out.println(D1+"\n\nThank you for your Purchase!");
                                        Sales1.put(D,pieces);
                                        Availabledev.replace(D,(Availabledev.get(D)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(D)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders D2=new Orders("TV",orderscode,models[3],nameNnumber,"15/05/2020","20/05/2020",pieces*178.70,25,"Remaining",pieces);
                                            file1.add(D2);
                                            System.out.println(D2);
                                            Orders1.put(D2,pieces);
                                            numorders.add(D2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }else if (typechoise==3){
                            System.out.println("You have chosen the type : "+Televisions[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(E);
                            file.add(F);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+E+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(E)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales E1=new Sales("TV",salescode,models[4],nameNnumber,"15/05/2020",pieces*564.89,25,pieces);
                                        file2.add(E1);
                                        System.out.println(E1+"\n\nThank you for your Purchase!");
                                        Sales1.put(E,pieces);
                                        Availabledev.replace(E,(Availabledev.get(E)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(E)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders E2=new Orders("TV",orderscode,models[4],nameNnumber,"15/05/2020","20/05/2020",pieces*564.89,25,"Remaining",pieces);
                                            file1.add(E2);
                                            System.out.println(E2);
                                            Orders1.put(E2,pieces);
                                            numorders.add(E2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+F+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(F)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales F1=new Sales("TV",salescode,models[5],nameNnumber,"15/05/2020",pieces*997.10,25,pieces);
                                        file2.add(F1);
                                        System.out.println(F1+"\n\nThank you for your Purchase!");
                                        Sales1.put(F,pieces);
                                        Availabledev.replace(F,(Availabledev.get(F)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(F)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders F2=new Orders("TV",orderscode,models[5],nameNnumber,"15/05/2020","20/05/2020",pieces*997.10,25,"Remaining",pieces);
                                            file1.add(F2);
                                            System.out.println(F2);
                                            Orders1.put(F2,pieces);
                                            numorders.add(F2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }
                    }else if(catchoise==2){
                        System.out.println("\n\nChose Blue Ray(1) or DVD player(2)");
                        int typechoise=myObj.nextInt();
                        if (typechoise==1){
                            System.out.println("You have chosen the type : "+BorDVD[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(G);
                            file.add(H);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+G+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(G)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales G1=new Sales("BNDVD",salescode,models[6],nameNnumber,"15/05/2020",pieces*188.99,25,pieces);
                                        file2.add(G1);
                                        System.out.println(G1+"\n\nThank you for your Purchase!");
                                        Sales1.put(G,pieces);
                                        Availabledev.replace(G,(Availabledev.get(G)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(G)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders G2=new Orders("BNDVD",orderscode,models[6],nameNnumber,"15/05/2020","20/05/2020",pieces*188.99,25,"Remaining",pieces);
                                            file1.add(G2);
                                            System.out.println(G2);
                                            Orders1.put(G2,pieces);
                                            numorders.add(G2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+H+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(H)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales H1=new Sales("BNDVD",salescode,models[7],nameNnumber,"15/05/2020",pieces*447.87,25,pieces);
                                        file2.add(H1);
                                        System.out.println(H1+"\n\nThank you for your Purchase!");
                                        Sales1.put(H,pieces);
                                        Availabledev.replace(H,(Availabledev.get(H)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(H)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders H2=new Orders("BNDVD",orderscode,models[7],nameNnumber,"15/05/2020","20/05/2020",pieces*447.87,25,"Remaining",pieces);
                                            file1.add(H2);
                                            System.out.println(H2);
                                            Orders1.put(H2,pieces);
                                            numorders.add(H2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }else if (typechoise==2){
                            System.out.println("You have chosen the type : "+BorDVD[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(I);
                            file.add(J);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+I+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(I)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales I1=new Sales("BNDVD",salescode,models[8],nameNnumber,"15/05/2020",pieces*69.90,25,pieces);
                                        file2.add(I1);
                                        System.out.println(I1+"\n\nThank you for your Purchase!");
                                        Sales1.put(I,pieces);
                                        Availabledev.replace(I,(Availabledev.get(I)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(I)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders I2=new Orders("BNDVD",orderscode,models[8],nameNnumber,"15/05/2020","20/05/2020",pieces*69.90,25,"Remaining",pieces);
                                            file1.add(I2);
                                            System.out.println(I2);
                                            Orders1.put(I2,pieces);
                                            numorders.add(I2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+J+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(J)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales J1=new Sales("BNDVD",salescode,models[9],nameNnumber,"15/05/2020",pieces*1870.00,25,pieces);
                                        file2.add(J1);
                                        System.out.println(J1+"\n\nThank you for your Purchase!");
                                        Sales1.put(J,pieces);
                                        Availabledev.replace(J,(Availabledev.get(J)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(J)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders J2=new Orders("BNDVD",orderscode,models[9],nameNnumber,"15/05/2020","20/05/2020",pieces*1870.00,25,"Remaining",pieces);
                                            file1.add(J2);
                                            System.out.println(J2);
                                            Orders1.put(J2,pieces);
                                            numorders.add(J2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }
                    }else if(catchoise==3){
                        System.out.println("\n\nChose type of cameras"+"\n1. compact\n2. DSLR\n3. Action Camera");
                        int typechoise=myObj.nextInt();
                        if (typechoise==1){
                            System.out.println("You have chosen the type : "+Cameras[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(K);
                            file.add(L);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+K+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(K)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales K1=new Sales("Cameras",salescode,models[10],nameNnumber,"15/05/2020",pieces*194.63,25,pieces);
                                        file2.add(K1);
                                        System.out.println(K1+"\n\nThank you for your Purchase!");
                                        Sales1.put(K,pieces);
                                        Availabledev.replace(K,(Availabledev.get(K)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(K)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders K2=new Orders("Cameras",orderscode,models[10],nameNnumber,"15/05/2020","20/05/2020",pieces*194.63,25,"Remaining",pieces);
                                            file1.add(K2);
                                            System.out.println(K2);
                                            Orders1.put(K2,pieces);
                                            numorders.add(K2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+L+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(L)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales L1=new Sales("Cameras",salescode,models[11],nameNnumber,"15/05/2020",pieces*326.00,25,pieces);
                                        file2.add(L1);
                                        System.out.println(L1+"\n\nThank you for your Purchase!");
                                        Sales1.put(L,pieces);
                                        Availabledev.replace(L,(Availabledev.get(L)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(L)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders L2=new Orders("Cameras",orderscode,models[11],nameNnumber,"15/05/2020","20/05/2020",pieces*326.00,25,"Remaining",pieces);
                                            file1.add(L2);
                                            System.out.println(L2);
                                            Orders1.put(L2,pieces);
                                            numorders.add(L2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }else if (typechoise==2){
                            System.out.println("You have chosen the type : "+Cameras[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(M);
                            file.add(N);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+M+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(M)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales M1=new Sales("Cameras",salescode,models[12],nameNnumber,"15/05/2020",pieces*415.00,25,pieces);
                                        file2.add(M1);
                                        System.out.println(M1+"\n\nThank you for your Purchase!");
                                        Sales1.put(M,pieces);
                                        Availabledev.replace(M,(Availabledev.get(M)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(M)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders M2=new Orders("Cameras",orderscode,models[12],nameNnumber,"15/05/2020","20/05/2020",pieces*415.00,25,"Remaining",pieces);
                                            file1.add(M2);
                                            System.out.println(M2);
                                            Orders1.put(M2,pieces);
                                            numorders.add(M2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+N+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(N)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales N1=new Sales("Cameras",salescode,models[13],nameNnumber,"15/05/2020",pieces*345.00,25,pieces);
                                        file2.add(N1);
                                        System.out.println(N1+"\n\nThank you for your Purchase!");
                                        Sales1.put(N,pieces);
                                        Availabledev.replace(N,(Availabledev.get(N)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(N)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders N2=new Orders("Cameras",orderscode,models[13],nameNnumber,"15/05/2020","20/05/2020",pieces*345.00,25,"Remaining",pieces);
                                            file1.add(N2);
                                            System.out.println(N2);
                                            Orders1.put(N2,pieces);
                                            numorders.add(N2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }else if (typechoise==3){
                            System.out.println("You have chosen the type : "+Cameras[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(O);
                            file.add(P);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+O+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(O)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales O1=new Sales("Cameras",salescode,models[14],nameNnumber,"15/05/2020",pieces*375.00,25,pieces);
                                        file2.add(O1);
                                        System.out.println(O1+"\n\nThank you for your Purchase!");
                                        Sales1.put(O,pieces);
                                        Availabledev.replace(O,(Availabledev.get(O)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(O)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders O2=new Orders("Cameras",orderscode,models[14],nameNnumber,"15/05/2020","20/05/2020",pieces*375.00,25,"Remaining",pieces);
                                            file1.add(O2);
                                            System.out.println(O2);
                                            Orders1.put(O2,pieces);
                                            numorders.add(O2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+P+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(P)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales P1=new Sales("Cameras",salescode,models[15],nameNnumber,"15/05/2020",pieces*179.00,25,pieces);
                                        file2.add(P1);
                                        System.out.println(P1+"\n\nThank you for your Purchase!");
                                        Sales1.put(P,pieces);
                                        Availabledev.replace(P,(Availabledev.get(P)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(P)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders P2=new Orders("Cameras",orderscode,models[15],nameNnumber,"15/05/2020","20/05/2020",pieces*179.00,25,"Remaining",pieces);
                                            file1.add(P2);
                                            System.out.println(P2);
                                            Orders1.put(P2,pieces);
                                            numorders.add(P2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }
                    }
                }else if (menuchoise==2){
                    System.out.println("This category includes : "+"\n1. consoles");
                    System.out.println("\n\nGive your choise(number)");
                    int catchoise=myObj.nextInt();
                    if(catchoise>1){
                        System.out.println("This choise doesn't exist...Please enter a right one");
                        int newchoise=myObj.nextInt();
                        catchoise=newchoise;
                        System.out.println("\n\nYou have chosen the category "+ Gaming[catchoise-1]);
                    }else{
                        System.out.println("\n\nYou have chosen the category "+ Gaming[catchoise-1]);
                        System.out.println("\n Chose type of consoles" +"\n1. PS4\n2. PS3\n3. Xbox");
                        int typechoise=myObj.nextInt();
                        if (typechoise==1){
                            System.out.println("You have chosen the type : "+consoles[typechoise-1]);
                            System.out.println("In our store you can choose the following model :"+"\n1.)");
                            file.add(R);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+R+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(R)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales R1=new Sales("consoles",salescode,models[16],nameNnumber,"15/05/2020",pieces*358.92,10,pieces);
                                        file2.add(R1);
                                        System.out.println(R1+"\n\nThank you for your Purchase!");
                                        Sales1.put(R,pieces);
                                        Availabledev.replace(R,(Availabledev.get(R)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(R)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders R2=new Orders("consoles",orderscode,models[16],nameNnumber,"15/05/2020","20/05/2020",pieces*358.92,10,"Remaining",pieces);
                                            file1.add(R2);
                                            System.out.println(R2);
                                            Orders1.put(R2,pieces);
                                            numorders.add(R2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }else if (typechoise==2){
                            System.out.println("You have chosen the type : "+consoles[typechoise-1]);
                            System.out.println("In our store you can choose the following model :"+"\n1.)");
                            file.add(S);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+S+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(S)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales S1=new Sales("consoles",salescode,models[17],nameNnumber,"15/05/2020",pieces*195.00,10,pieces);
                                        file2.add(S1);
                                        System.out.println(S1+"\n\nThank you for your Purchase!");
                                        Sales1.put(S,pieces);
                                        Availabledev.replace(S,(Availabledev.get(S)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(S)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders S2=new Orders("consoles",orderscode,models[17],nameNnumber,"15/05/2020","20/05/2020",pieces*195.00,10,"Remaining",pieces);
                                            file1.add(S2);
                                            System.out.println(S2);
                                            Orders1.put(S2,pieces);
                                            numorders.add(S2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }else if (typechoise==3){
                            System.out.println("You have chosen the type : "+consoles[typechoise-1]);
                            System.out.println("In our store you can choose the following model :"+"\n1.)");
                            file.add(T);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+T+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(T)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales T1=new Sales("consoles",salescode,models[18],nameNnumber,"15/05/2020",pieces*214.00,10,pieces);
                                        file2.add(T1);
                                        System.out.println(T1+"\n\nThank you for your Purchase!");
                                        Sales1.put(T,pieces);
                                        Availabledev.replace(T,(Availabledev.get(R)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(T)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders T2=new Orders("consoles",orderscode,models[18],nameNnumber,"15/05/2020","20/05/2020",pieces*214.00,10,"Remaining",pieces);
                                            file1.add(T2);
                                            System.out.println(T2);
                                            Orders1.put(T2,pieces);
                                            numorders.add(T2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }
                    }
                    
                }else if(menuchoise==3){
                    System.out.println("This category includes : "+"\n1. refrigerators"+"\n2. Washing machine");
                    System.out.println("\n\nGive your choise(number)");
                    int catchoise=myObj.nextInt();
                    if(catchoise>2){
                        System.out.println("This choise doesn't exist...Please enter a right one");
                        int newchoise=myObj.nextInt();
                        catchoise=newchoise;
                        System.out.println("\n\nYou have chosen the category "+ Appliances[catchoise-1]);
                    }else{
                        System.out.println("\n\nYou have chosen the category "+ Appliances[catchoise-1]);            
                    }  
                    if (catchoise==1){
                        System.out.println("\n\n Chose type of refrigerators"+"\n1. one door\n2. two doors\n3. closet");
                        int typechoise=myObj.nextInt();
                        if (typechoise==1){
                            System.out.println("You have chosen the type : "+Refrigerators[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(U);
                            file.add(V);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+U+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(U)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales U1=new Sales("Refrigerators",salescode,models[19],nameNnumber,"15/05/2020",pieces*350.00,20,pieces);
                                        file2.add(U1);
                                        System.out.println(U1+"\n\nThank you for your Purchase!");
                                        Sales1.put(U,pieces);
                                        Availabledev.replace(U,(Availabledev.get(U)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(U)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders U2=new Orders("Refrigerators",orderscode,models[19],nameNnumber,"15/05/2020","20/05/2020",pieces*350.00,20,"Remaining",pieces);
                                            file1.add(U2);
                                            System.out.println(U2);
                                            Orders1.put(U2,pieces);
                                            numorders.add(U2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+V+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(V)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales V1=new Sales("Refrigerators",salescode,models[20],nameNnumber,"15/05/2020",pieces*107.50,20,pieces);
                                        file2.add(V1);
                                        System.out.println(V1+"\n\nThank you for your Purchase!");
                                        Sales1.put(V,pieces);
                                        Availabledev.replace(V,(Availabledev.get(V)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(V)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders V2=new Orders("Refrigerators",orderscode,models[20],nameNnumber,"15/05/2020","20/05/2020",pieces*107.50,20,"Remaining",pieces);
                                            file1.add(V2);
                                            System.out.println(V2);
                                            Orders1.put(V2,pieces);
                                            numorders.add(V2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }
                            }
                        }else if (typechoise==2){
                            System.out.println("You have chosen the type : "+Refrigerators[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(W);
                            file.add(X);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+W+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(W)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales W1=new Sales("Refrigerators",salescode,models[21],nameNnumber,"15/05/2020",pieces*343.00,20,pieces);
                                        file2.add(W1);
                                        System.out.println(W1+"\n\nThank you for your Purchase!");
                                        Sales1.put(W,pieces);
                                        Availabledev.replace(W,(Availabledev.get(W)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(W)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders W2=new Orders("Refrigerators",orderscode,models[21],nameNnumber,"15/05/2020","20/05/2020",pieces*343.00,20,"Remaining",pieces);
                                            file1.add(W2);
                                            System.out.println(W2);
                                            Orders1.put(W2,pieces);
                                            numorders.add(W2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+X+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(X)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales X1=new Sales("Refrigerators",salescode,models[22],nameNnumber,"15/05/2020",pieces*289.90,20,pieces);
                                        file2.add(X1);
                                        System.out.println(X1+"\n\nThank you for your Purchase!");
                                        Sales1.put(X,pieces);
                                        Availabledev.replace(X,(Availabledev.get(X)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(X)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders X2=new Orders("Refrigerators",orderscode,models[22],nameNnumber,"15/05/2020","20/05/2020",pieces*289.90,20,"Remaining",pieces);
                                            file1.add(X2);
                                            System.out.println(X2);
                                            Orders1.put(X2,pieces);
                                            numorders.add(X2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }else if (typechoise==3){
                            System.out.println("You have chosen the type : "+Refrigerators[typechoise-1]);
                            System.out.println("In our store you can choose the following models :");
                            file.add(Y);
                            file.add(Z);
                            CreateFileApp app = new CreateFileApp(file);
		                    app.CreateList();
                            app.CreateFile();
                            app.PrintFile();
                            ReadFileApp app3 = new ReadFileApp ();
		                    app3.ReadFile();
		                    app3.PrintList();
                            System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");
                            int modelschoise=myObj.nextInt();
                            if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+Y+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(Y)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales Y1=new Sales("Refrigerators",salescode,models[23],nameNnumber,"15/05/2020",pieces*954.00,20,pieces);
                                        file2.add(Y1);
                                        System.out.println(Y1+"\n\nThank you for your Purchase!");
                                        Sales1.put(Y,pieces);
                                        Availabledev.replace(Y,(Availabledev.get(Y)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(Y)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders Y2=new Orders("Refrigerators",orderscode,models[23],nameNnumber,"15/05/2020","20/05/2020",pieces*954.00,20,"Remaining",pieces);
                                            file1.add(Y2);
                                            System.out.println(Y2);
                                            Orders1.put(Y2,pieces);
                                            numorders.add(Y2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+Z+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(Z)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales Z1=new Sales("Refrigerators",salescode,models[24],nameNnumber,"15/05/2020",pieces*1099.99,20,pieces);
                                        file2.add(Z1);
                                        System.out.println(Z1+"\n\nThank you for your Purchase!");
                                        Sales1.put(Z,pieces);
                                        Availabledev.replace(Z,(Availabledev.get(Z)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(Z)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders Z2=new Orders("Refrigerators",orderscode,models[24],nameNnumber,"15/05/2020","20/05/2020",pieces*1099.99,20,"Remaining",pieces);
                                            file1.add(Z2);
                                            System.out.println(Z2);
                                            Orders1.put(Z2,pieces);
                                            numorders.add(Z2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                        }
                    }else if (catchoise==2) { 
                        System.out.println("In our store you can choose the following models :");
                        file.add(AA);
                        file.add(AB);
                        file.add(AC);
                        CreateFileApp app = new CreateFileApp(file);
		                app.CreateList();
                        app.CreateFile();
                        app.PrintFile();
                        ReadFileApp app3 = new ReadFileApp ();
		                app3.ReadFile();
		                app3.PrintList();
                        System.out.println("\n\nChoose your item! \nPress the increasing number as the items are presented.(For example if you want the first item press 1 e.t.c)");  
                        int modelschoise=myObj.nextInt(); 
                        if (modelschoise==1){
                                System.out.println("-----------------------------------------\n"+AA+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(AA)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales AA1=new Sales("Washer",salescode,models[25],nameNnumber,"15/05/2020",pieces*384.99,20,pieces);
                                        file2.add(AA1);
                                        System.out.println(AA1+"\n\nThank you for your Purchase!");
                                        Sales1.put(AA,pieces);
                                        Availabledev.replace(AA,(Availabledev.get(AA)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(AA)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders AA2=new Orders("Washer",orderscode,models[25],nameNnumber,"15/05/2020","20/05/2020",pieces*384.99,20,"Remaining",pieces);
                                            file1.add(AA2);
                                            System.out.println(AA2);
                                            Orders1.put(AA2,pieces);
                                            numorders.add(AA2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==2){
                                System.out.println("-----------------------------------------\n"+AB+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(AB)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales AB1=new Sales("Washer",salescode,models[26],nameNnumber,"15/05/2020",pieces*394.00,20,pieces);
                                        file2.add(AB1);
                                        System.out.println(AB1+"\n\nThank you for your Purchase!");
                                        Sales1.put(AB,pieces);
                                        Availabledev.replace(AB,(Availabledev.get(AB)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(AB)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders AB2=new Orders("Washer",orderscode,models[26],nameNnumber,"15/05/2020","20/05/2020",pieces*394.00,20,"Remaining",pieces);
                                            file1.add(AB2);
                                            System.out.println(AB2);
                                            Orders1.put(AB2,pieces);
                                            numorders.add(AB2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }else if (modelschoise==3){
                                System.out.println("-----------------------------------------\n"+AC+"\n-----------------------------------------");
                                System.out.println("Do you want to buy it?\n\n1. YES \n2. NO");
                                int finalchoise=myObj.nextInt();
                                if (finalchoise==1){
                                    System.out.println("How many pieces of this device you want to buy?");
                                    int pieces=myObj.nextInt();
                                    if (Availabledev.get(AC)>=pieces && pieces!=0){
                                        System.out.println("Please enter your Fullnameand then your Phone number");
                                        String nameNnumber=myObj1.nextLine();
                                        salescode++;
                                        Sales AC1=new Sales("Washer",salescode,models[27],nameNnumber,"15/05/2020",pieces*379.00,20,pieces);
                                        file2.add(AC1);
                                        System.out.println(AC1+"\n\nThank you for your Purchase!");
                                        Sales1.put(AC,pieces);
                                        Availabledev.replace(AC,(Availabledev.get(AC)-pieces));

                                    }else {
                                        if (pieces==0){
                                            System.out.println("You can't take 0 pieces.Please enter a logic number!\n\n");
                                            continue;
                                        }
                                        System.out.println("There are only "+Availabledev.get(AC)+" pieces!Do you want to order them?(1. YES 2.NO)");
                                        int YN=myObj.nextInt();
                                        if (YN==1){
                                            System.out.println("Please enter your Fullname and then your Phone number");
                                            String nameNnumber=myObj1.nextLine();
                                            orderscode++;
                                            Orders AC2=new Orders("Washer",orderscode,models[27],nameNnumber,"15/05/2020","20/05/2020",pieces*379.00,20,"Remaining",pieces);
                                            file1.add(AC2);
                                            System.out.println(AC2);
                                            Orders1.put(AC2,pieces);
                                            numorders.add(AC2);
                                        }else if (YN==2){
                                            continue;
                                        }

                                    }    
                                }else if(finalchoise==2){
                                    continue;
                                }
                            }
                    }    
                }

            }else if (answer==1){
                if (file1.isEmpty()==true){
				    System.out.println("\nThere are not Remaining Orders!");
                    continue;
                }else{
                    System.out.println("These are the Remaining orders : ");
                    CreateFileApp1 app2 = new CreateFileApp1(file1);
		            app2.CreateList();
                    app2.CreateFile();
                    app2.PrintFile();
                }
                if (Orders1.isEmpty()==false){
                    System.out.println("\n\nChoose your order! \nPress the increasing number as the orders are presented.(For example if you want the first order press 1 e.t.c)");
                    int pickorder=myObj.nextInt();
                    System.out.println("\n\nPieces : "+Orders1.get(numorders.get(pickorder-1))+"\nDevice : \n"+numorders.get(pickorder-1));
                    System.out.println("\n1. order arrival and sale \n2. Exit \n\nGive your choise");

                    int b=0;
                    for (Object numorder:numorders){
                        b++;
                    }
                    if ((pickorder-1)<=b){
                        int ordNsale =myObj.nextInt();
                        if (ordNsale==1){
                            file2.add(file1.get(pickorder-1));
                            file1.remove(file1.get(pickorder-1));
                            Sales1.put(numorders.get(pickorder-1),Orders1.get(numorders.get(pickorder-1)));
                            Orders1.remove(numorders.get(pickorder-1));
                            System.out.println("\n\nThank you for your purchase!");
                        }else {
                            continue;
                        }
                    }else {
                        continue;
                    }
                }

            }else if (answer==2){
                if (file2.isEmpty()==true){
				    System.out.println("\nThere are not Sales for today!");
                    continue;
                }else{
                    System.out.println("These are the sales for today : ");
                    CreateFileApp2 app3 = new CreateFileApp2(file2);
		            app3.CreateList();
                    app3.CreateFile();
                    app3.PrintFile();
                }
            }else if (answer==3){
                System.out.println("Good bye!!!");
                done=false;
            }
        }
    }
}