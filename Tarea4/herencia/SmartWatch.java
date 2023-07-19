package herencia;

import clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    private String conectividad;
    private  boolean antigua;
    private String tipomanilla;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String marca, String modelo, String color, int anio, String conectividad, boolean antigua, String tipomanilla) {
        super(marca, modelo, color, anio);
        this.conectividad = conectividad;
        this.antigua = antigua;
        this.tipomanilla = tipomanilla;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public boolean isAntigua() {
        return antigua;
    }

    public void setAntigua(boolean antigua) {
        this.antigua = antigua;
    }

    public String getTipomanilla() {
        return tipomanilla;
    }

    public void setTipomanilla(String tipomanilla) {
        this.tipomanilla = tipomanilla;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "Marca=" + getMarca() + "," +
                "Modelo=" + getModelo() + "," +
                "Color=" + getColor() + "," +
                "Año=" + getAnio() + "," +
                "conectividad='" + conectividad + '\'' +
                ", antigua=" + antigua +
                ", tipomanilla='" + tipomanilla + '\'' +
                '}';
    }
}
