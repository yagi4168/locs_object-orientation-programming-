package PCU;

public class Student extends Person implements Action {

    private String name; //수강 신청할 과목 이름.


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

    @Override
    public void goSchool() {
        System.out.println("goSchool");
    }

    @Override
    public void goHome() {
        System.out.println("goHome");
    }
}
