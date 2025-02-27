package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwitch,String merk ) {
        super(merk, promisedBandwitch, harga);
    }

    @Override
    public double getRealBandwitch() {
        int HargaNormal = 30000;
        int HargaJual = super.getHarga();
        double Rasio = HargaJual / (double) HargaNormal ;
        if (Rasio < 1) {
            return super.getPromisedBandwitch() * Rasio;
        } else {
            return super.getPromisedBandwitch();
        }
    }
}
