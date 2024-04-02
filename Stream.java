package Seminar_09.Ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroupList;

    public Stream (){
        studentGroupList = new ArrayList<>();
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroupList.iterator();
    }

    




}
