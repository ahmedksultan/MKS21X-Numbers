public class RationalNumber extends RealNumber {
     private int numerator, denominator;
     public RationalNumber(int nume, int deno) {
          super(0);//this value is ignored!
          numerator = nume;
          if (deno == 0) {
              numerator = 0;
              denominator = 1;
          }
          else {
              denominator = deno;
          }
     }
     public double getValue() {
          return (double)numerator / denominator;
      }
     public int getNumerator() {
          return numerator;
     }
     public int getDenominator() {
          return denominator;
     }
     public boolean equals(RationalNumber other) {
          if ( numerator == other.getNumerator() &&
           denominator == other.getDenominator() ) {
               return true;
          }
          return false;
     }
     public String toString() {
          return numerator + "/" + denominator;
     }
     public RationalNumber reciprocal() {
          RationalNumber temp;
          if (numerator == 0) {
               temp = new RationalNumber(0, 1);
          }
          else {
               temp = new RationalNumber(denominator, numerator);
          }
          return temp;
     }
     /*credit goes to https://introcs.cs.princeton.edu/java/23recursion/Euclid.java.html
     for explaining the problem and helping to understand it*/
     private static int gcd(int a, int b) {
          while (b != 0) {
               int c = b;
               b = a % b;
               a = c;
          }
          return a;
     }
     //Alma helped me with reduce!
     private void reduce() {
          int ratgcd = gcd(numerator, denominator);
          numerator = numerator / ratgcd;
          denominator = denominator / ratgcd;
     }
     public RationalNumber multiply(RationalNumber other) {
          RationalNumber result;
          result = new RationalNumber((numerator * other.getNumerator()), (denominator * other.getDenominator()));
          return result;
     }
     public RationalNumber divide(RationalNumber other) {
          RationalNumber result;
          result = new RationalNumber((numerator * other.getDenominator()), (denominator * other.getNumerator()));
          return result;
     }
     public RationalNumber add(RationalNumber other) {
          RationalNumber result;
          result = new RationalNumber(((numerator * other.getDenominator()) + (denominator * other.getNumerator())), (denominator * other.getDenominator()));
          return result;
     }
     public RationalNumber subtract(RationalNumber other) {
          RationalNumber result;
          result = new RationalNumber(((numerator * other.getDenominator()) - (denominator * other.getNumerator())), (denominator * other.getDenominator()));
          return result;
     }
}
