package com.example.ramsdroid;

public class Record {

    // Create private data variables
    private String subjectCode;
    private String subjectName;
    private String section;
    private String units;
    private String instructor;

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(String midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public String getMidtermAbsences() {
        return midtermAbsences;
    }

    public void setMidtermAbsences(String midtermAbsences) {
        this.midtermAbsences = midtermAbsences;
    }

    public String getEndTermGrade() {
        return endTermGrade;
    }

    public void setEndTermGrade(String endTermGrade) {
        this.endTermGrade = endTermGrade;
    }

    private String midtermGrade;
    private String midtermAbsences;
    private String endTermGrade;


    // generate getters and setters

}

