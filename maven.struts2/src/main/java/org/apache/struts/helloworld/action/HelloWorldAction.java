/**
 * Project Name:buaa.campus.resources
 * File Name:HelloWorldAction.java
 * Package Name:org.apache.struts.helloworld.action
 * Date:2014-4-1 下午3:15:42
 *
 */

package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ClassName:HelloWorldAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2014-4-1 下午3:15:42 <br/>
 * @author   zhangjun01
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
public class HelloWorldAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	 
    private MessageStore messageStore;
     
    public String execute() throws Exception {
         
        messageStore = new MessageStore() ;
        return SUCCESS;
    }
    
    public MessageStore getMessageStore() {
        return messageStore;
    }
 
    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
