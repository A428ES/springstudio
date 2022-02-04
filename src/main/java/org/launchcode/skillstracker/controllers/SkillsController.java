package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    // responds to get requests at "/hello"
    @ResponseBody
    @GetMapping("")
    public String hello() {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>Three Programming Languages</h2>" +
                "<ol><li>Java</li><li>Javascript</li><li>Python</li></ol>";
        return html;
    }

    @RequestMapping(value = "form", method = {RequestMethod.POST})
    @ResponseBody
    public String results(@RequestParam String name, @RequestParam String firstlang, @RequestParam String secondlang, @RequestParam String thirdlang) {
        String html = "<h1>Skills Tracker</h1><h2>" + name + "'s favorite languages</h2>";
        html += "<ol><li>" + firstlang + "</li><li>" + secondlang + "</li><li>" + thirdlang + "</li></ol>";
        return html;
    }


    @ResponseBody
    @GetMapping("form")
    public String form(){
        String html = "<html>" +
                "<body>" +
                "<form method = 'post' action = '/form'>" +
                "Name: <input type = 'text' name = 'name' /><br />" +
                "<select name='firstlang'>\n" +
                "  <option value='Java'>Java</option>\n" +
                "  <option value='JavaScript'>JavaScript</option>\n" +
                "  <option value='Python'>Python</option>\n" +
                "</select><br />" +
                "<select name='secondlang'>\n" +
                "  <option value='Java'>Java</option>\n" +
                "  <option value='JavaScript'>JavaScript</option>\n" +
                "  <option value='Python'>Python</option>\n" +
                "</select><br />" +
                "<select name='thirdlang'>\n" +
                "  <option value='Java'>Java</option>\n" +
                "  <option value='JavaScript'>JavaScript</option>\n" +
                "  <option value='Python'>Python</option>\n" +
                "</select><br />" +
                "<input type = 'submit' value = 'Submit!' /><br />" +
                "</form>" +
                "</body>" +
                "</html>";;
        return html;
    }

}
