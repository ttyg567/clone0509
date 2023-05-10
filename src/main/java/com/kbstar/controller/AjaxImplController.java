package com.kbstar.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class AjaxImplController {

    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

//    @RequestMapping("/month_gender_statics")
//    public Object monthGenderStatics(){
//        List<> list = null;
//        list.
//    }

    @RequestMapping("/app_user_age")
    public Object appUserAge(){
        // [{name: "", y: ""}
        // ,{name: "", y: ""}]
        // {10대: 3.2, 30대: 20.3, 20대: 16.8, 50대: 29.5, 40대: 30.3}
        Map<String, Double> oracle_db = new HashMap();
        oracle_db.put("10대", 3.2);
        oracle_db.put("20대", 16.8);
        oracle_db.put("30대", 20.3);
        oracle_db.put("40대", 30.3);
        oracle_db.put("50대", 29.5);

        JSONArray ja = new JSONArray();

        for (Map.Entry<String, Double> entry : oracle_db.entrySet()) {
            JSONObject jo = new JSONObject();
            String key = entry.getKey();
            Double value = entry.getValue();
            jo.put("name", key);
            jo.put("y", value);
            ja.add(jo);
        }
        return ja;
    }

    @RequestMapping("/baseRate")
    public Object baseRate(){
        // [{ name: '', data: [1, 2, 3... ] },
        // { name: '', data : [1, 2, 3...] }]
        // https://elonbro.tistory.com/entry/%EA%B8%B0%EC%A4%80%EA%B8%88%EB%A6%AC-%ED%95%9C%EA%B5%AD-%EB%AF%B8%EA%B5%AD-%EA%B8%B0%EC%A4%80-%EA%B8%88%EB%A6%AC-%EB%B9%84%EA%B5%90
        Map<String, double[]> oracle_db = new HashMap();
        oracle_db.put("한국", new double[]{1.25, 1.25, 1.25, 1.50, 1.75, 1.75, 2.00, 2.50, 2.50, 3.00, 3.25, 3.25});
        oracle_db.put("미국", new double[]{0.25, 0.25, 0.50, 0.50, 1.00, 1.75, 2.50, 2.50, 3.25, 3.25, 4.00, 4.50});

        JSONArray ja = new JSONArray();

        for (Map.Entry<String, double[]> entry : oracle_db.entrySet()) {
            JSONObject jo = new JSONObject();
            String key = entry.getKey(); // 한국
            double[] value = entry.getValue(); // new double[]{1.25, 1.25, 1.25, 1.50, 1.75, 1.75, 2.00, 2.50, 2.50, 3.00, 3.25, 3.25}
            jo.put("name", key);
            jo.put("data", value);
            ja.add(jo);
        }
        return ja;
    }
}
