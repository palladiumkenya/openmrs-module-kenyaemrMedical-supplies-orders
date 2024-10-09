package org.openmrs.module.medicalsuppliesorders.api.impl;

import java.util.Optional;

import org.openmrs.module.medicalsuppliesorders.api.MedicalSupplyDispenseService;
import org.openmrs.module.medicalsuppliesorders.api.dao.MedicalSupplyDispenseDao;
import org.openmrs.module.medicalsuppliesorders.api.model.MedicalSupplyDispense;

public class MedicalSupplyDispenseServiceImpl implements MedicalSupplyDispenseService {
	
	private MedicalSupplyDispenseDao medicalSupplyDispenseDao;
	
	public void setMedicalSupplyDispenseDao(MedicalSupplyDispenseDao medicalSupplyDispenseDao) {
		this.medicalSupplyDispenseDao = medicalSupplyDispenseDao;
	}
	
	@Override
	public Optional<MedicalSupplyDispense> getMedicalSupplyDispenseByUuid(String uuid) {
		return medicalSupplyDispenseDao.getMedicalSupplyDispenseByUuid(uuid);
	}
	
	@Override
	public MedicalSupplyDispense saveOrUpdate(MedicalSupplyDispense medicalSupplyDispense) {
		return medicalSupplyDispenseDao.saveOrUpdate(medicalSupplyDispense);
	}
	
}
