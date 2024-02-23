package com.cove.bloom.model.dto;

import java.sql.Date;

public class ReportDTO implements java.io.Serializable{

    private int repNo;
    private String repMem;
    private String repRmem;
    private String repRea;
    private Date repDate;

    public ReportDTO (){

    }

    public ReportDTO(int repNo, String repMem, String repRmem, String repRea, Date repDate) {
        this.repNo = repNo;
        this.repMem = repMem;
        this.repRmem = repRmem;
        this.repRea = repRea;
        this.repDate = repDate;
    }

    public int getRepNo() {
        return repNo;
    }

    public void setRepNo(int repNo) {
        this.repNo = repNo;
    }

    public String getRepMem() {
        return repMem;
    }

    public void setRepMem(String repMem) {
        this.repMem = repMem;
    }

    public String getRepRmem() {
        return repRmem;
    }

    public void setRepRmem(String repRmem) {
        this.repRmem = repRmem;
    }

    public String getRepRea() {
        return repRea;
    }

    public void setRepRea(String repRea) {
        this.repRea = repRea;
    }

    public Date getRepDate() {
        return repDate;
    }

    public void setRepDate(Date repDate) {
        this.repDate = repDate;
    }

    @Override
    public String toString() {
        return "ReportDTO{" +
                "repNo=" + repNo +
                ", repMem='" + repMem + '\'' +
                ", repRmem='" + repRmem + '\'' +
                ", repRea='" + repRea + '\'' +
                ", repDate=" + repDate +
                '}';
    }
}
