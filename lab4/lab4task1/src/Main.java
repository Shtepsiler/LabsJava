class DoubleVector {
    private double[] vector = null;
    public DoubleVector(double[] vector){
        this.vector = vector;
    }
    // Скалярний добуток векторів
    public double mult(DoubleVector anotherVector){
        double s = 0;
        for ( int i = 0; i < vector.length; i++ ){
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }
    public static double mult(DoubleVector a, DoubleVector b){
        return a.mult(b);
    }
    public static DoubleVector sum (DoubleVector a, DoubleVector b){
        double[] c = new double[a.vector.length];
        for(int i=0; i < a.vector.length;i++){
            c[i]= a.vector[i]+b.vector[i];
        }
        return new DoubleVector(c);
    }
    public static DoubleVector diff (DoubleVector a, DoubleVector b){
        double[] c = new double[a.vector.length];
        for(int i=0; i < a.vector.length;i++){
            c[i]= a.vector[i]-b.vector[i];
        }
        return new DoubleVector(c);
    }
    public static DoubleVector multiplyByInt (DoubleVector a, int n){
        double[] c = new double[a.vector.length];
        for(int i=0; i < a.vector.length;i++){
            c[i]= a.vector[i]*n;
        }
        return new DoubleVector(c);
    }

    public static DoubleVector multiplyByDouble (DoubleVector a, double n){
        double[] c = new double[a.vector.length];
        for(int i=0; i < a.vector.length;i++){
            c[i]= a.vector[i]*n;
        }
        return new DoubleVector(c);
    }



    public  DoubleVector sum ( DoubleVector b){
        double[] c = new double[this.vector.length];
        for(int i=0; i < this.vector.length;i++){
            c[i]= this.vector[i]+b.vector[i];
        }
        return new DoubleVector(c);
    }
    public  DoubleVector diff ( DoubleVector b){
        double[] c = new double[this.vector.length];
        for(int i=0; i < this.vector.length;i++){
            c[i]= this.vector[i]-b.vector[i];
        }
        return new DoubleVector(c);
    }
    public  DoubleVector multiplyByInt ( int n){
        double[] c = new double[this.vector.length];
        for(int i=0; i < this.vector.length;i++){
            c[i]= this.vector[i]*n;
        }
        return new DoubleVector(c);
    }

    public  DoubleVector multiplyByDouble ( double n){
        double[] c = new double[this.vector.length];
        for(int i=0; i < this.vector.length;i++){
            c[i]= this.vector[i]*n;
        }
        return new DoubleVector(c);
    }
    public static void print(DoubleVector a){
        for (var n:a.vector) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};
        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);
        System.out.println("v1*v2=" + v1.mult(v2));
        System.out.println("v1*v2=" + DoubleVector.mult(v1, v2));
        System.out.println("v1*v3=" + v1.mult(v3));
        System.out.println("static methods");
        System.out.println("-sum v1 and v2:");
        print(sum(v1,v2));
        System.out.println("-diff v1 and v2:");
        print(diff(v1,v2));
        System.out.println("-multiply by int 5:");
        print(multiplyByInt(v1,5));
        System.out.println("-multiply by double 3.2:");
        print(multiplyByDouble(v1,3.2));
        System.out.println("non static methods");
        System.out.println("-sum v1 and v2:");
        print(v1.sum(v2));
        System.out.println("-diff v1 and v2:");
        print(v1.diff(v2));
        System.out.println("-multiply by int 5:");
        print(v1.multiplyByInt(5));
        System.out.println("-multiply by double 3.2:");
        print(v1.multiplyByDouble(3.2));



    }
}