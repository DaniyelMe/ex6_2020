public class PointXY {
  private double x;
  private double y;
  private double r;
  private double theta;

  public boolean isCartesian;


  PointXY() {
    this.x = 0;
    this.y = 0;
  }

  PointXY(double x, double y) {
    this.x = x;
    this.y = y;
  }

  PointXY(double x, double y, boolean isCartesian) {
    this.x = x;
    this.y = y;

    if (!isCartesian) {
      // polar coordinate system
      this.r = Math.sqrt(x * x + y * y);
      this.theta = calculateTheta(x, y);

      this.x = r * Math.cos(theta);
      this.y = r * Math.sin(theta);
    }
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getR() {
    return r;
  }

  public double getTheta() {
    return theta;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public void setR(double r) {
    this.r = r;
  }

  public void setTheta(double theta) {
    this.theta = theta;
  }

  public void rotate(double theta) {
    // x′=xcosθ−ysinθ
    this.x = this.x * Math.cos(theta) - this.y * Math.sin(theta);
    // y′ =y * cosθ + x * sinθ
    this.y = this.y * Math.cos(theta) - this.x * Math.sin(theta);
  }

  public double distanceTo(PointXY p) {
    // Sqrt((x2 − x1)^2 + (y2 − y1)^2))
    return Math.sqrt(Math.pow(Math.abs(this.x - p.x - getX()), 2) + Math.pow(Math.abs(this.y - p.y - getY()), 2));
  }

  public double distanceTo(double x, double y) {
    // Redundent function
    PointXY pointXY = new PointXY(x, y);
    return distanceTo(pointXY);
  }

  public void add(PointXY p) {
    this.x += p.x;
    this.y += p.y;
  }

  public boolean equals(PointXY p) {
    // If it's the same point
    if (this == p)
      return true;
    // The given Point is null
    if (p == null)
      return false;

    return x == p.x && y == p.y;
  }

  @Override
  public String toString() {
    return "(x,y)=(" + getX() + ", " + getY() + ")" + "(r,theta)=(" + getR() + ", " + getTheta() + ")";
  }

  public double calculateTheta(Double x, Double y) {
    final double theta = Math.PI / 2 + Math.atan2(y, x);
    return theta < 0 ? theta + 2 * Math.PI : theta;
  }

}