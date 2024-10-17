package org.fipro.ds.configurable;

public @interface MessageConfig {
	
    String message() default "";
    
    int iteration() default 0;
    
}