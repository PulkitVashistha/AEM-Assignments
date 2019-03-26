package com.ttn.sling.project.core.services;

import java.util.List;

public interface MyStudentInterface {

    public boolean isClassLimitReached(List<Student> list);

    public int getPassingMarks();
}
