package com.example.SimplifiedLicenseAPI.service;

import com.example.SimplifiedLicenseAPI.model.LicenseType;
import com.example.SimplifiedLicenseAPI.repository.LicenseTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class LicenseTypeService {
    private final LicenseTypeRepository repository;

    public LicenseTypeService(LicenseTypeRepository repository) {
        this.repository = repository;
    }

    public void saveLicenseType(String licenseTypeCode, String
            ministryCode, boolean canBeUsedPartially) {
        if
        (repository.findByLicenseTypeCode(licenseTypeCode).isPresent()) return;
        LicenseType licenseType = new LicenseType();
        licenseType.setLicenseTypeCode(licenseTypeCode);
        licenseType.setMinistryCode(ministryCode);
        licenseType.setCanBeUsedPartially(canBeUsedPartially);
        repository.save(licenseType);
    }
}

