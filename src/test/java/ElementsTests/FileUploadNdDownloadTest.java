package ElementsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.UploadNdDownloadLocators;
import elementsLocators.homePageLocators;

public class FileUploadNdDownloadTest extends Base {

	@Test
	public void FileDownloadtest() {

		String FilePath = "/Users/mone/Downloads/sampleFile.jpeg";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		UploadNdDownloadLocators udl = PageFactory.initElements(Driver(), UploadNdDownloadLocators.class);

		ba.NavToReqModule(hpl.HomePageElement(), hpl.uploadNdDownload());
		ba.click(udl.DownloadLink());
		ba.UploadDoc(udl.UploadBtn(), FilePath);

	}

}
