package com.mycompany.ed04_contornos.cuentas;

/**
 * Clase que representa una cuenta bancaria y nos da los estados de la misma
 * @author Cecilia Naveira
 * @since 29/02/2024
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros de la clase CCuenta
     * @param nom Nombre del titular
     * @param cue Numero de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para obtener el saldo actual
     * @return saldo actual 
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Métido para ingresar una cantidad
     * @param cantidad cantidad ingresar en la cuenta
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar una cantidad en la cuenta
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es negativa o mayor al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Método para obtener el nombre del titular de la cuenta
     * @return nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el número de cuenta
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para obtener el saldo
     * @return saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para obtener el tipo de interés
     * @return tipo interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para oestablecer nombre del tirular
     * @param nombre nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para establecer el número de cuenta
     * @param cuenta número de cuena
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para establecer el saldo actual
     * @param saldo saldo actual
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para establecer el tipo de interés
     * @param tipoInterés tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
