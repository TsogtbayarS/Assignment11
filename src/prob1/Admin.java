package prob1;

import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        //implement
        HashMap<Key, Student> map = new HashMap<Key, Student>();
        for (Student student : students) {
            map.put(new Key(student.getFirstName(), student.getLastName()), student);
        }
        return map;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        //implements
		double averagetotal = 0.0;
        int total = 0;
        for (Student student : maps.values()) {
            total++;
            averagetotal += student.getGpa();
        }
        return averagetotal/total;
    }
}
