package idv.mission.example.SpringJPA_Example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        CustomerService service = context.getBean(CustomerService.class);
        Customer customer = service.findOne(1);
        System.out.println(customer);
        try {
            Thread.sleep(30 * 1000);
        }
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
        context.close();
    }
}
