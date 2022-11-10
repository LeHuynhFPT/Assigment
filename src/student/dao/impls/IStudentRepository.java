package student.dao.impls;


import assignment_jp2.entities.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<Student> all();
    boolean create(Student student) throws Exception;
}