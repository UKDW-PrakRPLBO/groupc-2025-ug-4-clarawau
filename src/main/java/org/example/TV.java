package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int resolusi) {
        maxResolusi = resolusi;
    }

    public int getMaxResolusi() {
        return maxResolusi;
    }


    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("berhasil connect ke - " + colokan.getMerk());
    }

    public int getResolution() {
        double bw = colokan.getRealBandwitch();
        int maxResolusi;

        if (bw > 10 && bw <= 35) {
            maxResolusi = 480;
        } else if (bw > 35 && bw <= 100) {
            maxResolusi = 720;
        } else {
            maxResolusi = 1080;
        }
        if (this.maxResolusi < maxResolusi) {
            return this.maxResolusi;
        } else {
            return maxResolusi;
        }
    }
}
