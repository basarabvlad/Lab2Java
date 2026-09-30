public class Money {
    private long hryvnias;
    private byte kopecks;

    public static int objectCount = 0;

    public Money() {
        this(0, (byte) 0);
    }

    public Money(long hryvnias, byte kopecks) {
        long totalKopecks = hryvnias * 100 + kopecks;
        this.hryvnias = totalKopecks / 100;
        this.kopecks = (byte) Math.abs(totalKopecks % 100);
        objectCount++;
    }

    public Money(long hryvnias) {
        this(hryvnias, (byte) 0);
    }

    public long getHryvnias() {
        return hryvnias;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public Money add(Money other) {
        long total = this.toKopecks() + other.toKopecks();
        return fromKopecks(total);
    }

    public Money subtract(Money other) {
        long total = this.toKopecks() - other.toKopecks();
        return fromKopecks(total);
    }

    public Money divide(Money other) {
        if (other.toKopecks() == 0) {
            throw new ArithmeticException("Ділення на нуль");
        }

        long result = this.toKopecks() / other.toKopecks();
        return new Money(result / 100, (byte) (result % 100));
    }

    public Money divide(double number) {
        if (number == 0) {
            throw new ArithmeticException("Ділення на нуль");
        }

        long result = Math.round(this.toKopecks() / number);
        return fromKopecks(result);
    }

    public boolean isGreaterThan(Money other) {
        return this.toKopecks() > other.toKopecks();
    }

    public boolean isLessThan(Money other) {
        return this.toKopecks() < other.toKopecks();
    }

    public boolean isEqualTo(Money other) {
        return this.toKopecks() == other.toKopecks();
    }

    public static Money fromKopecks(long kopecks) {
        long hryvnias = kopecks / 100;
        byte rest = (byte) Math.abs(kopecks % 100);

        if (kopecks < 0 && rest != 0) {
            hryvnias--;
        }

        return new Money(hryvnias, rest);
    }

    private long toKopecks() {
        return hryvnias * 100 + kopecks;
    }

    @Override
    public String toString() {
        return String.format("%d,%02d грн", hryvnias, kopecks);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Money)) {
            return false;
        }

        Money other = (Money) obj;
        return this.toKopecks() == other.toKopecks();
    }
}