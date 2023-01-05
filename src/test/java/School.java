import lombok.Setter;

import java.util.List;

@Setter
public class School {
    List<ClassStandard> classStandardList;

    public String topperName(String standard){
        String topperName="";
        for(int i=0; i< classStandardList.size();i++ ){
            if(classStandardList.get(i).getNameOfStandard() == standard){
                topperName = classStandardList.get(i).getClassTopperName(classStandardList.get(i).getStudents());
                break;
            }
        }
        return topperName;
    }
}
