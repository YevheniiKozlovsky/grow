package com.epam.grow.springdata.repository.jpa;

import com.epam.grow.springdata.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Integer> {
}