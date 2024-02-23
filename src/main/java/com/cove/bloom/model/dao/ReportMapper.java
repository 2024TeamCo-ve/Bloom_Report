package com.cove.bloom.model.dao;

import com.cove.bloom.model.dto.ReportDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportMapper {
    void registReport(ReportDTO newReport);
}
