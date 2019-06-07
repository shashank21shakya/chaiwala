package com.harsh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String startPattern = "MMM yyyy";

		String endPattern = "MM-dd-yyyy";

		String str = formateDate("mar 2019", startPattern, endPattern);
		System.out.println(str);

	}

	public static String formateDate(String date, String initDateFormat, String endDateFormat) throws ParseException {

//		Date initDate = new SimpleDateFormat(initDateFormat).parse(date);
//		SimpleDateFormat formatter = new SimpleDateFormat(endDateFormat);
//		String parsedDate = formatter.format(initDate);
		
		return new SimpleDateFormat(endDateFormat).format( new SimpleDateFormat(initDateFormat).parse(date));
//		return parsedDate;

	}
}
