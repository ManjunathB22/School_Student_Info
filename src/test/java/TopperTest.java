import java.util.ArrayList;
import java.util.List;
import com.github.javafaker.Faker;

public class TopperTest {

    public static void main(String[] args) {
        System.out.println("List of student and Subject marks");
        List<ClassStandard> allClassStandard = new ArrayList<>();
        ClassStandard classStandard1 = new ClassStandard().setNumberOfStandardsAndStudent("Three", 5);
        ClassStandard classStandard2 = new ClassStandard().setNumberOfStandardsAndStudent("Five", 3);
        ClassStandard classStandard3 = new ClassStandard().setNumberOfStandardsAndStudent("Two", 2);
        ClassStandard classStandard4 = new ClassStandard().setNumberOfStandardsAndStudent("One", 4);
        ClassStandard classStandard5 = new ClassStandard().setNumberOfStandardsAndStudent("Seven", 5);
        allClassStandard.add(classStandard1);
        allClassStandard.add(classStandard2);
        allClassStandard.add(classStandard3);
        allClassStandard.add(classStandard4);
        allClassStandard.add(classStandard5);
        School school = new School();
        school.setClassStandardList(allClassStandard);
        System.out.println(school.topperName("Seven"));
    }
}
