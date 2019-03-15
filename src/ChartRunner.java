import java.util.Random;

public class ChartRunner {
	
	public static void main(String[] args) {
		
		//server runs on port 8000 and debug messages are turned on
		JavaD3.initialize(8000, true);
		
		
		/*
		 * You can find your charts at:
		 * 
		 * http://localhost:8000/<chartID>
		 * 
		 * 
		 */
		
		
		//try different chart types
		Histogramm c = new Histogramm();
		//BarChart c = new BarChart();
		//TimeSerie c = new TimeSerie();
		
		System.out.println("Chart ID: " + Integer.toString(c.id));
		
		//set chart parameters
		c.setTitle("Mein Test Titel");
		c.setHeight(500);
		c.setWidth(500);
		
		//generate random data
		Random r = new Random();
		for (int i=0; i < 20; i++) {
			
			//add data for histogram
			c.addData((double) r.nextInt() % 200);
			
			//add data for barchart or timeserie
			//c.addData(Integer.toString(i), (double) r.nextInt() % 100);
		}

		
		//get html from chart
		//System.out.println(c.getHtml());
		
		
		
	}

}