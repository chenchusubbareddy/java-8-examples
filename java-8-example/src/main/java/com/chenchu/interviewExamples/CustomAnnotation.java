package com.chenchu.interviewExamples;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
	String os() default "symbian";

	int version() default 0;

}

@SmartPhone(os = "Andriod", version = 6)
class Nokia {
	String model;
	double screensize;

	public Nokia(String model, double screensize) {
		super();
		this.model = model;
		this.screensize = screensize;
	}

}

public class CustomAnnotation {
	public static void main(String[] args) {
		Nokia n = new Nokia("nokai 2255", 5.6);
		Class<? extends Nokia> class1 = n.getClass();
		SmartPhone annotation = class1.getAnnotation(SmartPhone.class);
		
	}
}
