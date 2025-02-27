package org.example;

public abstract class Colokan {
    private String Merk;
    private double promisedBandwitch;
    private int harga;



    public String getMerk() {
        return Merk;
    }

    public void setMerk(String colokan) {
        this.Merk = Merk;
    }

    public double getPromisedBandwitch() {
        return promisedBandwitch;
    }

    public void setPromisedBandwitch(Double promisedBandwitch) {
        this.promisedBandwitch = promisedBandwitch;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Colokan(String merk, Double promisedBandwitch, int harga) {
        Merk = merk;
        this.promisedBandwitch = promisedBandwitch;
        this.harga = harga;
    }

    public abstract double getRealBandwitch();
}
