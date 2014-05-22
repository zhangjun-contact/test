/**
 * Project Name:maven.spring4
 * File Name:Application.java
 * Package Name:hello
 * Date:2014-4-1 обнГ4:13:29
 *
 */

package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:Application <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014-4-1 обнГ4:13:29 <br/>
 * @author   zhangjun01
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
              return "Hello World!";
            }
        };
    }

  public static void main(String[] args) {
      @SuppressWarnings("resource")
	ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();
      
  }
}
