package com.example.demo.controller;


import com.example.demo.entity.Detail;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@Controller
@RestController
@CrossOrigin
@RequestMapping("/api/v1/detail")
@RequiredArgsConstructor
public class DetailController {
    private static final ArrayList<Detail> details = new ArrayList<>();

    static {
        details.add(new Detail("xmlChipFind_api1_name1", "12.4", "10.0", "8.0", "100", "1"));
        details.add(new Detail("xmlChipFind_api1_name2", "14.4", "12.0", "10.0", "50", "1"));
        details.add(new Detail("xmlChipFind_api1_name3", "16.4", "14.0", "12.0", "0", "0"));
    }


    //    @GetMapping
    @GetMapping(produces = "application/xml")
    public List<Detail> getAll() throws InterruptedException {
//        Thread.sleep(2000);
        return details;
    }
}
