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
public class Deserializacion {
    public static void main(String[] args){
        Usuario user = null;
        try{
            FileInputStream fis=new FileInputStream("./usuario.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            user=(Usuario)ois.readObject();
            ois.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException cn){
            System.out.println("No se encuentra la clase usuario");
            cn.printStackTrace();
    }
        System.out.println(user.toString());
    }
}
