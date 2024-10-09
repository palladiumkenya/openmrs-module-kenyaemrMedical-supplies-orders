package org.openmrs.module.medicalsuppliesorders.api;

import java.util.Optional;

import org.openmrs.module.medicalsuppliesorders.api.model.MedicalSupplyDispense;
import org.springframework.lang.NonNull;

public interface MedicalSupplyDispenseService {
	
	Optional<MedicalSupplyDispense> getMedicalSupplyDispenseByUuid(@NonNull String uuid);
	
	MedicalSupplyDispense saveOrUpdate(@NonNull MedicalSupplyDispense medicalSupplyDispense);
	
}
