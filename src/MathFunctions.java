public class MathFunctions {
    // Add,sub,multiply,div,abs,square two numbers
    //Add
    public short add(short a, short b) {
        return (short) (a + b);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public long add(long a, long b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public long sub(long a, long b) {
        return a - b;
    }

    public float sub(float a, float b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }


    // Multiply
    public int multiply(int a, int b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide
    public int div(int a, int b) {
        return a / b;
    }

    public long div(long a, long b) {
        return a / b;
    }

    public float div(float a, float b) {
        return a / b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    // Abs
    public int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public long abs(long a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public float abs(float a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public double abs(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    // Square
    public int square(int a) {
        return a * a;
    }

    public long square(long a) {
        return a * a;
    }

    public float square(float a) {
        return a * a;
    }

    public double square(double a) {
        return a * a;
    }


}
