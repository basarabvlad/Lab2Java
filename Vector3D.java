public class Vector3D {
    private double x;
    private double y;
    private double z;

    public static int objectCount = 0;

    public Vector3D() {
        this(0, 0, 0);
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        objectCount++;
    }

    public Vector3D(Vector3D other) {
        this(other.x, other.y, other.z);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D multiply(double number) {
        return new Vector3D(x * number, y * number, z * number);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(
            x + other.x,
            y + other.y,
            z + other.z
        );
    }

    public double dotProduct(Vector3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector3D crossProduct(Vector3D other) {
        return new Vector3D(
            y * other.z - z * other.y,
            z * other.x - x * other.z,
            x * other.y - y * other.x
        );
    }

    public static Vector3D zero() {
        return new Vector3D(0, 0, 0);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Vector3D)) {
            return false;
        }

        Vector3D other = (Vector3D) obj;

        return Double.compare(x, other.x) == 0
            && Double.compare(y, other.y) == 0
            && Double.compare(z, other.z) == 0;
    }
} 
    

