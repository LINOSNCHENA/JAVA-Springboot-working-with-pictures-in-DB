package com.exml.pemba.model;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
@XmlRootElement
@Data

public class EntityModel {
   
      String ID;
      String instanceId;
     String operation;
     String agentId;
     String strategyId;
     String strategyName;
     String status;
   
}
