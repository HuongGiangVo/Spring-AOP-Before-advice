package aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	//this is where we add all of our related advices for logging
	
	//let's start with an @Before advice
	//@Before("execution(public void addAccount())")
	//@Before("execution(* add*(aopdemo.Account))")	
	@Before("execution(* add*(aopdemo.Account,..))")	//any number of parameters, any type 
	public void beforeAddAccountAdvice() {
		System.out.println("\n Excuting @Before advice on addAccount()");
	}

}
