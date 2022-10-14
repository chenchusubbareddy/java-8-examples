package com.chenchu.interviewExamples;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

class FIleRenameinFolderByDateSort {

	public static void main(String[] args) {
		File folder = new File("E:\\Core Java viedos");
		File[] listOfFiles = folder.listFiles();
		List<Date> list = new ArrayList<>();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				String[] arr = listOfFiles[i].getName().split("-");
				System.out.println( listOfFiles[i].getName());
				list.add(new Date(Integer.parseInt(arr[2].substring(0, arr[2].indexOf("."))) - 1900,
						Integer.parseInt(arr[1]) - 1, Integer.parseInt(arr[0])));
			}
		}
		// list.stream().forEach(System.out::println);
		System.out.println(list.size());
		list = list.stream().sorted().collect(Collectors.toList());
		for (int i = 0; i < list.size(); i++) {
			Date d = list.get(i);
			String date = d.getDate() + "-0" + (d.getMonth() + 1) + "-" + (d.getYear() + 1900);
			String rename = "E:\\Core Java viedos\\" + (i + 1) + "." + date + ".mp4";
			System.out.println(date + "  " + d + "    " + rename);
			System.out.println(new File("E:\\Core Java viedos\\" + date+".mp4").renameTo(new File(rename)));
		}
	}

}