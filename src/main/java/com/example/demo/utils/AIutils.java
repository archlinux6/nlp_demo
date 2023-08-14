package com.example.demo.utils;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;

public class AIutils {
    //设置APPID/AK/SK
    public static final String APP_ID = "36821362";
    public static final String API_KEY = "VTXZmKlpORh7piiqGRShAFry";
    public static final String SECRET_KEY = "cGiIMCkLYXB6jUnjY8t9Fjo826XUsUXc";

    public static String picToWords(MultipartFile file) throws IOException {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 调用接口

        JSONObject res = client.basicGeneral(file.getBytes(), new HashMap<String, String>());
        JSONArray words_result = res.getJSONArray("words_result");
        String result = "";
        for (int i = 0; i < words_result.length(); i++) {
            JSONObject jsonObject = words_result.getJSONObject(i);
            Object words = jsonObject.get("words");
            String s = (String) words;
            result += s + "";
        }
        return result;
    }


}
