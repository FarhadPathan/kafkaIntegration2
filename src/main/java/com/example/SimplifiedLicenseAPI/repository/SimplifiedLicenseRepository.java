package com.example.SimplifiedLicenseAPI.repository;

import com.example.SimplifiedLicenseAPI.model.SimplifiedLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface SimplifiedLicenseRepository extends JpaRepository<SimplifiedLicense, String> {
}
