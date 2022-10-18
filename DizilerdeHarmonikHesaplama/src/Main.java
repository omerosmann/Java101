public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};

        double total;
        double sum = 0.0;

        for(int i : list){
            sum += i;

        }

        total = list.length / sum;

        System.out.println(total);

    }
}