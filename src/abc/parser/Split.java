package abc.parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Split{
	/**
	 * 
	 */
	public static List<String> SplitHeader(File file) throws IOException{
		Path path = file.toPath();
		List<String> lines = Files.readAllLines(path);
		String header = "";
		String body = "";
		boolean isHead = true;
		
		for(String line : lines) {
			if(line.contains("K:")) {
				isHead = false;
				header += line;
			}
			else if(isHead) {
				header += line + "\n";
			}else {
				body += line + "\n";
			}
		}
		
		return Arrays.asList(header, body);
	}
}