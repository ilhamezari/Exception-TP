package exe1;
import exe1.example.NombreNegatifException;

public class EntierNaturel {
    int val;
    //EntierNaturel entier0 = new EntierNaturel(val);

    public EntierNaturel(int val) throws NombreNegatifException {
          if (val<0 || val == 0) throw new NombreNegatifException("entier doit etre >0!");
         this.val = val;
    }

    public int getVal() {
        return this.val;
       // return entier0.getVal();
    }

    public void setVal(int val) throws NombreNegatifException {

        if (val<0 || val == 0) throw new NombreNegatifException("valeur négatif!!");
        this.val = val;

    }
   public void decrementer() throws NombreNegatifException {
        if (val < 0 || val ==0) {
            throw new NombreNegatifException("entier  etre >0 et pas 0!");
        }
        else
           this.val--;
            }






      /*  if (val<0 || val ==0) throw new NombreNegatifException("valeur négatif!!");
        return val = --val;*/

    }

