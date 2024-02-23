package com.cove.bloom.controller;

import com.cove.bloom.model.dto.ReportDTO;
import com.cove.bloom.model.service.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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

        return "report/list";
    }

    @GetMapping("/regist")
    public void registPage(){


    }

    @PostMapping("/regist")
    public String registReport(ReportDTO newReport){
        newReport.setRepMem("김신고");

        reportService.registReport(newReport);

        return "report/result";
    }

    @GetMapping("delete")
    public String deleteReport(int repNo, Model model){

        List<ReportDTO> reportList = new ArrayList<>();
        reportList.add(new ReportDTO(1, "신고자1", "피신고자1", "신고내용1",new java.sql.Date(System.currentTimeMillis())));
        reportList.add(new ReportDTO(2, "신고자2", "피신고자2", "신고내용2",new java.sql.Date(System.currentTimeMillis())));
        reportList.add(new ReportDTO(3, "신고자3", "피신고자3", "신고내용3",new java.sql.Date(System.currentTimeMillis())));
        reportList.add(new ReportDTO(4, "신고자4", "피신고자4", "신고내용4",new java.sql.Date(System.currentTimeMillis())));
        String userid = "신고자1";

        for(ReportDTO report : reportList){
            if((report.getRepNo() == repNo) && (report.getRepMem().equals(userid))){
                reportService.deleteReport(repNo);
                model.addAttribute("reportList", reportList);
                return "list"; //성공
            }
        }
        return "list"; //실패, 삭제할 수 없음
    }


}
