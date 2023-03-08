package ru.hits.hitsback.timetable.service.schedule;

import ru.hits.hitsback.timetable.model.dto.group.GroupIdDto;
import ru.hits.hitsback.timetable.model.dto.schedule.DayScheduleDto;
import ru.hits.hitsback.timetable.model.dto.schedule.LessonOptionsDto;
import ru.hits.hitsback.timetable.model.dto.schedule.LessonTimeDto;
import ru.hits.hitsback.timetable.model.dto.schedule.TimeIntervalDto;
import ru.hits.hitsback.timetable.model.dto.teacher.TeacherIdDto;

import java.util.List;

public interface ScheduleService {
    List<DayScheduleDto> fetchSchedule(TimeIntervalDto timeIntervalDto);

    List<DayScheduleDto> fetchGroupSchedule(TimeIntervalDto timeIntervalDto, GroupIdDto groupIdDto);

    List<DayScheduleDto> fetchTeacherSchedule(TimeIntervalDto timeIntervalDto, TeacherIdDto teacherIdDto);

    List<DayScheduleDto> fetchScheduleWithLessonOptions(TimeIntervalDto timeIntervalDto, LessonOptionsDto lessonOptionsDto);

    List<LessonTimeDto> fetchLessonTimes();
}