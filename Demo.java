public class Demo {
     public static void main(String[] args) {
          //realA = 8.0, realB = 4.0
          RealNumber realA;
          RealNumber realB;
          realA = new RealNumber(8.0);
          realB = new RealNumber(4.0);
          System.out.println(realA); //8.0
          System.out.println(realB); //4.0
          System.out.println(realA.add(realB)); //12.0
          System.out.println(realA.subtract(realB)); //4.0
          System.out.println(realA.multiply(realB)); //32.0
          System.out.println(realA.divide(realB)); //2.0
          System.out.println("");
          //ratA = 2 / 5, ratB = 6 / 10
          RationalNumber ratA;
          RationalNumber ratB;
          RationalNumber ratA2;
          ratA = new RationalNumber(2, 5);
          ratA2 = new RationalNumber(2, 5);
          ratB = new RationalNumber(6, 10);
          System.out.println(ratA); //2/5
          System.out.println(ratB); //6/10
          System.out.println(ratA.getValue()); //0.4
          System.out.println(ratB.getValue()); //0.6
          System.out.println(ratA.equals(ratA2)); //true
     }
}
