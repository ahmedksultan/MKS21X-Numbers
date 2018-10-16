public class Demo {
     public static void main(String[] args) {
          //realA = 8.0, realB = 4.0
          RealNumber realA;
          RealNumber realB;
          realA = new RealNumber(8.0);
          realB = new RealNumber(4.0);
          System.out.println(realA);
          System.out.println(realB);
          System.out.println(realA.add(realB));
          System.out.println(realA.subtract(realB));
          System.out.println(realA.multiply(realB));
          System.out.println(realA.divide(realB));
     }
}
