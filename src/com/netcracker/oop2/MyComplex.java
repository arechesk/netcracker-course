package com.netcracker.oop2;

public class MyComplex {
    private double real=0.0;
    private double imag =0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "("+real+","+ imag +"i)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return (myComplex.real == real) && (myComplex.imag == imag);
    }
    public boolean equals(double real, double imag) {
        return (this.real == real) && (this.imag == imag);
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public boolean isReal() {
        return real != 0;
    }
    public boolean isImagine() {
        return imag != 0;
    }
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }
    public double argument() {
        return Math.atan(imag/real);
    }
    public MyComplex add(MyComplex right) {
        real += right.real;
        imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }
    public MyComplex subtract(MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real, imag-right.imag);
    }
    public MyComplex multiply(MyComplex right) {
        double newReal = real * right.real - imag * right.imag;
        double newImag = real * right.imag + imag * right.real;
        real = newReal;
        imag = newImag;
        return this;
    }
    public MyComplex divide(MyComplex right) {
        double newReal = (real * right.real + imag * right.imag) /
                (right.real * right.real + right.imag * right.imag);
        double newImag = (right.real * imag - real * right.imag) /
                (right.real * right.real + right.imag * right.imag);
        real = newReal;
        imag = newImag;
        return this;
    }
    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(real);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imag);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
