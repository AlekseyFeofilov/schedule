package ru.hits.hitsback.timetable.model.dto.schedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import ru.hits.hitsback.timetable.model.dto.lesson.LessonShortDto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class DayScheduleDto {
    @NotNull
    @JsonProperty private LocalDate date;
    @NotNull
    @JsonProperty private DayOfWeek dayOfWeek;
    @NotNull
    @JsonProperty private List<LessonShortDto> lessons;
}