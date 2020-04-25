package PCU;

import java.util.ArrayList;

public class Student extends Person {

    private String name; //수강신청할 과목 이름.
    private String lk; //수강신청 과목 확인.




    public Student(String name) { // 생성자
        super();
        this.name = name;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getLk() { //강 조회
        return lk;
    }

    public void setLk(String lk) { //수강 목록 조회
        this.lk = lk;
    }






}
