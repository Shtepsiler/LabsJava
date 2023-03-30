import java.util.Random;
class DoubleVector {
    private double[] vector = null;

    public static DoubleVector TestVector(int n) {
        Random rand = new Random();
        double[] vector1 = new double[n];

        for (int i=0;i<n;i++){
            vector1[i] = rand.nextDouble();
        }
        return new DoubleVector(vector1);
    }
    public static String ToString( DoubleVector vector1){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i<vector1.vector.length;i++) {
            stringBuilder.append(vector1.vector[i]);
            stringBuilder.append(" ");
        }
return stringBuilder.toString();
    }

    public DoubleVector(double[] vector) {
        this.vector = vector;
    }

    // Скалярний добуток векторів
    public double mult(DoubleVector anotherVector) {
        double s = 0;
        for (int i = 0; i < vector.length; i++) {
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }



    public static DoubleVector sum(DoubleVector a, DoubleVector b) {
        double[] c = new double[a.vector.length];
        for (int i = 0; i < a.vector.length; i++) {
            c[i] = a.vector[i] + b.vector[i];
        }
        return new DoubleVector(c);
    }

    public static DoubleVector diff(DoubleVector a, DoubleVector b) {
        double[] c = new double[a.vector.length];
        for (int i = 0; i < a.vector.length; i++) {
            c[i] = a.vector[i] - b.vector[i];
        }
        return new DoubleVector(c);
    }

    public static DoubleVector multiplyByInt(DoubleVector a, int n) {
        double[] c = new double[a.vector.length];
        for (int i = 0; i < a.vector.length; i++) {
            c[i] = a.vector[i] * n;
        }
        return new DoubleVector(c);
    }

    public static DoubleVector multiplyByDouble(DoubleVector a, double n) {
        double[] c = new double[a.vector.length];
        for (int i = 0; i < a.vector.length; i++) {
            c[i] = a.vector[i] * n;
        }
        return new DoubleVector(c);
    }


    public DoubleVector sum(DoubleVector b) {
        double[] c = new double[this.vector.length];
        for (int i = 0; i < this.vector.length; i++) {
            c[i] = this.vector[i] + b.vector[i];
        }
        return new DoubleVector(c);
    }

    public DoubleVector diff(DoubleVector b) {
        double[] c = new double[this.vector.length];
        for (int i = 0; i < this.vector.length; i++) {
            c[i] = this.vector[i] - b.vector[i];
        }
        return new DoubleVector(c);
    }

    public DoubleVector multiplyByInt(int n) {
        double[] c = new double[this.vector.length];
        for (int i = 0; i < this.vector.length; i++) {
            c[i] = this.vector[i] * n;
        }
        return new DoubleVector(c);
    }

    public DoubleVector multiplyByDouble(double n) {
        double[] c = new double[this.vector.length];
        for (int i = 0; i < this.vector.length; i++) {
            c[i] = this.vector[i] * n;
        }
        return new DoubleVector(c);
    }

    public static void print(DoubleVector a) {
        for (var n : a.vector) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();

    }

}

