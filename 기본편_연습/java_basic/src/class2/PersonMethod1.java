package class2;

public class PersonMethod1 {
    public static void main(String[] args) {
        // Person 객체 배열 생성
        PersonObj[] people = new PersonObj[3];

        // 배열에 Person 객체 할당 및 데이터 초기화
        people[0] = new PersonObj();
        people[0].name = "정원석";
        people[0].age = 35;
        people[0].gender = "남자";

        people[1] = new PersonObj();
        people[1].name = "홍길동";
        people[1].age = 30;
        people[1].gender = "남자";

        people[2] = new PersonObj();
        people[2].name = "이영희";
        people[2].age = 28;
        people[2].gender = "여자";

        // for문을 이용해 배열 요소 출력
        for (int i = 0; i < people.length; i++) {
            people[i].intro();
        }
    }
}
