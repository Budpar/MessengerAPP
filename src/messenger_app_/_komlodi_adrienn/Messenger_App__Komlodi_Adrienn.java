package messenger_app_._komlodi_adrienn;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Messenger_App__Komlodi_Adrienn {

    public static void main(String[] args) {
        Map<String, Felhasznalo> felhasznalok = new TreeMap<>();      
        Scanner sc = new Scanner(System.in);
        felhasznalok.put("t1email@gmail.com", new Felhasznalo("t1email@gmail.com","Makos Janos"));
        felhasznalok.put("t2email@gmail.com", new Felhasznalo("t2email@gmail.com","Lakatos Ferenc"));
        felhasznalok.put("t3email@gmail.com", new Felhasznalo("t3email@gmail.com","Szerendei Julia"));
        felhasznalok.put("t4email@gmail.com", new Felhasznalo("t4email@gmail.com","Hermel Gabor"));
        boolean kilepes = false;
        boolean fiokbolkilep = false;
        
        do{
            System.out.println("Bejelentkezéshez szükséges email:\n (Kilepes eseten hagyja uresen)");
            String email = sc.nextLine();
            
            if(!email.isEmpty()){
                if(felhasznalok.containsKey(email)){
                    System.out.println("Szeretne üzenetet küldeni? \n 1 - Igen \n 2 - Nem \n 3 - Kilepes");
                    int valasz = sc.nextInt();
                    
                    switch(valasz){
                            case 1:
                                    System.out.println("Kérem adjon meg egy emailt: ");
                                    String cimzettEmailje = sc.nextLine();
                                    System.out.println("Kérem adjon meg egy nevet: " + felhasznalok.get(cimzettEmailje).toString());
                                    System.out.println("Kérem adja meg az uzenetet: ");
                                    String uzenetCF = sc.nextLine();
                                    felhasznalok.get(email).ujUzenetK(new Uzenet(uzenetCF,felhasznalok.get(email),felhasznalok.get(cimzettEmailje)));
                                    felhasznalok.get(cimzettEmailje).ujUzenetB(new Uzenet(uzenetCF,felhasznalok.get(email),felhasznalok.get(cimzettEmailje)));
                                break;
                            case 2:
                                fiokbolkilep = true;
                                break;
                            case 3:
                                kilepes = true;
                                break;
                            default:
                                System.out.println("Hiba: Rossz adatot adott meg!");
                                break;
                        }
                }else{
                    System.out.println("Hiba keletkezett a gépezetben!");
                }
            }else{
                 if(fiokbolkilep == true){
                    System.out.println("Bejelentkezéshez szükséges email:\n (Kilepes eseten hagyja uresen)");
                    email = sc.nextLine();
                 }
            }
        }while(kilepes == true);
    }
}
