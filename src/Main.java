import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext classPathAppContext = new ClassPathXmlApplicationContext(
				"application-context.xml");

		Person person = (Person) classPathAppContext.getBean("person");
		String city = person.getCity();
		System.out.println(person.getName()+" lives in " + city);
	}

}
