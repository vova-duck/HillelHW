package HomeWork13Elementary;

import java.util.Locale;

public class Pair {
    private String lowerCaseValue;
    private String upperCaseValue;



    public Pair(String lowerCaseValue) {
        this.lowerCaseValue = lowerCaseValue;
        this.upperCaseValue = lowerCaseValue.toUpperCase(Locale.ROOT);
    }

    public void setLowerCaseValue(String lowerCaseValue) {
        this.lowerCaseValue = lowerCaseValue;
    }

    public void setUpperCaseValue() {
        this.upperCaseValue = this.lowerCaseValue.toUpperCase(Locale.ROOT);
    }

    public String getLowerCaseValue() {
        return lowerCaseValue;
    }

    public String getUpperCaseValue() {
        return upperCaseValue;
    }

    @Override
    public String toString() {
        return "{" +
                 lowerCaseValue + '\'' +", "+
                  upperCaseValue + '\'' +
                '}';
    }
}
