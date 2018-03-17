/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author Damian
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Correo c1 =new Correo("primer correo");
        Correo c2 =new Correo("segundo correo");
        Correo c3 =new Correo("tercer correo");
        Correo c4 =new Correo("cuarto correo");
        c4.setEstado(true);
       Buzon.bandejaentrada.add(c1);
       Buzon.bandejaentrada.add(c2);
       Buzon.bandejaentrada.add(c3);
       Buzon.bandejaentrada.add(c4);
       
       int resposta=0;
       
       while(resposta!=1){
  
       String[] opciones={"ler","borrar","por ler","amosar primeiro non lido","numero de correos","engade"};
           
           String r=(String)JOptionPane.showInputDialog(null,"Selecciona opcion:"," ",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones);
                
                    switch(r){
                        case "ler":
                            System.out.println(Buzon.amosa(Integer.parseInt(JOptionPane.showInputDialog("Numero de correo a ler?"))));
                            break;
                        case "borrar":
                            System.out.println(Buzon.borrar(Integer.parseInt(JOptionPane.showInputDialog("Numero de correo a borrar?"))));
                            break;
                        case "amosar primeiro non lido":
                            Buzon.primerNoLido();
                            break;
                        case "numero de correos":
                            System.out.println(Buzon.numeroCorreos());
                            break;
                        case "por ler":
                            System.out.println(Buzon.porLer());
                            break;
                        case "engade":
                            Correo c;
                            c=new Correo(JOptionPane.showInputDialog(null,"Dame o correo"));
                            Buzon.engade(c);
                            break;
    }
    
}
    }
}
