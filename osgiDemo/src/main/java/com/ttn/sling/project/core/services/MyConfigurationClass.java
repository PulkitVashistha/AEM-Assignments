package com.ttn.sling.project.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "My Service Configuration",description = "Service Configuration")
public @interface MyConfigurationClass {

    @AttributeDefinition(name = "No-Of-Students", type= AttributeType.INTEGER ) //optional annotation - This annotation is only used to specify non-default AttributeDefinition information.
            int getNoOfStudentsAllowed() default 60;

    @AttributeDefinition(name = "Passing-Marks", description = "Number values", type= AttributeType.INTEGER ) //type- check one more time
            int getPassingMarks() default 30;


    String method() default "GET";

}
