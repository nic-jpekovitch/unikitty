package com.nicusa.assembler;

import com.nicusa.domain.Drug;
import com.nicusa.resource.DrugResource;
import org.springframework.stereotype.Component;

@Component
public class DrugAssembler {
  public DrugResource toResource(Drug drug) {
    DrugResource drugResource = new DrugResource();
    drugResource.setName(drug.getName());
    drugResource.setUnii(drug.getUnii());
    drugResource.setId(drug.getId());
    return drugResource;
  }
}
