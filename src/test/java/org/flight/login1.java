package org.flight;

import org.openqa.selenium.interactions.Actions;

public class login1 extends Baseclass {
	
	public static void main(String[] args) throws InterruptedException {
		browserlaunch();
		maximizeBrowser();
		launchUrl("https://flyone.eu/en/");
		applyWaitToElements();
        Login l= new Login();       
        clickElement(l.getElementfrom());
        clear(l.getElementfrom());
        clickElement(l.getCountry1());    
        enterText(l.getElementfrom(),"Larnaca (LCA)");
 clickElement(l.getElementto());
//      Thread.sleep(5000);
//        singleDropDownText1(l.getCountry1(), "Larnaca (LCA)");
        //clickText(l.getElementfrom(), "Belgium");
       
//        Thread.sleep(3000);
////        Actions a= new Actions(driver);
////        a.moveToElement(l.setCountry()).build().perform();
//        clickText(l.setCountry(), "Belgium");
//       // clickText(l.getElementfrom(), "Brussels (BRU)");
//       
//        clickElement(l.getElementto());
//        clear(l.getElementto());
//        clickText(l.getElementto(), "France");
//        Thread.sleep(3000);
//        clickText(l.getElementto(), "Paris Charles de Gaulle (CDG)");
//     //   singleDropDownText1(l.getElementfrom(),"Cyprus");
////        singleDropDownText1(l.getElementfrom()," London Stansted (STN)" );
//        
      
        
	}

}
