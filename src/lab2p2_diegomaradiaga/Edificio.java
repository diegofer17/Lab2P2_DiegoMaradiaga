package lab2p2_diegomaradiaga;

public class Edificio {
    private int NumPisos;
    private int CantLocal;
    private String DxRefer;
    private String EstadoE;

    public Edificio() {
    }

    public Edificio(int NumPisos, int CantLocal, String DxRefer, String EstadoE) {
        this.NumPisos = NumPisos;
        this.CantLocal = CantLocal;
        this.DxRefer = DxRefer;
        this.EstadoE = EstadoE;
    }

    public int getNumPisos() {
        return NumPisos;
    }

    public void setNumPisos(int NumPisos) {
        this.NumPisos = NumPisos;
    }

    public int getCantLocal() {
        return CantLocal;
    }

    public void setCantLocal(int CantLocal) {
        this.CantLocal = CantLocal;
    }

    public String getDxRefer() {
        return DxRefer;
    }

    public void setDxRefer(String DxRefer) {
        this.DxRefer = DxRefer;
    }

    public String getEstadoE() {
        return EstadoE;
    }

    public void setEstadoE(String EstadoE) {
        this.EstadoE = EstadoE;
    }

    @Override
    public String toString() {
        return "Edificio{" + "NumPisos=" + NumPisos + ", CantLocal=" + CantLocal + ", DxRefer=" + DxRefer + ", EstadoE=" + EstadoE + '}';
    }
    
    
}
