import com.github.javafaker.Faker;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Student {
    private String studentName;
    private int englishMarks;
    private int mathMarks;
    private int historyMarks;

    public Student(String studentName, int englishMarks, int mathMarks, int historyMarks) {
        this.studentName = studentName;
        this.englishMarks = englishMarks;
        this.mathMarks = mathMarks;
        this.historyMarks = historyMarks;
    }

    public float getTotalMarks(){
        return this.englishMarks + this.mathMarks + this.historyMarks;
    }

    public List<Student> setStudentNameAndMarks(int numberOfStudent){
        List<Student> studentDetails = new ArrayList<Student>();
        Faker faker = new Faker();
        for(int i=1; i<=numberOfStudent; i++) {
            Student oneStudentDetail = new Student(faker.name().firstName(), faker.number().numberBetween(1, 100), faker.number().numberBetween(1, 100), faker.number().numberBetween(1, 100));
            System.out.println(oneStudentDetail.studentName +"\t"+ oneStudentDetail.englishMarks +"\t"+ oneStudentDetail.mathMarks +"\t"+ oneStudentDetail.historyMarks);
            studentDetails.add(oneStudentDetail);
        }
        return studentDetails;
    }
}
