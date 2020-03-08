package validation;

public class Calculator {

    public int multiplication(int fromInteger) {
        if (fromInteger < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        int numerator = multiplication(setSize);
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("Subset must be smaller than set");
        }
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
