package com.ars;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StringReversalMain {

    @RequestMapping("/reverse")
    public StringBuilder reverse() {
        String str = "Ananya";
        StringBuilder revstr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            revstr.append(str.charAt(i));
        }
        return revstr;
    }
}