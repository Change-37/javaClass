package JCF;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        Person kim = new Person("kim", 47);
        Person park = new Person("park", 36);
        Person lee = new Person("lee", 23);
        Person choi = new Person("choi", 19);

        ArrayList<Person> arrList = new ArrayList<Person>();
        arrList.add(kim);
        arrList.add(park);
        arrList.add(lee);
        arrList.add(choi);

        for(Person person : arrList){
            person.showInfo();
        }

        arrList.remove(lee);
        System.out.println(arrList.size()); // 3 출력

        Person hwang = new Person("hwang", 72);
        arrList.set(1, hwang);
        for(Person person : arrList){
            person.showInfo();
        }
        arrList.get(1).setAge(83);
        arrList.get(1).showInfo();
    }
}
