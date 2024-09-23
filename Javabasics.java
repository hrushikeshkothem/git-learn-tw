public class Javabasics {
    static int addStatic(int a, int b) {
        return a + b;
    }

    public int add(int a, int b) {
        return a + b;
    }
    
    public void arthamticOperators() {
        int a = 10;
        int b = 20;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }

    public void logialOperators() {
        boolean a = true;
        boolean b = false;
        System.out.println("AND: " + (a && b));
        System.out.println("OR: " + (a || b));
        System.out.println("NOT: " + (!a));
    }

    public void relationalOperators() {
        int a = 10;
        int b = 20;
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or Equal: " + (a >= b));
        System.out.println("Less than or Equal: " + (a <= b));
    }

    public void bitwiseOperators() {
        int a = 10;
        int b = 20;
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("Complement: " + (~a));
        System.out.println("Left Shift: " + (a << 2));
        System.out.println("Right Shift: " + (a >> 2));
        System.out.println("Right Shift with Zero: " + (a >>> 2));
    }

    public void assignmentOperators() {
        int a = 10;
        int b = 20;
        System.out.println("Equal: " + (a = b));
        System.out.println("Add and Assign: " + (a += b));
        System.out.println("Subtract and Assign: " + (a -= b));
        System.out.println("Multiply and Assign: " + (a *= b));
        System.out.println("Divide and Assign: " + (a /= b));
        System.out.println("Modulus and Assign: " + (a %= b));
        System.out.println("Left Shift and Assign: " + (a <<= 2));
        System.out.println("Right Shift and Assign: " + (a >>= 2));
        System.out.println("Right Shift with Zero and Assign: " + (a >>>= 2));
        System.out.println("AND and Assign: " + (a &= b));
        System.out.println("OR and Assign: " + (a |= b));
        System.out.println("XOR and Assign: " + (a ^= b));
    }

    public void ternaryOperators() {
        int a = 10;
        int b = 20;
        int result = (a > b) ? a : b;
        System.out.println("Ternary: " + result);
    }

    public void instanceOfOperator() {
        String name = "Java";
        boolean result = name instanceof String;
        System.out.println("Instance of: " + result);
    }

    public void typeCasting() {
        int a = 10;
        double b = a;
        System.out.println("Implicit Type Casting: " + b);
        double c = 20.5;
        int d = (int) c;
        System.out.println("Explicit Type Casting: " + d);
    }

    public void stringConcatenation() {
        String a = "Hello";
        String b = "World";
        System.out.println("Concatenation: " + a + " " + b);
    }

    public void stringMethods() {
        String name = "Java";
        System.out.println("Length: " + name.length());
        System.out.println("Lower Case: " + name.toLowerCase());
        System.out.println("Upper Case: " + name.toUpperCase());
        System.out.println("Trim: " + name.trim());
        System.out.println("Substring: " + name.substring(1, 3));
        System.out.println("Replace: " + name.replace("J", "K"));
        System.out.println("Contains: " + name.contains("J"));
        System.out.println("Equals: " + name.equals("Java"));
        System.out.println("Equals Ignore Case: " + name.equalsIgnoreCase("java"));
        System.out.println("Compare To: " + name.compareTo("Java"));
        System.out.println("Compare To Ignore Case: " + name.compareToIgnoreCase("java"));
        System.out.println("Starts With: " + name.startsWith("J"));
        System.out.println("Ends With: " + name.endsWith("a"));
        System.out.println("Char At: " + name.charAt(1));
        System.out.println("Index Of: " + name.indexOf("a"));
        System.out.println("Last Index Of: " + name.lastIndexOf("a"));
    }

    public void arrays() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Length: " + numbers.length);
        System.out.println("Element: " + numbers[0]);
        numbers[0] = 10;
        System.out.println("Element: " + numbers[0]);
    }

    public void loops() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("For Loop: " + numbers[i]);
        }
        for (int number : numbers) {
            System.out.println("For Each Loop: " + number);
        }
        int i = 0;
        while (i < numbers.length) {
            System.out.println("While Loop: " + numbers[i]);
            i++;
        }
        int j = 0;
        do {
            System.out.println("Do While Loop: " + numbers[j]);
            j++;
        } while (j < numbers.length);
    }

    public void conditionalStatements() {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("If Statement: " + a);
        } else {
            System.out.println("Else Statement: " + b);
        }
        if (a > b) {
            System.out.println("If Statement: " + a);
        } else if (a < b) {
            System.out.println("Else If Statement: " + b);
        } else {
            System.out.println("Else Statement: " + a);
        }
        switch (a) {
            case 10 -> System.out.println("Switch Case: " + a);
            case 20 -> System.out.println("Switch Case: " + b);
            default -> System.out.println("Switch Case: " + a);
        }
    }

    public void breakStatement() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Break Statement: " + i);
        }
    }

    public void continueStatement() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Continue Statement: " + i);
        }
    }

    public void returnStatement() {
        System.out.println("Return Statement: " + add(1, 2));
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(addStatic(1, 2));

        Javabasics javabasics = new Javabasics();
        System.out.println(javabasics.add(1, 2));
        javabasics.arthamticOperators();
        javabasics.logialOperators();
        javabasics.relationalOperators();
        javabasics.bitwiseOperators();
        javabasics.assignmentOperators();
        javabasics.ternaryOperators();
        javabasics.instanceOfOperator();
        javabasics.typeCasting();
        javabasics.stringConcatenation();
        javabasics.stringMethods();
        javabasics.arrays();
        javabasics.loops();
        javabasics.conditionalStatements();
        javabasics.breakStatement();
        javabasics.continueStatement();
        javabasics.returnStatement();
    }
}
