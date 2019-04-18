package gov.nih.nci.nbia.restAPI;

import java.io.File;

import gov.nih.nci.nbia.util.SpringApplicationContext;
import gov.nih.nci.nbia.dbadapter.NonCTPDatabaseDelegator;
import java.io.File;
public class FileSubmitter {
	
public static String submit(String file, String project, String siteName, 
		String siteID, String batch) {
	File dfile=new File(file);
	NonCTPDatabaseDelegator delegator = (NonCTPDatabaseDelegator)SpringApplicationContext.getBean("nciaDelegator");
	delegator.setCorrectFileSize(dfile);
	delegator.process(dfile, null, project, siteName, siteID, null, batch);
	return "OK";
}
}