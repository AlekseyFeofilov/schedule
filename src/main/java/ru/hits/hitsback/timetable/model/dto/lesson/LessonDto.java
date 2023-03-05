package ru.hits.hitsback.timetable.model.dto.lesson;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import ru.hits.hitsback.timetable.model.dto.group.GroupDto;
import ru.hits.hitsback.timetable.model.dto.schedule.LessonTimeDto;
import ru.hits.hitsback.timetable.model.dto.studyroom.StudyRoomDto;
import ru.hits.hitsback.timetable.model.dto.subject.SubjectDto;
import ru.hits.hitsback.timetable.model.dto.teacher.TeacherDto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class LessonDto {
    @NotNull
    @JsonProperty("id") private LessonIdDto lessonIdDto;
    @NotNull
    @JsonProperty private Set<GroupDto> groups;
    @NotNull
    @JsonProperty private StudyRoomDto studyRoom;
    @NotNull
    @JsonProperty private LessonTypeDto lessonType;
    @NotNull
    @JsonProperty private TeacherDto teacher;
    @NotNull
    @JsonProperty private SubjectDto subject;
    @NotNull
    @JsonProperty private LocalDate date;
    @NotNull
    @JsonProperty private LocalDate startDate;
    @NotNull
    @JsonProperty private LocalDate endDate;
    @NotNull
    @JsonProperty private Integer frequency;
    @NotNull
    @JsonProperty private DayOfWeek dayOfWeek;
    @NotNull
    @JsonProperty private LessonTimeDto lessonTime;
}
