/**
 * Project Name:maven.spring4
 * File Name:MessagePrinter.java
 * Package Name:hello
 * Date:2014-4-1 обнГ4:10:50
 *
 */

package hello;
/**
 * ClassName:MessagePrinter <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014-4-1 обнГ4:10:50 <br/>
 * @author   zhangjun01
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    @Autowired
    private MessageService service;

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
