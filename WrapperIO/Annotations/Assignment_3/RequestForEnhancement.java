import java.lang.annotation.*;
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface RequestForEnhancement{
    int id() ;
    String synopsis() default "time-travel";
    String engineer() default "james";
    String date() default "9/5/2012"; 
}


