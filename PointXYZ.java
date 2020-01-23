public class PointXYZ extends PointXY {
  private double z;

  public PointXYZ(double x, double y, double z) {
    super(x, y);
    this.z = z;
  }

  public double getZ() {
    return z;
  }

  

//   +getR():double
// +getTheta():double
// +getPhi():double
// +toString():String

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    if (!super.equals(obj)) {
      return false;
    }

    PointXYZ pointXYZ = (PointXYZ) obj;

    return z == pointXYZ.z;

  }

  @Override
  public String toString() {
    return "[" + getX() + "," + getY() + "," + getZ() + "]";
  }
}