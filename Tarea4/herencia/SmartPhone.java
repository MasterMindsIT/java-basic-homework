package herencia;

import clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    private  String sistema;
    private int ram;
    private int hdd;

    public SmartPhone(String sistema, int ram, int hdd) {
        this.sistema = sistema;
        this.ram = ram;
        this.hdd = hdd;
    }

    public SmartPhone() {
        super();
    }

    public SmartPhone(String marca, String modelo, String color, int anio, String sistema, int ram, int hdd) {
        super(marca, modelo, color, anio);
        this.sistema = sistema;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "Marca=" + getMarca() + "," +
                "Modelo=" + getModelo() + "," +
                "Color=" + getColor() + "," +
                "Año=" + getAnio() + "," +
                "sistema='" + sistema + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
