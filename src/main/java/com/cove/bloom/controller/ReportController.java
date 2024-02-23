package com.cove.bloom.controller;

import com.cove.bloom.model.dto.ReportDTO;
import com.cove.bloom.model.service.ReportService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService){
        this.reportService = reportService;
    }

    @GetMapping("/list")
    public String findReportList(Model model){
        List<ReportDTO> reportList = reportService.findAllReport();

        model.addAttribute("reportList",reportList);

        return "list";


    }


}
