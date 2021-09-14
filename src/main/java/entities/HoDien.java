package entities;

public abstract class HoDien {
    protected int soDienTieuThu;
    protected final double vat = 0.1;
    public abstract int giaDien ();
    public abstract void inPut ();
    public HoDien (){

    }
    public HoDien(int soDienTieuThu){
        this.soDienTieuThu=soDienTieuThu;
    }

}
