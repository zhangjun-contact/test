/**
 * Project Name:buaa.campus.resources
 * File Name:MessageStore.java
 * Package Name:org.apache.struts.helloworld.model
 * Date:2014-4-1 下午3:14:44
 *
 */

package org.apache.struts.helloworld.model;
/**
 * ClassName:MessageStore <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014-4-1 下午3:14:44 <br/>
 * @author   zhangjun01
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
public class MessageStore {
	private String message;
    
    public MessageStore() {
         
        setMessage("Hello Struts User");
    }
 
    public String getMessage() {
 
        return message;
    }
 
    public void setMessage(String message) {
 
        this.message = message;
    }
}
