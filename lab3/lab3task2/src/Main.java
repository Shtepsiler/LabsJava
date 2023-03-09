class SymbolTest {
    public static void main(String[] args) {
     double BA = Double.parseDouble(args[0]);
        double BC = Double.parseDouble(args[1]);
        System.out.println(BA);
        System.out.println(BC);

        double hypot = Math.hypot(BA,BC);
        
        
        double sinA =  BC/hypot;
        double sinC =  BA/hypot;

        var asinA = Math.asin(sinA);
        var asinB = Math.asin(sinC);

        System.out.println(Math.toDegrees(asinA));
        System.out.println(Math.toDegrees(asinB));



    }
}
