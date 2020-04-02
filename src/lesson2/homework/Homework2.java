package lesson2.homework;

public class Homework2 {

    private static final int REQUIRED_ARRAY_SIZE = 4;

    private static final String[][] CORRECT_DATA = new String[][]{
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"},
    };

    private static final String[][] INCORRECT_SIZE_DATA = new String[][]{
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11"},
            {"13", "14", "15", "16"},
    };


    private static final String[][] INCORRECT_VALUE_DATA = new String[][]{
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "1O", "11", "12"},
            {"13", "14", "15", "16"},
    };


    public static void main(String[] args) {
        try {
            int result = sumArrayValues(INCORRECT_VALUE_DATA);
            System.out.println("Array sum: " + result);
        }  catch (MyArrayDataException e) {
            System.out.println("Некорректные данные в массиве");
            System.out.println(e.getMessage());
        }
        try {
            int result = sumArrayValues(CORRECT_DATA);
            System.out.println("Array sum: " + result);
        } catch (MyArrayDataException e) {
            System.out.println("Некорректные данные в массиве");
            System.out.println(e.getMessage());
        }
        try {
            int result = sumArrayValues(INCORRECT_SIZE_DATA);
            System.out.println("Array sum: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Некорректный размер массива");
            System.out.println(e.getMessage());
        }
    }

    private static int sumArrayValues(String[][] data) {
        checkArraySize(data);

        int sumResult = 0;

        for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
            String[] row = data[rowIndex];
            for (int colIndex = 0; colIndex < row.length; colIndex++) {
                String value = row[colIndex];
                try {
                    sumResult = sumResult + Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(value, rowIndex, colIndex);
                }
            }
        }

        return sumResult;
    }

    private static void checkArraySize(String[][] data) {
        if (data.length != REQUIRED_ARRAY_SIZE) {
            throw new MyArraySizeException();
        }

        for (String[] row : data) {
            if (row.length != REQUIRED_ARRAY_SIZE) {
                throw new MyArraySizeException();
            }
        }
    }
}

