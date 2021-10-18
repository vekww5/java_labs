package com.mycompany.lab2.package_dep;

import org.apache.commons.io.FileUtils;

public class DepExemp{

	public static void main(String[] args) {
		String userDirectoryPath = FileUtils.getUserDirectoryPath();
		System.out.println(userDirectoryPath);
	}
} 