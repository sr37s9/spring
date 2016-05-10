package com.rcb.aspect;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements ThrowsAdvice
{
	public void afterThrowing(IllegalArgumentException ex)
	{
		System.out.println("after throwing exception");
	}
}
