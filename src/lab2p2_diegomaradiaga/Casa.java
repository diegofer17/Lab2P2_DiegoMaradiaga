package lab2p2_diegomaradiaga;

import java.awt.Color;

public class Casa {
    private int NumCasa;
    private int NumBloq;
    private Color color;
    private int ancho;
    private int largo;
    private int NumBanos;
    private int NumCuartos;
    private String EstadoC;
    private String Dueno;

    public Casa() {
    }

    public Casa(int NumCasa, int NumBloq, Color color, int ancho, int largo, int NumBanos, int NumCuartos, String EstadoC, String Dueno) {
        this.NumCasa = NumCasa;
        this.NumBloq = NumBloq;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.NumBanos = NumBanos;
        this.NumCuartos = NumCuartos;
        this.EstadoC = EstadoC;
        this.Dueno = Dueno;
    }

    public int getNumCasa() {
        return NumCasa;
    }

    public void setNumCasa(int NumCasa) {
        this.NumCasa = NumCasa;
    }

    public int getNumBloq() {
        return NumBloq;
    }

    public void setNumBloq(int NumBloq) {
        this.NumBloq = NumBloq;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getNumBanos() {
        return NumBanos;
    }

    public void setNumBanos(int NumBanos) {
        this.NumBanos = NumBanos;
    }

    public int getNumCuartos() {
        return NumCuartos;
    }

    public void setNumCuartos(int NumCuartos) {
        this.NumCuartos = NumCuartos;
    }

    public String getEstadoC() {
        return EstadoC;
    }

    public void setEstadoC(String EstadoC) {
        this.EstadoC = EstadoC;
    }

    public String getDueno() {
        return Dueno;
    }

    public void setDueno(String Dueno) {
        this.Dueno = Dueno;
    }

    @Override
    public String toString() {
        return "Casa{" + "NumCasa=" + NumCasa + ", NumBloq=" + NumBloq + ", color=" + color + ", ancho=" + ancho + ", largo=" + largo + ", NumBanos=" + NumBanos + ", NumCuartos=" + NumCuartos + ", EstadoC=" + EstadoC + ", Dueno=" + Dueno + '}';
    }
    
    
    
}
