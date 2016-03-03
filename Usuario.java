/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;

/**
 *
 * @author Usuario
 */
public class Usuario  implements Serializable{
    private int idUsuario;
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private String direccion;
    private int telefono;
    private int numCuenta;
    
    public Usuario(int idUsuario, String nombre,String apellidoPat, String apellidoMat, String direccion,int telefono, int numCuenta){
          this.idUsuario = idUsuario;
          this.nombre = nombre;
          this.apellidoPat = apellidoPat;
          this.apellidoMat = apellidoMat;
          this.direccion = direccion;
          this.telefono = telefono;
          this.numCuenta = numCuenta;
    }
    
    //Métodos de la clase
    public double consultarSaldo(int numCuenta){
        double saldo = 0;
        return 0;
    }
    public void retirarSaldo(int numCuenta){
    }
    public void depositar(int numCuenta){
    }

    //inicilizacion de atributos
    public int getidUsuario() {
        return idUsuario;
    }

    public void setidUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPat + ", apellidoMaterno=" 
                + apellidoMat + ", direccion=" + direccion +", telefono="+telefono+ '}';
    }
}
