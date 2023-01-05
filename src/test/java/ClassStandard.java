import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class ClassStandard {
    private List<Student> students;
    private String nameOfStandard;

    public ClassStandard(List<Student> students, String nameOfStandard) {
        this.students = students;
        this.nameOfStandard = nameOfStandard;
    }

    public ClassStandard setNumberOfStandardsAndStudent(String nameOfStandard, int numberOfStudent) {
            System.out.println("Name" + "\t" + "English Marks" + "\t" + "Math Marks" + "\t" + "History Marks");
            List<Student> studentList = new Student().setStudentNameAndMarks(numberOfStudent);
            ClassStandard standard = new ClassStandard(studentList, nameOfStandard);
        return standard;
    }


    public String getClassTopperName(List<Student> studentList) {
        float highestMarks = 0;
        String topperName = "";
        for(int i=0;i<studentList.size();i++){
           float getMarks = ((studentList.get(i).getTotalMarks())/300)*100;
           if(getMarks > highestMarks){
               highestMarks = getMarks;
               topperName = studentList.get(i).getStudentName();
           }
        }
        return topperName;
    }
}
