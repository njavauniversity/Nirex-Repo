package utility;

public class ArrayUtils {

    public static int[] findMiddle(int[] inArray) {
        int[] returnArray;
        if (inArray.length % 2 == 0) {
            // EVEN: Two middle elements
            returnArray = new int[2];
            returnArray[0] = inArray[(inArray.length / 2) - 1];
            returnArray[1] = inArray[inArray.length / 2];
        } else {
            // ODD: One middle element
            returnArray = new int[1];
            returnArray[0] = inArray[inArray.length / 2];
        }
        return returnArray;
    }

    public static float findMiddleValue(int[] inArray) {
        int[] tmpArr = findMiddle(inArray);
        float result = 0;
        for (int i : tmpArr)
            result += i;
        result /= tmpArr.length;
        return result;
    }
}