package Seminar_09.Ex01;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
       return Integer.compare(o1.getStudentGroupList().size(), o2.getStudentGroupList().size());
    }

}
