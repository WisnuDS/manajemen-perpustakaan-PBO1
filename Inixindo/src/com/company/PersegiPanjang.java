package com.company;

public class epp {
    private double p,l;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public epp() {
        setP(4);
        setL(3);
    }

    public epp(double p, double l) {
        this.p = p;
        this.l = l;
    }

    @Override
    public String toString() {
        return "epp{" +
                "p=" + p +
                ", l=" + l +
                '}';
    }
}
