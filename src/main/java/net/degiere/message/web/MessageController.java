package net.degiere.message.web;

import net.degiere.message.domain.Message;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/messages")
@Controller
@RooWebScaffold(path = "messages", formBackingObject = Message.class)
public class MessageController {
}
