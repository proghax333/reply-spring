package org.learnspring.demo.controllers.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import org.learnspring.demo.models.ReplyMessage;
import org.learnspring.demo.utils.MD5Utils;

@RestController
@RequestMapping("/v2")
public class ReplyControllerV2 {

  @GetMapping("/reply")
  public ReplyMessage reply() {
    return new ReplyMessage("Message is empty");
  }

  @GetMapping("/reply/{message}")
  public ReplyMessage replyingNew(@PathVariable String message) {
    String arr[] = message.split("-");

    if (arr.length != 2) {
      return new ReplyMessage("Enter Valid Input: " + message);
    }

    String input = arr[1]; // Reading string
    char[] num = arr[0].toCharArray(); // Reading Operations
    for(char c : num) {
      if (c == '1') {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        input = sb.toString();
      } else {
        input = MD5Utils.digest(input);
      }
    }
    return new ReplyMessage(input);
  }

}
