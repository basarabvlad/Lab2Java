import java.math.BigInteger;

public class VeryLongNumber {
    private BigInteger value;

    public static int objectCount = 0;

    public VeryLongNumber() {
        this("0");
    }

    public VeryLongNumber(String value) {
        this.value = new BigInteger(value);
        objectCount++;
    }

    public VeryLongNumber(long value) {
        this(String.valueOf(value));
    }

    public VeryLongNumber add(VeryLongNumber other) {
        return new VeryLongNumber(value.add(other.value).toString());
    }

    public VeryLongNumber subtract(VeryLongNumber other) {
        return new VeryLongNumber(value.subtract(other.value).toString());
    }

    public VeryLongNumber multiply(VeryLongNumber other) {
        return new VeryLongNumber(value.multiply(other.value).toString());
    }

    public VeryLongNumber divide(VeryLongNumber other) {
        if (other.value.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Ділення на нуль");
        }

        return new VeryLongNumber(value.divide(other.value).toString());
    }

    public VeryLongNumber power(int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Степінь повинен бути натуральним");
        }

        return new VeryLongNumber(value.pow(exponent).toString());
    }

    public static VeryLongNumber zero() {
        return new VeryLongNumber("0");
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VeryLongNumber)) {
            return false;
        }

        VeryLongNumber other = (VeryLongNumber) obj;
        return value.equals(other.value);
    }
} 
    

