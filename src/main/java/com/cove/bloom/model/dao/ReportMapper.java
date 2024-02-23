package com.cove.bloom.model.dao;

import com.cove.bloom.model.dto.ReportDTO;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Date;
import java.util.List;

@Mapper
public interface ReportMapper {
    List<ReportDTO> findAllReport();


    void registReport(ReportDTO newReport);


    void deleteReport(int repNo);
}
