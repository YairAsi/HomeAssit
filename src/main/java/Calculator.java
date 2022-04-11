import java.util.HashMap;
import java.util.Locale;
import java.util.stream.DoubleStream;

public class Calculator {

    public static boolean isEquels(Person [] arrX, Person [] arrY) {
        if(arrX.length != arrY.length)
            return false;

        if(arrX.length == 0)
            return true;

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i<arrX.length; i++)
        {
            String key = (arrX[i].firstName + "_" +arrX[i].lastName).toLowerCase(Locale.ROOT);
            int value  = hashMap.get(key) == null ? 1 : hashMap.get(arrX[i]) + 1;
            hashMap.put(key,value);
        }

        for(int i = 0; i<arrY.length; i++)
        {
            String key = (arrY[i].firstName + "_" +arrY[i].lastName).toLowerCase(Locale.ROOT);
            if(hashMap.get(key) == null)
                return false;

            int value = hashMap.get(key)  -1;
            hashMap.put(key, value);
        }

        for (HashMap.Entry<String,
                Integer> entry : hashMap.entrySet())
            if (entry.getValue() != 0)
                return false;
        return true;
    }
}