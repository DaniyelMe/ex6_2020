public class PointXYZ extends PointXY {
  private double z;

  public PointXYZ(double x, double y, double z) {
    super(x, y);
    this.z = z;
  }

  public PointXYZ(double x, double y, double z, boolean isCartesian) {
    super(x, y);
    this.z = z;

    if (!isCartesian) {
      // polar coordinate system
      double r = getR();
      double theta = getTheta();
      double phi = getPhi();

      setX(r * Math.sin(theta) * Math.cos(phi));
      setY(r * Math.sin(theta) * Math.sin(phi));
      this.z = r * Math.cos(theta);
    }

  }

  public double getZ() {
    return z;
  }

  public void setZ(double z) {
    this.z = z;
  }

  @Override
  public double getR() {
    // Return the radial distance r.

    double x = getX();
    double y = getX();

    return Math.sqrt(x * x + y * y + z * z);
  }

  @Override
  public double getTheta() {
    // Return the θ.
    return Math.acos(z / getR());
  }

  public double getPhi() {
    // Return the ϕ.
    return Math.atan(getY() / getX());
  }

  @Override
  public boolean equals(Object obj) {
    // If it's the same point
    if (this == obj)
      return true;

    if (obj == null || getClass() != obj.getClass() || !super.equals(obj))
      return false;

    PointXYZ pointXYZ = (PointXYZ) obj;

    return z == pointXYZ.z;

  }

  @Override
  public String toString() {
    return "(x,y,z)=(" + getX() + ", " + getY() + ", " + getZ() + ")" + "(r,theta, phi)=(" + getR() + ", " + getTheta()
        + ", " + getPhi() + ")";

  }
}