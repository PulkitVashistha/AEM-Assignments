package com.ttn.sling.project.core.services.impl;

import com.ttn.sling.project.core.services.MyStudentClassInterface;
import com.ttn.sling.project.core.services.MyStudentInterface;
import com.ttn.sling.project.core.services.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class StudentServiceTest {

    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Reference
    MyStudentClassInterface myStudentClassInterface;

    @Reference
    MyStudentInterface myStudentInterface;

    @Activate
    public void activate(){

        LOGGER.info("StudentServiceTest activate method called \n");

        myStudentClassInterface.addStudent(new Student(45,"Gaurav",234,25));
        myStudentClassInterface.addStudent(new Student(35,"Pulkit",23,23));
        myStudentClassInterface.addStudent(new Student(15,"Tintin",235,21));
        myStudentClassInterface.addStudent(new Student(70,"Manas",236,28));
        myStudentClassInterface.addStudent(new Student(47,"Mansi",437,40));
        myStudentClassInterface.addStudent(new Student(20,"Rinkiya",232,2));
        myStudentClassInterface.deleteStudent(1);
        myStudentClassInterface.isStudentPassed(2);
        myStudentClassInterface.getStudent(4);
        myStudentClassInterface.getAllStudents();

    }
}
