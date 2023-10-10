package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinMaxValidator implements ConstraintValidator <ValidMinMax, Part>{
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidMinMax constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(context==null) return true;
        if(context!=null)myContext=context;
        if(part.getInv() <= part.getMaxInv() &&
                part.getInv() >= part.getMinInv()) return true;
        else return false;
    }
}
