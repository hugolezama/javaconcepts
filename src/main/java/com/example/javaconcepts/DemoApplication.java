package com.example.javaconcepts;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);

  }

  public int solution(String S) {
    String[] daysInOrder = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    Map<String, Set<String>> schedule = new LinkedHashMap<>();

    Arrays.stream(daysInOrder).forEach(day -> schedule.put(day, new TreeSet<String>()));

    Arrays.stream(S.split("\\R")).forEach(meeting -> {
      String[] meetSplit = meeting.split("\\s+");
      Set<String> meetingsInDay = schedule.get(meetSplit[0]);
      meetingsInDay.add(meetSplit[1]);
      schedule.put(meetSplit[0], meetingsInDay);
    });

    final long[] maxSlot = {0};
    final String prevDay[] = {""};
    final LocalTime[] prevMeetingEndTime = {LocalTime.of(0, 0, 0)};
    schedule.forEach((key, value) -> {
          value.stream().map(s1 -> s1.split("-")).forEach(meetingSlot -> {
            String[] meetingStart = meetingSlot[0].split(":");
            String[] meetingEnd = meetingSlot[1].split(":");
            LocalTime meetingStartTime = LocalTime.of(Integer.parseInt(meetingStart[0]) == 24 ? 0 : Integer.parseInt(meetingStart[0]),
                Integer.parseInt(meetingStart[1]), 0);
            System.out.println("meetingStartTime -> " + meetingStartTime);
            long slot = ChronoUnit.MINUTES.between(prevMeetingEndTime[0], meetingStartTime) % 60;
            System.out.println("slot between " + prevMeetingEndTime[0] + " and " + meetingStartTime + " -> " + slot);
            if (slot > maxSlot[0]) {
              maxSlot[0] = slot;
            }
            prevMeetingEndTime[0] = LocalTime.of(Integer.parseInt(meetingEnd[0]) == 24 ? 0 : Integer.parseInt(meetingEnd[0]),
                Integer.parseInt(meetingEnd[1]), 0);
            System.out.println("meetingEndTime -> " + prevMeetingEndTime[0]);

          });

        }
    );
    return (int) maxSlot[0];
  }


}
