package org.example.service;

import org.example.model.Log;
import org.example.repository.LogRepository;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LogService {
    public void LogList(){
        for(int i = 0; i< LogRepository.logs.size(); i++){
            System.out.println(LogRepository.logs.get(i));
        }
    }

    public Log LogTheDay(){
        Calendar calendar = new GregorianCalendar();
        for(int i=0; i<LogRepository.logs.size(); i++){
            if(LogRepository.logs.get(i).getCalendar().equals(calendar)){
                return LogRepository.logs.get(i);
            }
        }
        return null;
    }

    public void LogTheWeek(){
        Calendar calendar = new GregorianCalendar();
        Date week = new Date();

        long weekTime = week.getTime();
        weekTime -= 604800000;
        week.setTime(weekTime);
        calendar.setTime(week);

        for(int j=0;j<LogRepository.logs.size();j++){
            if(calendar.before(LogRepository.logs.get(j).getCalendar())){
                System.out.println(LogRepository.logs.get(j));
            }
        }
    }

    public void LogTheMonth(){
        Calendar calendar = new GregorianCalendar();
        Date theMonth = new Date();

        long monthTime = theMonth.getTime();
        monthTime -= 1296000000L *2;
        theMonth.setTime(monthTime);
        calendar.setTime(theMonth);

        for(int i=0;i<LogRepository.logs.size();i++){
            if(calendar.before(LogRepository.logs.get(i).getCalendar())){
                System.out.println(LogRepository.logs.get(i));
            }
        }
    }

    public void LogTheYear(){
        Calendar calendar = new GregorianCalendar();
        Date theYear = new Date();

        long yearTime = theYear.getTime();
        yearTime -= 315360000L *100;
        theYear.setTime(yearTime);
        calendar.setTime(theYear);

        for (int i=0;i<LogRepository.logs.size();i++){
            if(calendar.before(LogRepository.logs.get(i).getCalendar())){
                System.out.println(LogRepository.logs.get(i));
            }
        }
    }
}
