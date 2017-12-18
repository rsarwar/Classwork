package highscores;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;

public class CSV {
	public static void main(String[] args)
	{
		List<Score> scores = readScoresFromCSV("scores.csv");
		
		for(Score b : scores)
		{
			System.out.println(b);
		}
	}
	
	private static List<Score> readScoresFromCSV(String fileName)
	{
		List<Score> scores = new ArrayList<>(); 
		Path pathToFile = Paths.get(fileName); 

		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) 
		{ 	String line = br.readLine(); 
		
			while (line != null)
			{ 
				String[] attributes = line.split(",");
				Score score = createScore(attributes);
				
				scores.add(score);
				
				line = br.readLine();
			}
		}
		catch (IOException ioe) 
		{
            ioe.printStackTrace();
        }
		
	    return scores;	
	}
	
	private static Score createScore(String[] metadata)
	{
		String name = metadata[0];
		int score = Integer.parseInt(metadata[1]); 

		return new Score(name, score);
	}
}
