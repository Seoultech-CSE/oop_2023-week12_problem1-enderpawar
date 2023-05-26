import java.util.*;

public class  week13_1{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

scss
Copy code
    // ArrayList에 Integer와 Double 자료형을 사용합니다.
    ArrayList<Number> list = new ArrayList<>();

    System.out.print("Enter five integers and five doubles: ");

    // 정수 5개와 실수 5개를 입력받아 ArrayList에 저장합니다.
    for (int i = 0; i < 5; i++) {
        int num = input.nextInt();
        list.add(num);
    }

    for (int i = 0; i < 5; i++) {
        double num = input.nextDouble();
        list.add(num);
    }

    sort(list);

    // 정렬된 ArrayList를 출력합니다.
    for (Number num : list) {
        System.out.print(num + " ");
    }
}

public static void sort(ArrayList<Number> list) {
    // ArrayList를 정렬합니다.
    Collections.sort(list);
}
}
