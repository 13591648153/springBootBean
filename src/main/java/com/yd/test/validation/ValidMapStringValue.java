package com.yd.test.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * MAP非法参数验证
 * @author he.jf@neusoft.com
 * @since  2020-03-06
 */
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidMapStringValueConstraint.class)
public @interface ValidMapStringValue {

	String message();

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
