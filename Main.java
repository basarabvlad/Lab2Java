public class Main {
    public static void main(String[] args) {
        System.out.println("===== LABORATORY WORK 2 =====");
        System.out.println();

        System.out.println("===== MONEY =====");

        Money money1 = new Money(125, (byte) 50);
        Money money2 = new Money(74, (byte) 25);
        Money money3 = new Money(100);

        System.out.println("money1 = " + money1);
        System.out.println("money2 = " + money2);
        System.out.println("money3 = " + money3);

        System.out.println("Додавання: " + money1.add(money2));
        System.out.println("Віднімання: " + money1.subtract(money2));
        System.out.println("Ділення на суму: " + money1.divide(money2));
        System.out.println("Ділення на число: " + money1.divide(2));
        System.out.println("money1 > money2: " + money1.isGreaterThan(money2));
        System.out.println("money1 < money2: " + money1.isLessThan(money2));
        System.out.println("money1 == money2: " + money1.isEqualTo(money2));
        System.out.println("equals: " + money1.equals(money2));

        Money money4 = Money.fromKopecks(25075);
        System.out.println("Створення через статичний метод: " + money4);
        System.out.println("Кількість об'єктів Money: " + Money.objectCount);

        System.out.println();

        System.out.println("===== VECTOR 3D =====");

        Vector3D vector1 = new Vector3D(2, 3, 4);
        Vector3D vector2 = new Vector3D(1, 5, 2);
        Vector3D vector3 = new Vector3D(vector1);

        System.out.println("vector1 = " + vector1);
        System.out.println("vector2 = " + vector2);
        System.out.println("vector3 = " + vector3);

        System.out.println("Модуль vector1: " + vector1.magnitude());
        System.out.println("Множення vector1 на 2: " + vector1.multiply(2));
        System.out.println("Додавання: " + vector1.add(vector2));
        System.out.println("Скалярний добуток: " + vector1.dotProduct(vector2));
        System.out.println("Векторний добуток: " + vector1.crossProduct(vector2));
        System.out.println("equals: " + vector1.equals(vector3));

        Vector3D zeroVector = Vector3D.zero();
        System.out.println("Статичний метод zero(): " + zeroVector);
        System.out.println("Кількість об'єктів Vector3D: " + Vector3D.objectCount);

        System.out.println();

        System.out.println("===== VERY LONG NUMBER =====");

        VeryLongNumber number1;
        VeryLongNumber number2;

        if (args.length >= 2) {
            number1 = new VeryLongNumber(args[0]);
            number2 = new VeryLongNumber(args[1]);
        } else {
            number1 = new VeryLongNumber("123456789012345678901234567890");
            number2 = new VeryLongNumber("987654321098765432109876543210");
        }

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        System.out.println("Додавання: " + number1.add(number2));
        System.out.println("Віднімання: " + number1.subtract(number2));
        System.out.println("Множення: " + number1.multiply(number2));
        System.out.println("Ділення: " + number2.divide(number1));
        System.out.println("number1^3: " + number1.power(3));
        System.out.println("equals: " + number1.equals(number2));

        VeryLongNumber zero = VeryLongNumber.zero();
        System.out.println("Статичний метод zero(): " + zero);
        System.out.println("Кількість об'єктів VeryLongNumber: " + VeryLongNumber.objectCount);
    }
} 
    
