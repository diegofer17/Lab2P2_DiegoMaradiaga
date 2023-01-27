package lab2p2_diegomaradiaga;

public class Solar {
    private int anchoS;
    private int largoS;
    private int areaS;
    private String Dueno;

    public Solar() {
    }

    public Solar(int anchoS, int largoS, int areaS, String Dueno) {
        this.anchoS = anchoS;
        this.largoS = largoS;
        this.areaS = areaS;
        this.Dueno = Dueno;
    }

    public int getAnchoS() {
        return anchoS;
    }

    public void setAnchoS(int anchoS) {
        this.anchoS = anchoS;
    }

    public int getLargoS() {
        return largoS;
    }

    public void setLargoS(int largoS) {
        this.largoS = largoS;
    }

    public int getAreaS() {
        return areaS;
    }

    public void setAreaS(int areaS) {
        this.areaS = areaS;
    }

    public String getDueno() {
        return Dueno;
    }

    public void setDueno(String Dueno) {
        this.Dueno = Dueno;
    }

    @Override
    public String toString() {
        return "Solar{" + "anchoS=" + anchoS + ", largoS=" + largoS + ", areaS=" + areaS + ", Dueno=" + Dueno + '}';
    } 
    
}
