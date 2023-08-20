
package Poo;


public class Notas {

    public String getNota_corte1() {
        return nota_corte1;
    }

    public void setNota_corte1(String nota_corte1) {
        this.nota_corte1 = nota_corte1;
    }

    public String getNota_corte2() {
        return nota_corte2;
    }

    public void setNota_corte2(String nota_corte2) {
        this.nota_corte2 = nota_corte2;
    }
    
String nota_corte1, nota_corte2;
int defini;
String sum2;

    public String getSum2() {
        return sum2;
    }

    public void setSum2(String sum2) {
        this.sum2 = sum2;
    }

    public int getDefini() {
        return defini;
    }

    public void setDef(int def) {
        this.defini = def;
    }
    
    
     public Notas(String nota_corte1, String nota_corte2) {
        this.nota_corte1 = nota_corte1;
        this.nota_corte2 = nota_corte2;
         /* defini = Integer.parseInt(nota_corte1) + Integer.parseInt(nota_corte2);*/
    sum2 = String.valueOf(Integer.parseInt(nota_corte1) + Integer.parseInt(nota_corte2));
      
  
  
   
         
        
       
    }
    @Override
    public String toString() {
        return "Notaas{" + "nota_corte1=" + nota_corte1 + ", nota_corte2=" + nota_corte2 + ", suma2=" + sum2 +  '}';
    }
   
}

