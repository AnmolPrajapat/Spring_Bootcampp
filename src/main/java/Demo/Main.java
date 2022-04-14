package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


//        Doctor doctor = context.getBean(Doctor.class);
//        Engineer pr = context.getBean(Professor.class);
//        pr.assist();
////        pr.teaching();
////        doctor.assist();
//        DataScience ds = context.getBean(DataScience.class);
//        ds.assist();
        EngineersStaff es = context.getBean(Engineer.class);
        es.assist();
//        EngineersStaff es2 = context.getBean(DataScience.class);
//        es2.assist();
    }
}
