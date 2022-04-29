package site.metacoding.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    private String tm; // 예보시각
    private String thema; // 테마
    private String courseId; // 코스ID
    private String courseAreaId; // 코스 지역 아이디
    private String courseAreaName; // 코스 지역 이름
    private String courseName; // 코스 이름
    private Integer spotAreaId; // 관광지 지역 아이디
    private String spotAreaName; // 관광지 지역 이름
    private String spotName; // 관광지 명
    private Integer th3; // 일 3시간 기온
    private Integer wd; // 풍향
    private Integer ws; // 풍속
    private Integer sky; // 하늘상태 1맑음 2구름 3흐림 4비 5소나기 6비눈 7눈비 8눈
    private Integer rhm; // 습도
    private Integer pop; // 강수확률
    private Integer rn; // 강수량
}
