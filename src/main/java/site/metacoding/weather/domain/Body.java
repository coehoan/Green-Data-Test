package site.metacoding.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Body {

    private String dataType;
    private Items items;
    private Integer pageNo;
    private Integer numOfRows;
    private Integer totalCount;
}