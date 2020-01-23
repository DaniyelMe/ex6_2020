
public class Test {
  /*
   * OPTIONAL QUESTION !
   * 
   * In order to count all the insences you need to add 'public static int
   * counter' to PointXY and in the constructor and add plus one for each init.
   * And you can add counter-- to a destructor to whenever an object dies.
   * 
   * In addition - since we have a couple of constructors we need to add the
   * counter to each, to cover all the options.
   * 
   * Note - we don't need to add a counter to the child since he's also
   * initialized his parent
   * 
   */

  public static void main(String[] args) {
    PointXY p1 = new PointXY(1.0, 2.0);
    PointXY p2 = new PointXY(3.0, 4.0);
    PointXYZ p3 = new PointXYZ(3.0, 4.0, 2.0);

    System.out.println(p1.toString());
    System.out.println(p2.toString());

    System.out.println(p1.distanceTo(p2));

    p1.add(p2);
    System.out.println(p1.toString());

    System.out.println(p1.equals(p2));

    System.out.println(p3.toString());

  }
}