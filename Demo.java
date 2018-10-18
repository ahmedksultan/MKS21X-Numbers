public class Demo {
     public static void main(String[] args) {
          //realnumber testing
          RealNumber realA;
          RealNumber realB;
          realA = new RealNumber(8.0);
          realB = new RealNumber(4.0);
          System.out.println(realA); // 8.0
          System.out.println(realB); // 4.0
          System.out.println(realA.add(realB)); // 12.0
          System.out.println(realA.subtract(realB)); // 4.0
          System.out.println(realA.multiply(realB)); // 32.0
          System.out.println(realA.divide(realB)); // 2.0
          System.out.println("");
          //rationalnumber testing
          RationalNumber ratA;
          RationalNumber ratA2;
          RationalNumber ratB;
          RationalNumber ratC;
          ratA = new RationalNumber(2, 5);
          ratA2 = new RationalNumber(2, 5);
          ratB = new RationalNumber(6, 10);
          ratC = new RationalNumber(5, 0);
          System.out.println(ratA); // 2/5
          System.out.println(ratB); // 6/10
          System.out.println(ratC); // 0/1
          System.out.println(ratA.getValue()); // 0.4
          System.out.println(ratB.getValue()); // 0.6
          System.out.println(ratA.equals(ratA2)); // true
          System.out.println(ratA.reciprocal()); // 5/2
          System.out.println(ratA.multiply(ratB)); // 12/50
          System.out.println(ratA.divide(ratB)); // 20/30
          System.out.println(ratA.add(ratB)); // 10/10
          System.out.println(ratA.subtract(ratB)); // -2/10
     }
}
