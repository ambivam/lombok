package com.springperf.springperf;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class StudentBoy {

    private final long studentId;

    private final String studentName;

    private List<String> subjects;

}
