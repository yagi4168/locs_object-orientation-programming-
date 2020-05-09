package PCU;

import java.util.*;

public class Person implements Action{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        int ans = 0;

        while (true) {

            System.out.println("[1]수강 신청 [2]수강 목록 조회 [3]프로그램 종료");
            ans = sc.nextInt(); //값을 입력 받음

            if (ans == 1) { //[1]수강 신청을 눌렀을 경우.
                System.out.println("수강하실 과목을 입력해주세요. ");
                String stuname = sc.next(); //수강할 과목 입력받음.

                Student std = new Student(stuname);
                list.add(std); //list 에 std추가.

                System.out.println(stuname + "가 수강신청 되었습니다.");


                System.out.println("no");

                System.out.println("hello world");

            }

            else if (ans == 2) { //[2]수강 목록 조회를 눌렀을 경우.
                System.out.println("수강중인지 확인하고 싶은 과목명을 적어주세요.");
                String name = sc.next(); //위에 입력받을때 stuname이랑 겹치지않게 name 으로 받기

                if (list.size() != 0) { //list안에 원소가 0개가 아닐경우 밑에가 실행

                    System.out.println(" --- 검색중입니다. --- ");



                    for (Student stu : list) { // for(변수타입 변수 : 배열) 밑에 반복 실행문. - 향상된 for문 , for-each

                        if (stu.getName().equals(name)) {
                            System.out.println("당신은 " + stu.getName() + " 수업을 수강중입니다. ");
                        }

                        else System.out.println("본 과목을 수강중이지 않습니다.");

                    }

                }

                else if (list.size() == 0) {
                    System.out.println("본 과목을 수강중이지 않습니다.");
                }

            }

            else if ( ans == 3) {
                System.out.println(" --- 프로그램을 종료합니다. --- ");
                break;
            }

        }
    }

    @Override
    public void goSchool() {
        System.out.println("goSchool");
    }

    @Override
    public void goHome() {
        System.out.println("goHome");
    }
}

