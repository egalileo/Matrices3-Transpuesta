package matrices3.transpuesta;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Galileo :B
 *
 * Elaborar un programa de Java with Ant usando matrices el cual devuelva la
 * transpuesta de una matriz que llenaremos de valores automaticamente. Ejemplo:  *
 * 1 2 3 | 1 4 7
 * 4 5 6 | 2 5 8
 * 7 8 9 | 3 6 9
 *
 *
 */
public class Matrices3Transpuesta {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int transpuesta[][] = new int[3][3];
        JTextArea hoja = new JTextArea();
        int fila, columna, contador=1;
        String salida ="";

        for (fila = 0; fila < 3; fila++) {
            for (columna = 0; columna < 3; columna++) {
                matriz[fila][columna]= contador;
                contador++;
            }
        }
        
        
        for (fila = 0; fila < 3; fila++) {
            for (columna = 0; columna < 3; columna++) {
                salida += matriz[fila][columna]+ "\t";
               
            }
            salida+="\n";
        }
        hoja.setText(salida);
        JOptionPane.showMessageDialog(null, hoja);
        
        
        for(columna=0; columna<3; columna++){
            for(fila=0; fila<3;fila++){
                transpuesta[fila][columna]= matriz[columna][fila];
            }
        }
        
        salida="Transpuesta\n";
         for (fila = 0; fila < 3; fila++) {
            for (columna = 0; columna < 3; columna++) {
                salida += transpuesta[fila][columna]+ "\t";
               
            }
            salida+="\n";
        }
        hoja.setText(salida);
        JOptionPane.showMessageDialog(null, hoja);
        
    }

}
