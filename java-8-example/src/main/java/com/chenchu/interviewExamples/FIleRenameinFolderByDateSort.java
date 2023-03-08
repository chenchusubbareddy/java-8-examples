package com.chenchu.interviewExamples;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

class FIleRenameinFolderByDateSort {

	public static void main(String[] args) {
		String fileName = "E:\\chenchuthestar\\videos\\devpos";
		// idmfileRenamewithDate(fileName);

		filerename(fileName);

	}

	private static void filerename(String fileName) {
		File folder = new File(fileName);
		File[] listOfFiles = folder.listFiles();
		List<Date> list = new ArrayList<>();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				String filename = listOfFiles[i].getName();
				System.out.println(filename + "    " + filename.split("\\.").length);
				if (filename.split("\\.").length == 3) {
					String tempname = "";
					System.out.println(Arrays.toString(filename.split("\\.")));
					for (int count = 1; count < filename.split("\\.").length; count++) {
						if (filename.split("\\.")[count].equalsIgnoreCase("mp4")) {
							tempname = tempname + "." + filename.split("\\.")[count];
						} else {
							tempname = tempname + filename.split("\\.")[count];
						}

					}
					filename = tempname;
				}

				String[] arr = filename.split("-");
				// System.out.println(listOfFiles[i].getName() + " " + Arrays.toString(arr));
				int year = Integer.parseInt(arr[2].substring(0, arr[2].indexOf("."))) - 1900;
				int month = Integer.parseInt(arr[1]) - 1;
				int date = Integer.parseInt(arr[0]);
				list.add(new Date(year, month, date));
			}
		}
		//
		/*
		 * list.stream().forEach(System.out::println);
		 * //System.out.println(list.size());
		 */ list = list.stream().sorted().collect(Collectors.toList());
		for ( int i = 0; i < list.size(); i++) {
			Date d = list.get(i);

			StringJoiner sj = new StringJoiner("-");
			if (String.valueOf(d.getDate()).length() == 1) {
				sj.add("0" + d.getDate());
			}else {
				sj.add(""+d.getDate());
			}
			if (String.valueOf((d.getMonth() + 1)).length() == 1) {
				sj.add("0" + (d.getMonth() + 1));
			}else {
				sj.add("" + (d.getMonth() + 1));
			}
			
			sj.add(String.valueOf(d.getYear() + 1900));

			String date = sj.toString();// d.getDate() + "-0" + (d.getMonth() + 1) + "-" + (d.getYear() + 1900);
			String rename = fileName + "\\" + (i + 1) + "." + date + ".mp4";
			String oname = fileName + "//" + date + ".mp4";
			boolean renameTo = new File(oname).renameTo(new File(rename));
			if (renameTo == false) {
				System.out.println(rename + " failed");
			}
			// System.out.println(new File(rename).renameTo(new File(rename)));
		}
	}

	public static void idmfileRenamewithDate(String fileName) {
		File folder = new File(fileName);
		File[] listOfFiles = folder.listFiles();
		List<Date> list = new ArrayList<>();
		List<String> months = Arrays.asList("january", "february", "march", "april", "may", "june", "july", "august",
				"september", "october", "november", "december");
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				try {
					StringJoiner sj = new StringJoiner("-");
					String fname = listOfFiles[i].getName();
					// date extract
					String dateNum = fname.substring(fname.indexOf("on") + 2, fname.indexOf("on") + 5);
					dateNum = dateNum.replaceAll("[^0-9]", "");
					dateNum.replaceAll(fname, dateNum);
					if (dateNum.length() == 1) {
						dateNum = "0" + dateNum;
					}
					sj.add(dateNum);
					// month extract

					String month = months.stream().filter(mon -> fname.toLowerCase().contains(mon))
							.collect(Collectors.toList()).get(0);
					String monthNum = String.valueOf(months.indexOf(month) + 1);
					if (monthNum.length() == 1) {
						monthNum = "0" + monthNum;
					}

					sj.add(monthNum);

					// year
					sj.add("2022.mp4");

					System.out.println("filename" + fname + "  ----- " + sj.toString());
					System.out.println(
							new File(fileName + "//" + fname).renameTo(new File(fileName + "//" + sj.toString())));

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}

}