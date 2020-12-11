package excercise.service;

public class CountableNegativeImpl implements Countable {

    @Override
    public int countChar(String text, char ch) {
        int lenght = text.length();
        int result = 0;
        for (int i = 0; i < lenght; i++ ){
            if (text.charAt(i) == ch){
                result +=2;
            }

        }
        return result;
    }
}
