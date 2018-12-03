package app;

import static java.lang.Math.tan;
import static java.lang.Math.atan;

public class Application {
  public static void main(String[] args) {
    double a = 23742932.23389;
    int c = 10000;
    while (true) {
      double d = doWork(a);
	    if (c == 0) {
	      System.out.println(d);
	      c = 10000;
	    }
	    c--;
    }
  }

  private static double doWork(double x) {
    //return System.nanoTime();
    return System.currentTimeMillis();
  }
}
