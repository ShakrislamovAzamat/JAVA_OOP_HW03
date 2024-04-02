package Seminar_09.Ex01;

import java.util.Collections;
import java.util.List;

public class StreamService {

    public StreamService(List<Stream> streamsList){
    }

    public void sortStream(List<Stream> streamsList){
        Collections.sort(streamsList, new StreamComparator());
    }
}
