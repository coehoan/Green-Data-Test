package site.metacoding.weather.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import site.metacoding.weather.domain.ResponseDto;

@Service
public class WeatherService {

    public ResponseDto 다운로드(Integer id) {
        String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";
        RestTemplate rt = new RestTemplate();
        ResponseDto responseDto = new ResponseDto();

        try {
            StringBuffer sb = new StringBuffer();
            sb.append("http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?");
            sb.append("serviceKey=" + key);
            sb.append("&pageNo=1");
            sb.append("&numOfRows=10");
            sb.append("&dataType=json");
            sb.append("&CURRENT_DATE=2019122010");
            sb.append("&HOUR=24");
            sb.append("&COURSE_ID=" + id);

            URI uri = new URI(sb.toString());

            responseDto = rt.getForObject(uri, ResponseDto.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseDto;
    }
}
