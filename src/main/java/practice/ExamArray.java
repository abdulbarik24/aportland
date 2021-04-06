package practice;

public class ExamArray {
    public int search(Integer n, Integer[] list){
        for(int i = 0; i< list.length; i++){
            if(list[i] == n){
                return i;
            }
        }
        return -1;
    }
}
