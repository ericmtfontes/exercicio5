package utils;

public class StringUtil {
    public static String invertedValue(String value){
        StringBuilder sb = new StringBuilder();
        for(int i = (value.length()-1); i >= 0; i--){
            sb.append(value.charAt(i));
        }
        return sb.toString();
    }
}
