package block2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME)


public @interface TODO {
	String what() default "";
	int when() default 0;
}
