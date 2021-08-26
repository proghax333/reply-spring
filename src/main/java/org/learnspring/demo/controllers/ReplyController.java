
package org.learnspring.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import org.learnspring.demo.models.*;

@RestController
@RequestMapping("/")
public class ReplyController {

  @GetMapping("/reply")
  public ReplyMessage reply() {
    return new ReplyMessage("Message is empty");
  }

  @GetMapping("/reply/{message}")
  public ReplyMessage reply(@PathVariable String message) {
    return new ReplyMessage(message);
  }

}
