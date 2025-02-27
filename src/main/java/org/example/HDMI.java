package org.example;

public class HDMI extends Colokan{

    public HDMI(int harga, double promisedBandwitch,String merk ) {
        super(merk, promisedBandwitch, harga);
    }

    @Override
    public double getRealBandwitch() {
        int HargaNormal = 50000;
        int HargaJual = super.getHarga();
        double Rasio = HargaJual / (double) HargaNormal ;
        if (Rasio < 1) {
            System.out.println(super.getPromisedBandwitch() * Rasio);
            return super.getPromisedBandwitch() * Rasio;
        } else {
            return super.getPromisedBandwitch();
        }

    }
}
