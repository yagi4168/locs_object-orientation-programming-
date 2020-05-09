package PCU;

public class Person implements Action{


    @Override
    public void goSchool() {
        System.out.println("goSchool");
    }

    @Override
    public void goHome() {
        System.out.println("goHome");
    }
}

