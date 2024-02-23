package com.cove.bloom.model.service;

import com.cove.bloom.model.dao.ReportMapper;
import com.cove.bloom.model.dto.ReportDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReportService {

    private final ReportMapper reportMapper;

    public ReportService(ReportMapper reportMapper){
        this.reportMapper = reportMapper;
    }

    @Transactional
    public void registReport(ReportDTO newReport) {

        reportMapper.registReport(newReport);
    }
}
