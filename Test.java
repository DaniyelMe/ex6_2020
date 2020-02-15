
public class Test {
  public static void main(String[] args) {
    // 1.a Create two 2D points
    PointXY p1 = new PointXY(1.0, 2.0);
    PointXY p2 = new PointXY(3.0, 4.0);
    // 1.b Print the two points via toString method
    System.out.println(p1.toString());
    System.out.println(p2.toString());

    // 2 Print the distance between the two points
    System.out.println(p1.distanceTo(p2));

    // 3.a Add first point with the second point
    p1.add(p2);
    // 3.b Print the result
    System.out.println(p1.toString());

    // 4 Test if the two point are equal and print the result
    System.out.println(p1.equals(p2));

    // 5.a Create 3D point
    PointXYZ p3 = new PointXYZ(3.0, 4.0, 2.0);
    // 5.b Print the 3D point via toString method
    System.out.println(p3.toString());

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

  }
}