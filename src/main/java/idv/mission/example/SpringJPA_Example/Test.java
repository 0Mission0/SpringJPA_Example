package idv.mission.example.SpringJPA_Example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        CustomerService service = context.getBean(CustomerService.class);
        Customer customer = service.findOne(1);
        Logger logger = LogManager.getLogger(Test.class.getName());
        logger.info(customer);
        context.close();
    }
}
