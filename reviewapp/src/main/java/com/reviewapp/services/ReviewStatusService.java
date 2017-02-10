package com.reviewapp.services;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.reviewapp.models.ReviewStatus;


public class ReviewStatusService {
	
	public List<ReviewStatus> getReviewStatus(){
		JSONArray movies = null;
		List<ReviewStatus> status = new ArrayList<>();
		try {
			JSONParser parser = new JSONParser();			
			
			String path = "C:/codebase/eclipse_codes/reviewapp/mine_twitter_target_display.json";		
			movies = (JSONArray) parser.parse(new FileReader(path));

			for(Object obj: movies){			

				JSONObject movie = (JSONObject) obj;
				String review = (String) movie.get("review");
		        String isPositive = (String) movie.get("isPositive");
		        
				ReviewStatus rs = new ReviewStatus(review, isPositive);
				System.out.println(rs);
				status.add(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
