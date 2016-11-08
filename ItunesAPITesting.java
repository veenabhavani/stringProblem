import org.testng.annotations.Test;
import org.testng.Assert;

public class ItunesAPITesting {
  @Test
  public void itunesTerm() throws Exception {
	  ItunesAPILogic apiLogic = new ItunesAPILogic();
	  ItuneAPIDetails apiDetails = new ItuneAPIDetails();
	   
	 apiDetails.setKey("term");
     apiDetails.setVal("Justin");
       
      int itemCount = apiLogic.itunesAPICall(apiDetails);
      Assert.assertTrue(itemCount > 0);
      System.out.println("Item count " + itemCount );
      
  }
  @Test
  public void itunesCountry() throws Exception {
	  ItunesAPILogic apiLogic = new ItunesAPILogic();
	  ItuneAPIDetails apiDetails = new ItuneAPIDetails();
	   
	 apiDetails.setKey("country");
     apiDetails.setVal("IN");
       
      int itemCount = apiLogic.itunesAPICall(apiDetails);
      Assert.assertTrue(itemCount > 0);
      System.out.println("Item count " + itemCount );
      
    
  }
  @Test
  public void itunesMedia() throws Exception {
	  ItunesAPILogic apiLogic = new ItunesAPILogic();
	  ItuneAPIDetails apiDetails = new ItuneAPIDetails();
	   
	 apiDetails.setKey("media");
     apiDetails.setVal("movie");
       
      int itemCount = apiLogic.itunesAPICall(apiDetails);
      Assert.assertTrue(itemCount > 0);
      System.out.println("Item count " + itemCount );
      
      
  }
}
