package com.example.test.rest;

import com.example.test.bean.Dag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public interface DagResource {



    @GetMapping
    Message<PageList<Dag>> dagInfoList(
            /*@RequestParam("filters") List<String> queryFilters,
            @RequestParam("ownerCode") String ownerCode,
            @RequestParam("creator") String creator,*/
            @RequestParam("currentPage") int currentPage,
            @RequestParam("numberPerPage") int numberPerPage/*,
            @RequestParam("indexOrderKey") String indexOrderKey,
            @RequestParam("indexOrder")  String indexOrder*/);

    @GetMapping("/test")
    Message<String> test();

    @GetMapping("/2")
    Message<List<Map<String, Object>>> dagInfoList2(
            /*@RequestParam("filters") List<String> queryFilters,
            @RequestParam("ownerCode") String ownerCode,
            @RequestParam("creator") String creator,*/
            @RequestParam("name") String name
           /*,
            @RequestParam("indexOrderKey") String indexOrderKey,
            @RequestParam("indexOrder")  String indexOrder*/);

    @GetMapping("/1")
    Message<List<Map<String, Object>>> updateData(String name, String id);

    @GetMapping("/3")
    Message<List<Map<String, Object>>> addData();

}
