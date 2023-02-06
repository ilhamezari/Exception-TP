package exe1.example;

import exe1.EntierNaturel;

public class Application1 {

    public static void main(String[] args) throws NombreNegatifException {




     try {
            EntierNaturel entier1 = new EntierNaturel(10);
            System.out.println("entier 1 :=" + entier1.getVal());
            EntierNaturel entier2 = new EntierNaturel(-10);
            System.out.println("entier 2 :=" + entier2.getVal());
            EntierNaturel entier3 = new EntierNaturel(0);
            System.out.println("entier 3 :=" + entier3.getVal());
        } catch (NombreNegatifException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            // System.exit(-1);
        }
        System.out.println("--------------------------------------------------");
// setVal()
        try {
            EntierNaturel entier5 = new EntierNaturel(10);
            entier5.setVal(5);
            System.out.println("Modification OK : " + entier5.getVal());
            EntierNaturel entier6 = new EntierNaturel(10);
            entier5.setVal(-5);
            System.out.println("Modification OK : " + entier6.getVal());
        } catch (NombreNegatifException e1) {
            System.out.println("entier doit etre positif et non null!");
        }
        System.out.println("--------------------------------------------------");

        //System.out.println(entier1.setVal(2));
        // EntierNaturel entier2 = new EntierNaturel(20);
        //entier1.setVal(20);*/
//Décrémenter
    try {
            EntierNaturel entier3 = new EntierNaturel(10);
            entier3.decrementer();
            System.out.println("décrémentation OK : " + entier3.getVal());
            EntierNaturel entier4 = new EntierNaturel(-10);
            entier3.decrementer();
            System.out.println("décrémentation OK : " + entier3.getVal());


        } catch (NombreNegatifException e) {
            System.out.println("entier doit etre positif et non null!");
        }
    }}


