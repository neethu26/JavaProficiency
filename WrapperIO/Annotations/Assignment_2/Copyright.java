import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Copyright {
  String doSomething() default "james";
}
