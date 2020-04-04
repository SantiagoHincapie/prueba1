import javax.swing.*;
import java.util.Scanner;

public class holaMundo
{
    public static void main(String[] args)
    {
     //int ocupa 32 bit(va desde -2millones147mil hasta 2millones147mil) de memoria y long que ocupa 64bit de memoria
        //para los float colocamos el numerodecimalf y la f al final mientras que con el double no.
        //EL concatenador es el simbolo +
        //el dato de tipo char es de tipo ''
        //boolean siempre seran del tipo boolean desicion=TRUE o false
        //datos de tipos no primitibos son aquellos que almacenan NULL ademas tambien tienen metodos estos datos son :Integer,string
        //las constantes se declaran con la palabra final antes de la declaracion del tipo de dato ej:final int=10;
        //JOptionPane Es la entrada y salida de datos pero con ventanas emergentes

        Scanner lector=new Scanner(System.in);
        String cadena;
        int numero;
        char letra;
        double decimal;

        cadena= JOptionPane.showInputDialog("Digite su nombre:");
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numeo de su cuenta"));
        letra=JOptionPane.showInputDialog("Dijite una letra").charAt(0);
        decimal=Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));
        

    }
}
