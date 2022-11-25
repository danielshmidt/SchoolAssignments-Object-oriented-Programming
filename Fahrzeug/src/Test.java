public class Test {
    public static double max3(double uno, double zwei, double tri){
        return Math.max(Math.max(uno, zwei), tri);
    }

    public static boolean majority(boolean eins, boolean dwa, boolean tres){
        return eins == true && dwa == true || eins == true && tres == true || dwa == true && tres == true ? true : false;
    }

    public static String[] textFilter(String[] array, String[] array2){
        int length = array.length < array2.length ? array.length : array2.length;
        String[] array3 = new String[length];
        for(int i = 0; i < length; i++){
            if(!array[i].equals(array2[i])){
                array3[i] = array[i];
            }
            else {
                array3[i] = "";
            }

        }
        return array3;
    }


}
