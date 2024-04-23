package actividad_02_ud3_ed;

/**
 * La clase CCuenta representa una cuenta bancaria con atributos como nombre del titular, número de cuenta, saldo y tipo de interés.
 * Permite realizar operaciones como ingresos y retiros de dinero.
 *
 * @author Ana
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    protected String nombre;

    /** Número de cuenta */
    private String cuenta;

    /** Saldo actual de la cuenta */
    private double saldo;

    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Asigna un nombre al titular de la cuenta.
     *
     * @param nom Nombre del titular de la cuenta.
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular de la cuenta.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     *
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si se intenta ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(saldo + cantidad);
    }

    /**
     * Realiza un retiro de la cuenta.
     *
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(saldo - cantidad);
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta.
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta Número de cuenta a establecer.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo Saldo de la cuenta a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     *
     * @return Tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés Tipo de interés a establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
