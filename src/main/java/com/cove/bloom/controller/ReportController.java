package com.cove.bloom.controller;

import com.cove.bloom.model.dto.ReportDTO;
import com.cove.bloom.model.service.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService){
        this.reportService = reportService;
    }

    @GetMapping("/regist")
    public void registPage(){

    }

    @PostMapping("/regist")
    public String registReport(ReportDTO newReport){
        newReport.setRepMem("김신고");

        reportService.registReport(newReport);

        return "/report/result";
    }

}
