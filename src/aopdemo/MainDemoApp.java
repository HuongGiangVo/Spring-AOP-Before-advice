package aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aopdemo.dao.AccountDAO;
import aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		//get bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		Account myAcc = new Account();
		//call the business method
		System.out.println("\ncall the addAccount of AccountDAO");
		theAccountDAO.addAccount(myAcc);
		System.out.println("\ncall the addAccount of MembershipDAO");
		theMembershipDAO.addAccount();
		//close the context
		context.close();

	}

}
