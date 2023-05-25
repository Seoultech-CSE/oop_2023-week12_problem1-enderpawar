import java.util.*;

public class week13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
           ArrayList<Number> list = new ArrayList<Number>(); // ArrayList에 Number 자료형 사용
    System.out.print("Enter five integers and five doubles: ");

    // 정수 5개와 실수 5개 입력 받기
    for (int i = 0; i < 5; i++) {
        int num = input.nextInt();
        list.add(num); // 정수를 ArrayList에 추가
    }

    for (int i = 0; i < 5; i++) {
        double num = input.nextDouble();
        list.add(num); // 실수를 ArrayList에 추가
    }

    sort(list); // 리스트 정렬

    // 정렬된 리스트 출력
    for (Number num : list) {
        System.out.print(num + " ");
    }
}

public static void sort(ArrayList<Number> list) {
    Collections.sort(list); // ArrayList 정렬
}

}
