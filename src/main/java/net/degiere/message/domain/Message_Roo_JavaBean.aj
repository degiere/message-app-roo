// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package net.degiere.message.domain;

import java.util.Date;
import net.degiere.message.domain.Message;

privileged aspect Message_Roo_JavaBean {
    
    public String Message.getContent() {
        return this.content;
    }
    
    public void Message.setContent(String content) {
        this.content = content;
    }
    
    public Date Message.getModified() {
        return this.modified;
    }
    
    public void Message.setModified(Date modified) {
        this.modified = modified;
    }
    
}
