package com.exml.pemba.consumer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.exml.pemba.model.EntityModel;

public class ConsumeXMLResponse {
  RestTemplate rest = new RestTemplate();

  public ResponseEntity<EntityModel> get(String id) {

    return rest.getForEntity("http://localhost:8080/xml-output/get/{id}",
        EntityModel.class, id);

  }
}
