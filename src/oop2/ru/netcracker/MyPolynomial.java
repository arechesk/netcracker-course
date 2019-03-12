package oop.ru.netcracker;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    @Override
    public String toString() {
        String result = "";
        result += coeffs[coeffs.length-1] + "x^" + (coeffs.length-1);
        for (int i = coeffs.length-2; i>0; --i) {
            if (coeffs[i] == 0)
                continue;
            if (coeffs[i]>0)
                result += "+";
            result += coeffs[i] + "x";
            if (i != 1)
                result += "^" + i;
        }
        if (coeffs[0] != 0) {
            if (coeffs[0]>0)
                result += "+";
            result += coeffs[0];
        }
        return result;
    }
    public int getDegree() {
        return coeffs.length - 1;
    }
    public MyPolynomial add(MyPolynomial right) {
        double[] newCoeffs = new double[Math.max(coeffs.length, right.coeffs.length)];
        for (int i = 0; i < coeffs.length; ++i)
            newCoeffs[i] += coeffs[i];
        for (int i = 0; i < right.coeffs.length; ++i)
            newCoeffs[i] += right.coeffs[i];
        return new MyPolynomial(newCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs = new double[coeffs.length + right.coeffs.length];
        for (int i = 0; i < coeffs.length; ++i) {
            for (int j = 0; j < right.coeffs.length; ++j)
                newCoeffs[i + j] += coeffs[i] * right.coeffs[j];
        }
        return new MyPolynomial(newCoeffs);
    }

}
