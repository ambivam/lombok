package com.springperf.springperf;

import lombok.*;

import java.util.List;

@Data
public class StudentAll {


    private long studentId;

    private String studentName;

    private List<String> subjects;

}
