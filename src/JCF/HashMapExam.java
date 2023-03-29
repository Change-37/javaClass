package JCF;

import java.util.HashMap;

public class HashMapExam {
    public static void main(String[] args) {
        HashMap<Integer, Person> hashMap = new HashMap<Integer, Person>(); // key는 Integer, value는 String 타입
        Person kim = new Person("kim", 47);
        Person park = new Person("park", 36);
        Person lee = new Person("lee", 23);
        Person choi = new Person("choi", 19);
        hashMap.put(1, kim);
        hashMap.put(2, park);
        hashMap.put(3, lee);
        hashMap.put(4, choi);

        hashMap.get(1).showInfo();
        hashMap.get(2).showInfo();

        hashMap.remove(3); // key가 3인 데이터 삭제
        System.out.println(hashMap.size()); // 3 출력
// [0]
    }
}

