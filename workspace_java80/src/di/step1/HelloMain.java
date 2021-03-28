package di.step1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
/*
 * spring-core.jar는 IoC를 제공하는 역할을 하였음.
 * IoC는 Inversion of Conversion의 약자임 - 번역하면 역제어 또는 제어 역행이라고 한다.
 * 최근에 사용되는 모든 컨테이너들이 공통으로 사용하고 있는 개념이다.
 * 기존방식
 * 자바기반으로 어플리케이션을 개발할 때 자바 객체를 생성하고 서로간의 의존관계를
 * 연결시키는 작업에 대한 제어권은 보통 개발되는 어플리케이션에 있음.
 * 
 * 문제 제기
 * 컴포넌트간의 결합도가 높아서 컴포넌트의 확장 및 재ㅏ용이 어려운 문제점 발생함.
 * 
 * 해결 방법은?
 * IoC사용
 * 제어권이 Container에게 넘어가 객체의 생명 주기를 Container가 전담하게 됨.
 * 
 * 해결내용
 * 컴포넌트간의 결합도가 낮아져 컴포넌트의 재사용 및 확장이 쉽고 
 * 컴포넌트의 의존관계 변경이 쉬움.
 */
import org.springframework.core.io.Resource;

public class HelloMain {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext는 ApplicationContext의 구현체 클래스임.
		//생성자의 파라미터로 xml문서를 스캔함.
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
										("di\\step1\\helloBean.xml");
		ApplicationContext context2 = 
									new ClassPathXmlApplicationContext
									("di\\step1\\sonataBean.xml");
		Sonata himCar = (Sonata)context2.getBean("himCar");
		Sonata herCar = (Sonata)context2.getBean("herCar");
		Resource resource = new FileSystemResource("C:\\Users\\user\\git\\210214dustmq\\workspace_java80\\src\\di\\step1\\helloBean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloBean helloBean2 = (HelloBean)factory.getBean("helloBean222");
        HelloBean helloBean = (HelloBean)context.getBean("helloBean222");
        System.out.println(helloBean.getGreeting("Hi~이게왜나와"));
        System.out.println(helloBean2.getGreeting("Hi~이게왜나와"));
        
	
	}

}
