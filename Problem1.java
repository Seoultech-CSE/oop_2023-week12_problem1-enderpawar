import java.util.*;

public class week13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList< Number > list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");

    for (int i = 0; i < 5; i++) {
        int num = input.nextInt();
        list.add(num);
    }
        sort(list);

          for (Number num : list) {
        System.out.print(num + " ");
    }
    }

    public static void sort( __________ ) {

    Collections.sort(list);
    }
}
