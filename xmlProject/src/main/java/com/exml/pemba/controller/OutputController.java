package com.exml.pemba.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exml.pemba.consumer.ConsumeXMLResponse;
import com.exml.pemba.model.EntityModel;

@Controller
@RequestMapping("View")

public class OutputController {
    
    @GetMapping("/get/{id}")
    public String getXMLOutput(@PathVariable("id") String id, Model model) {

        ConsumeXMLResponse response = new ConsumeXMLResponse();
        ResponseEntity<EntityModel> responseEntity = response.get(id);
        System.out.print(response);

        EntityModel entity = responseEntity.getBody();
        HttpHeaders headers = responseEntity.getHeaders();

        model.addAttribute("xml", entity);
        model.addAttribute("XMLheaders", headers);

        return "View";
    }
}
