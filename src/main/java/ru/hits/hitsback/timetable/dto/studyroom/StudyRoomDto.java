package ru.hits.hitsback.timetable.dto.studyroom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudyRoomDto {
    private StudyRoomIdDto id;
    private Integer buildingNumber;
    private Integer floor;
    private String name;
    private Integer number;
}
