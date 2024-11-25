package com.example.SimplifiedLicenseAPI.repository;

import com.example.SimplifiedLicenseAPI.model.LicenseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LicenseTypeRepository extends JpaRepository<LicenseType, String> {
    Optional<LicenseType> findByLicenseTypeCode(String licenseTypeCode);
}