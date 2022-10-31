package lab_10.prob_1.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.logging.Logger;

import lab_10.prob_1.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lab_10.prob_1.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		StringBuilder builder = new StringBuilder();

		Map<String, StringBuilder> names = new HashMap<String, StringBuilder>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				String name = annotation.assignedTo();

				boolean isNewDev =names.containsKey(name);

				builder.append("\n   reportedBy: "+annotation.reportedBy());
				builder.append("\n   className: "+cl.getName());
				builder.append("\n   description: "+annotation.description());
				builder.append("\n   severity: "+annotation.severity());
				builder.append("\n");

				if(isNewDev)
					names.get(name).append("\n" + builder);
				else
					names.put(name, builder);
			}
			builder = new StringBuilder();
		}

		names.forEach((key, value) -> System.out.println(key + " " + value ));

		//Write in a file
		String path = "./src/"+PACKAGE_TO_SCAN.replace(".", "/") +"/";
		try {
			PrintWriter myWriter = new PrintWriter(new FileWriter(path + REPORT_NAME));
			myWriter.write(names.toString());

			myWriter.close();
			System.out.println("Successfully wrote to the file.");

		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


}
