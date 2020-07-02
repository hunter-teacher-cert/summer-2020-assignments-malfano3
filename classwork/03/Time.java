import java.io.*;
import java.util.*;


public class Time{
  private int hour;
  private int minute;
  private double second;


  public Time () {
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  } // end blank Time constructor

  public Time (int hour, int minute, double second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  } // end value Time constructor

  // below are the getters

  public int getHour() {
    return this.hour;
  } // end getHour

  public int getMinute() {
    return this.minute;
  } // end getMin

  public double getSecond() {
    return this.second;
  } // end getSecond

  // below are the setters

  public void setHour(int hour) {
    this.hour = hour;
  } // end setHour

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public void setSecond(double second) {
    this.second = second;
  }

  // PRINT Time
  public static void printTime(Time t) {
    System.out.printf("%02d:%02d:%04.1f\n",
        t.hour, t.minute, t.second);
    /*
    System.out.print(t.hour);
    System.out.print(":");
    System.out.print(t.minute);
    System.out.print(":");
    System.out.print(t.second);
    System.out.println();
    */
  }

  public String toString() {
    return String.format("%02d:%02d:%04.1f\n",
        this.hour, this.minute, this.second);
  }

  public boolean equals(Time that) {
    return this.hour == that.hour
        && this.minute == that.minute
        && this.second == that.second;
  }


  public Time add(Time t2) {
      Time sum = new Time();
      sum.hour = this.hour + t2.hour;
      sum.minute = this.minute + t2.minute;
      sum.second = this.second + t2.second;

      if (sum.second >= 60.0) {
          sum.second -= 60.0;
          sum.minute += 1;
      }
      if (sum.minute >= 60) {
          sum.minute -= 60;
          sum.hour += 1;
      }
      return sum;
  }


  public void increment(double seconds) {
    this.second += seconds;
    while (this.second >= 60.0) {
        this.second -= 60.0;
        this.minute += 1;
    }
    while (this.minute >= 60) {
        this.minute -= 60;
        this.hour += 1;
    }
  }

  public static void main(String[] args) {
    Time t = new Time(8, 14, 18);
    printTime(t);
  }

} // end Time class
