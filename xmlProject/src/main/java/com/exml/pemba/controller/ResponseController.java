package com.exml.pemba.controller;

// Importing required classes
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exml.pemba.model.EntityModel;

// Annotations
@RestController
@RequestMapping(path = "/xml-output", produces = "application/xml")

public class ResponseController {
    @GetMapping("/get")
    public ResponseEntity<EntityModel> get() {
        EntityModel model = new EntityModel();
        model.setID("2");
        model.setInstanceId("ea5dcb49-aca8-4236-a840-d5a9467b9fa2");
        model.setOperation("SET");
        model.setAgentId("8ee6f5d1-3109-4117-b82c-33b6ebab5831");
        model.setStrategyId("1c7a396a-e050-4ebe-b173-fdd75feec23b");
        model.setStrategyName("NikolasLeon");
        model.setStatus("Deleting");

        HttpHeaders hearders = new HttpHeaders();
        ResponseEntity<EntityModel> entityModel = new ResponseEntity<>(model, hearders,
                HttpStatus.CREATED);

        return entityModel;
    }

    // Annotation
    @GetMapping("/get/{id}")

    public ResponseEntity<EntityModel> getById(@PathVariable("id") String id) {

        EntityModel model = new EntityModel();
        model.setID(id);
        model.setInstanceId(id);
        model.setOperation("SET");
        model.setAgentId("85ea51b5-a464-48f4-8728-1e00b20e5897");
        model.setStrategyId("c9647578-8e1b-491c-9424-04cb6515f62c");
        model.setStrategyName("LorenaLeon");
        model.setStatus("Running");

        HttpHeaders hearders = new HttpHeaders();
        ResponseEntity<EntityModel> entityModel = new ResponseEntity<>(model, hearders,
                HttpStatus.CREATED);

        return entityModel;
    }

}
