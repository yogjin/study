//2020.12.08 금요일
//Java Comparator 연습,(람다식)
import java.util.*;
class Main {
  public static void main(String[] args) {

    ArrayList<Student> room = new ArrayList<>();//2생

    //인원추가
    room.add(new Student(23,"박영진"));
    room.add(new Student(22,"송재영"));
    room.add(new Student(21,"박건우"));
    room.add(new Student(23,"김대영"));
    room.add(new Student(21,"남연재"));
    room.add(new Student(21,"장윤석"));
    room.add(new Student(21,"문진영"));

    //방 출력
    printRoom(room);

    //나이순으로 정렬 후 출력 
    System.out.println("    나이순 정렬");
    Collections.sort(room,(Student a, Student b) -> a.getAge() - b.getAge());
    printRoom(room);

    //이름순으로 정렬 후 출력.
    System.out.println("    이름순 정렬");
    Collections.sort(room,(Student a, Student b) -> a.getName().compareTo(b.getName()));
    printRoom(room);
  }
  public static void printRoom(ArrayList<Student> room){
    System.out.println("    <2생 인원들>");
    StringBuilder sb = new StringBuilder();
    for(Student he : room){
      sb.append("나이: ").append(he.getAge());
      sb.append(" 이름: ").append(he.getName());
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
class Student{
  private int age;
  private String name;
  public Student(int age,String name){
    this.age = age;
    this.name = name;
  }
  public int getAge(){
    return this.age;
  }
  public String getName(){
    return this.name;
  }
}