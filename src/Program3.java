public class Program3 {
    public static void main(String[] args) {
        int [] numbers ={0,1,2,3,4,5,6,7,8,9,10};
        System.out.println("Четные числа из представленного массива: ");
        for (int number : numbers){
            if (number %2 == 0){
                System.out.print(number+ " , ");
            }
        }
    }
}
