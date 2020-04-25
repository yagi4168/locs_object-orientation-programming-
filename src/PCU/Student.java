package PCU;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Student extends Person{

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


    public interface goSchool {

    }




}

