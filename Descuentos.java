import java.util.Scanner;

public class Descuentos {
    public static void main(String[] args) {

     final int Descuento1 = 25;
     final int Descuento2 = 50;
     float Descuento1real = Descuento1;
     float Descuento2real = Descuento2;
    float importeInicial, importeDescontado, importeFinal;
    int numpiezas;
    
    Scanner myObj = new Scanner(System.in);
    System.out.println("Inserte numero de piezas");
    numpiezas = myObj.nextInt();
    Scanner myObj2 = new Scanner(System.in);
    System.out.println("Inserte importe inicial");
    importeInicial = myObj2.nextFloat();
    if(numpiezas <= 3){
        
        importeDescontado = importeInicial * (Descuento1real / 100);
    } 
    else {
        
        importeDescontado = importeInicial * (Descuento2real / 100);
    }
    importeFinal = (importeInicial - importeDescontado) * numpiezas;
    System.out.println("El importe final será: " + importeFinal);
    }
}