package main.java.lesson6.ex4;

public class ExampleFour {

    /*
     * Создать класс с четырьмя методами checkString().
     * Метод 1 принимает в параметры строку и выбрасывает исключение, если количество символов в
     * этой строке нечетное.
     * Метод 2 принимает в параметры строку и выбрасывает исключение, если в этой строке есть
     * буквосочентани "exception".
     * Метод 3 принимает в параметры строку и выбрасывает исключение, если эта строка состоит из количества слов меньше 3.
     * Метод 4 внутри себя вызывает предыдущие три метода.
     *
     * Все исключения создать отдельными собственными классами.
     * */
    public class OddCountOfCharsException extends Exception {
        public OddCountOfCharsException(String message) {
            super(message);
        }
    }

    public class StringContainsException extends Exception {
        public StringContainsException(String message) {
            super(message);
        }
    }

    public class AmountOfWordsLessThanThreeException extends Exception {
        public AmountOfWordsLessThanThreeException(String message) {
            super(message);
        }
    }

    private void checkString1(String text) throws OddCountOfCharsException {
        if (text.length() % 2 != 0) {
            throw new OddCountOfCharsException("The count os chars is odd");
        }
    }

    private void checkString2(String text) throws StringContainsException {
        if (text.contains("exception")) {
       throw new StringContainsException("Input text contains \"exception\"");
        }
    }

    private void checkString3(String text) throws AmountOfWordsLessThanThreeException {
        if(text.split("\\s").length < 3){
            throw new AmountOfWordsLessThanThreeException("Amount of words is less than three!!!");
        }
    }

    public void test() throws ArithmeticException{
        System.out.println("test");
    }

    public void checkString4(String text) throws OddCountOfCharsException, StringContainsException, AmountOfWordsLessThanThreeException {
        checkString1(text);
        checkString2(text);
        checkString3(text);

    }


}
