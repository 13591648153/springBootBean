package com.yd.test.validation;

import java.util.Map;
import java.util.Map.Entry;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 验证查询参数中的非法字符，防止XSS功击、SQL盲注
 * @author he.jf@neusoft.com
 * @since 2020-03-06
 */
public class ValidMapStringValueConstraint implements ConstraintValidator<ValidMapStringValue, Object> {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	private String filterChar = "alert|select|update|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|drop|execute|from|script|having|;|:|,|..|&|%|?|*|>|<|'|\"|\\\\|(|)|{|}|+|$|@|=|#|^}";

	private String splitChar = "\\|";

	@Override
	public void initialize(ValidMapStringValue constraintAnnotation) {
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		try {
			if(value == null) {
				return true;
			}
			Map<String, Object> validMap = (Map<String, Object>)value;
			if(validMap.isEmpty()) {
				return true;
			}
			// 非法字符
			String[] filterChars = filterChar.split(splitChar);
			for (Entry<String, Object> enty : validMap.entrySet()) {
				String stringValue = String.valueOf(enty.getValue());
				for (int i = 0; i < filterChars.length; i++) {
					if (stringValue.contains(filterChars[i])) {
						log.error("查询参数中不能有非法字符，请修改参数:{}值:{}非法字符:{}", enty.getKey(), stringValue, filterChars[i]);
						return false;
					}
				}
			}
			return true;
		}catch (Exception e) {
			log.error("验证查询参数中的非法字符异常，默认放行...",e);
			return true;
		}
	
	}

}