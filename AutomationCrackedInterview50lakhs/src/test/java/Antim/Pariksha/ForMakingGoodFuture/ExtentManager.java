package Antim.Pariksha.ForMakingGoodFuture;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	 
	 public static ExtentReports getInstance()
	 {
		 htmlReport = new ExtentHtmlReporter(System.getProperty("user.dir")+"//report//report.html");
		 htmlReport.config().setDocumentTitle("Automation Reports");
		 htmlReport.config().setReportName("Functional Report");
		 htmlReport.config().setTheme(Theme.STANDARD);
		 
		 report = new ExtentReports();
		 report.attachReporter(htmlReport);
		 report.setSystemInfo("OS", "Windows10");
		 report.setSystemInfo("Browser", "Chrome");
		 report.setSystemInfo("TesterName", "Singhel");
		  
		return report;
		 
	 }
}
