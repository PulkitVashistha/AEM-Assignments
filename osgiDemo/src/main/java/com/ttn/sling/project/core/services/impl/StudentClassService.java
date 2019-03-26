package com.ttn.sling.project.core.services.impl;

import com.ttn.sling.project.core.services.MyStudentClassInterface;
import com.ttn.sling.project.core.services.Student;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Component(immediate = true,service = MyStudentClassInterface.class)
public class StudentClassService extends ClassConfigurationService implements MyStudentClassInterface {
    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    List<Student> studentList = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        if(!isClassLimitReached(studentList))
        LOGGER.info("---------StudentClassService.addStudent ->"+student.getName()+"--------");
        else
            LOGGER.info("---------StudentClassService.addStudent classLimitReached--------");
        studentList.add(student);
    }

    @Override
    public void deleteStudent(int index) {
        LOGGER.info("---------StudentClassService.deleteStudent ->"+studentList.get(index).getName()+"--------");
        studentList.remove(index);
    }

    @Override
    public void isStudentPassed(int index) {
        LOGGER.info("---------StudentClassService.isStudentPassed ->"+studentList.get(index).getName()+"--------");
        LOGGER.info(String.valueOf(studentList.get(index).getMarks()>=getPassingMarks()));
    }

    @Override
    public void getStudent(int index) {
        LOGGER.info("---------StudentClassService.getStudent"+studentList.get(index)+"--------");
    }

    @Override
    public void getAllStudents() {
        LOGGER.info("---------StudentClassService.getAllStudent--------\n"+studentList.toString());
    }
}
