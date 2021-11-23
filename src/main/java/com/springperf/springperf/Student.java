package com.springperf.springperf;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Student {

    @Getter @Setter
    private long studentId;

    @Getter
    private String studentName;

    @Getter @Setter(AccessLevel.PROTECTED)
    private List<String> subjects;

}
