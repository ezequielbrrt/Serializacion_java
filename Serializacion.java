/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;
import java.io.*;
import java.net.*;
/**
 *
 * @author Usuario
 */
public class Serializacion {
    public static void main(String[] args) {
        Usuario us = new Usuario(53,"ezequiel","barreto","aviles","avenida siempre viva", 911, 123);
        FileOutputStream fos =null;
        ObjectOutputStream oos = null;
        try{
            fos=new FileOutputStream("./usuario.txt");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(us);
            oos.close();
            System.out.println(us.toString());
        }catch(IOException e){
            System.out.println(e);
        }
    
    }
    
}
