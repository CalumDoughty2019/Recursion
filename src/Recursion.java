public class Recursion {

    //Linear recursion
    public int sum(int[] array, int i){
        if(i >= array.length){
            return 0;
        }
        return array[i] + sum(array, i+1);
    }
}
