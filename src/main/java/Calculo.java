import javax.swing.JOptionPane;
public class Calculo {
   public String Altura = JOptionPane.showInputDialog("Altura: ");
   public String Largura = JOptionPane.showInputDialog("Largura: ");
   public String Comprimento = JOptionPane.showInputDialog("Comprimento: ");
   int AlturaINT = Integer.parseInt(Altura);
   int LarguraINT = Integer.parseInt(Largura);
   int ComprimentoINT = Integer.parseInt(Comprimento);
   private int Volume;
   
   public void setVolume (int Volume){
       this.Volume = Volume;
   }
   
   public int getVolume(){
       return Volume;
   }

   public void Calcular (){
      Volume = AlturaINT * LarguraINT * ComprimentoINT;
      setVolume(Volume);
      JOptionPane.showMessageDialog(null, "Volume: " + Volume);
   }
   
}
