package twitterInfo;

/*
 * Created by Shane Harrington
 * 
 * May 21, 2017
 * 
 */

import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class TweetRetriever {

	public void retrieveUserTweets(Twitter twitter, String username, int numberOfTweets){
		
		//try to get specific user's timeline
		try {
            List<Status> statuses;
            String user = username;
            //user = twitter.verifyCredentials().getScreenName();
            statuses = twitter.getUserTimeline(user);
            
            if(statuses.size() >= numberOfTweets){
	            //display the latest tweets from the user
            	System.out.println("\nThis is the timeline for @" + user);
	            for(int i = 0; i < numberOfTweets; i++)//Status status : statuses (in case I need to change this back
	                System.out.println("\n@" + statuses.get(i).getUser().getScreenName() + ": " + statuses.get(i).getText());
            } else{
            	System.out.println("\nThere are not " + numberOfTweets + " tweets to display. Enter a smaller number");
            }

        //if something goes wrong, do this
		} catch(TwitterException te) {
            System.out.println("Something went wrong: " + te.getMessage());
            System.exit(-1);
        }
	}
}
