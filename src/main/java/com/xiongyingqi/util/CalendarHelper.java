package com.xiongyingqi.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalendarHelper {
	// private static Calendar anotherCalendar = Calendar.getInstance();
	// private static Calendar calendar = Calendar.getInstance();

	public static final long SECOND = 1000;
	public static final long MINUTE = 60 * SECOND;
	public static final long HOUR = 60 * MINUTE;
	public static final long DAY = 24 * HOUR;
	public static final long MONTH = 30 * DAY;
	public static final long YEAR = 12 * MONTH;
	public static final DateCaculator YEARS_BEFORE = new DateCaculator(1 * YEAR, 2000 * YEAR,
			"{0}年前");
	public static final DateCaculator MONTHS_BEFORE = new DateCaculator(1 * MONTH, 12 * MONTH,
			"{0}个月前");
	public static final DateCaculator DAYS_BEFORE = new DateCaculator(3 * DAY, 30 * DAY, "{0}天前");
	public static final DateCaculator THE_DAY_BEFORE_YESTERDAY = new DateCaculator(2 * DAY,
			3 * DAY, "前天");
	public static final DateCaculator YESTERDAY = new DateCaculator(1 * DAY, 2 * DAY, "昨天");
	public static final DateCaculator HOURS_BEFORE = new DateCaculator(1 * HOUR, 24 * HOUR,
			"{0}小时前");
	public static final DateCaculator HALF_HOUR_BEFORE = new DateCaculator(30 * MINUTE,
			60 * MINUTE, "半小时左右");
	public static final DateCaculator JUST_NOW = new DateCaculator(0, 30 * MINUTE, "刚刚");

	// static{
	// final DateCaculator YEARS_BEFORE = new DateCaculator(1 * YEAR, 2000 *
	// YEAR, "刚刚");
	// final DateCaculator MONTHS_BEFORE = new DateCaculator(1 * MONTH, 12 *
	// MONTH, "约{0}个月");
	// final DateCaculator DAYS_BEFORE = new DateCaculator(1 * DAY, 30 * DAY,
	// "{0}天前");
	// final DateCaculator HOURS_BEFORE = new DateCaculator(45 * MINUTE, 24 *
	// HOUR, "{0}小时前");
	// final DateCaculator HALF_HOUR_BEFORE = new DateCaculator(30 * MINUTE, 45
	// * MINUTE, "半小时左右");
	// final DateCaculator JUST_NOW = new DateCaculator(0, 30 * MINUTE, "刚刚");
	// }

	/**
	 * 返回指定日期距离现在的毫秒数
	 * 
	 * @param thenDate
	 * @return
	 */
	public static long compareDate(Date date) {
		return compareDate(new Date(), date);
	}

	/**
	 * 返回两个日期的毫秒之差
	 * 
	 * @param nearDate
	 * @param farDate
	 * @return
	 */
	public static long compareDate(Date nearDate, Date farDate) {
		long nearMilli = nearDate.getTime();
		long farMilli = farDate.getTime();
		long result = nearMilli - farMilli;
		if (result < 0) {
			result = -result;
		}
		return result;
	}

	/**
	 * 计算指定日期到现在的时间计算
	 * 
	 * @param date
	 * @return
	 */
	public static String caculatorDateToString(Date date) {
		long milliSecond = compareDate(date);
		List dateCaculators = DateCaculator.getDateCaculators();
		for (Iterator iterator = dateCaculators.iterator(); iterator.hasNext();) {
			DateCaculator dateCaculator = (DateCaculator) iterator.next();
			if (milliSecond >= dateCaculator.getMinMilliSecond()
					&& milliSecond <= dateCaculator.getMaxMilliSecond()) {
				String displayStr = dateCaculator.getDisplayStr();
				long numberOfUnit = 0;
				if (dateCaculator.getMinMilliSecond() == 0) { // 分母为零，则直接为0
					numberOfUnit = 0;
				} else {
					numberOfUnit = milliSecond / dateCaculator.getMinMilliSecond();
				}

				// 替代所有{0}
				Pattern p = Pattern.compile("(\\{.+?\\})");
				Matcher m = p.matcher(displayStr);
				displayStr = m.replaceAll(numberOfUnit + "");

				// displayStr = displayStr.replace("\\{0\\}", numberOfUnit +
				// "");
				return displayStr;
			}
		}
		return milliSecond + "";
	}

	/**
	 * 
	 * @param beforeDate
	 * @param afterDate
	 * @return
	 */
	public static boolean compareTwoDate(Date beforeDate, Date afterDate) {
		if (beforeDate == null && afterDate == null) {
			return false;
		}
		Calendar beforeCalendar = Calendar.getInstance();
		beforeCalendar.setTime(beforeDate);
		Calendar afterCalendar = Calendar.getInstance();
		afterCalendar.setTime(afterDate);
		return (afterCalendar.compareTo(beforeCalendar) > 0);
	}

	static class DateCaculator {
		private long minMilliSecond;
		private long maxMilliSecond;
		private String displayStr;
		private static List dateCaculators;

		public DateCaculator(long minMilliSecond, long maxMilliSecond, String displayStr) {
			this.minMilliSecond = minMilliSecond;
			this.maxMilliSecond = maxMilliSecond;
			this.displayStr = displayStr;
			if (dateCaculators == null) {
				dateCaculators = new ArrayList();
			}
			dateCaculators.add(this);
		}

		/**
		 * @return the dateCaculators
		 */
		public static List getDateCaculators() {
			return dateCaculators;
		}

		/**
		 * @return the minMilliSecond
		 */
		public long getMinMilliSecond() {
			return minMilliSecond;
		}

		/**
		 * @param minMilliSecond
		 *            the minMilliSecond to set
		 */
		public void setMinMilliSecond(long minMilliSecond) {
			this.minMilliSecond = minMilliSecond;
		}

		/**
		 * @return the maxMilliSecond
		 */
		public long getMaxMilliSecond() {
			return maxMilliSecond;
		}

		/**
		 * @param maxMilliSecond
		 *            the maxMilliSecond to set
		 */
		public void setMaxMilliSecond(long maxMilliSecond) {
			this.maxMilliSecond = maxMilliSecond;
		}

		/**
		 * @return the displayStr
		 */
		public String getDisplayStr() {
			return displayStr;
		}

	}

	public static void main(String[] args) {
		Date date = DateHelper.strToDateLong("2013-04-03 10:44:12");
		String rs = caculatorDateToString(date);
		System.out.println(rs);

		Date date2 = DateHelper.strToDateLong("2013-06-02 15:33:12");
		String rs2 = caculatorDateToString(date2);
		System.out.println(rs2);

		Date date5 = DateHelper.strToDateLong("2013-06-03 15:33:12");
		String rs5 = caculatorDateToString(date5);
		System.out.println(rs5);

		Date date3 = DateHelper.strToDateLong("2012-04-03 10:44:12");
		String rs3 = caculatorDateToString(date3);
		System.out.println(rs3);
	}

}
