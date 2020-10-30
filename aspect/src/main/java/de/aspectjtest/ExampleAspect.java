package de.aspectjtest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.JoinPoint.EnclosingStaticPart;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ExampleAspect {

	@Pointcut("!within(de.aspectjtest..*)")
	public void notWithinAspect() {
	}

	@Pointcut("!set(private * *)")
	public void noSet() {
		
	}
	
	@Around("notWithinAspect() && noSet()")
	public Object aroundStuff(final ProceedingJoinPoint thisJoinPoint, final EnclosingStaticPart thisEnclosingJoinPoint)
			throws Throwable {
		System.out.println("=== Call: " + thisJoinPoint.getSignature() + " " + thisJoinPoint.getKind());
		System.out.println(thisJoinPoint.getSourceLocation() + " " + thisJoinPoint.getStaticPart());
		System.out.println(thisJoinPoint.toLongString());
		return thisJoinPoint.proceed();
	}
}
