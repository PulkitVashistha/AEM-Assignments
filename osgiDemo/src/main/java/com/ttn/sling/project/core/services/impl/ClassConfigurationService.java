package com.ttn.sling.project.core.services.impl;

import com.ttn.sling.project.core.services.MyConfigurationClass;
import com.ttn.sling.project.core.services.MyStudentInterface;
import com.ttn.sling.project.core.services.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Designate(ocd = MyConfigurationClass.class)
@Component(service = MyStudentInterface.class)
public class ClassConfigurationService implements MyStudentInterface {

    Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private int getNumberOfStudentsAllowed, getPassingMarks;

    @Activate
    public void activate(MyConfigurationClass myConfigurationClass){
        LOGGER.info("activate of CLASSCONFIGURATIONSERVICE called ::::"+myConfigurationClass.getNoOfStudentsAllowed());
        getNumberOfStudentsAllowed = myConfigurationClass.getNoOfStudentsAllowed();
        getPassingMarks = myConfigurationClass.getPassingMarks();
    }

    @Override
    public boolean isClassLimitReached(List<Student> list) {
        LOGGER.info("Students allowed ::::: "+list.size()+"::::"+getNumberOfStudentsAllowed);
        if (list!=null)
        return list.size()>getNumberOfStudentsAllowed;
        else
            return false;
    }

    @Override
    public int getPassingMarks() {
        return getPassingMarks;
    }
}
