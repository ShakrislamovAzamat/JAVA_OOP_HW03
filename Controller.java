package Seminar_09.Ex01;

import java.util.List;

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void RemoveStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.RemoveStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> GetSortedStudentList(){
        return studentGroupService.GetSortedStudentList();
    }

    public List<Student> GetSortedStudentByFIO(){
        return studentGroupService.GetSortedStudentByFIO();
    }

    private StreamService streamService;
    
    public void sortStream(List<Stream> streams){
        streamService.sortStream(streams);
    }
}
