package twitterInfo;

/*
 * Created by Shane Harrington
 * 
 * Recent Tweet Fetcher
 * 
 * May 21, 2017
 * 
 * Description: This program is a command line tool for twitter. 
 * It accepts a twitter username and a number as arguments and
 * then displays the number specified of the most recent tweets
 * for the public account passed as an argument.
 * 
 */

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Main {

	public static void main(String[] args) {
		
		//configure twitter4j
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("jdG3kRXD2DOtAZCjWDitgNzAS")
		  .setOAuthConsumerSecret("icPBlct4eiouhzDmzg6aIr0t1Wcl8kt6De8QwhNdb1GtmpuE0I")
		  .setOAuthAccessToken("866700893705707520-KBscTZHyteCzqSUARXyjxCo4hRATdWT")
		  .setOAuthAccessTokenSecret("3EaDOsIr0awLAVWlu9o8sGAJjZPY1Fa216YHOUsGJVxk9");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		//check arguments (should be string and integer)
		String firstArgument;//username
		int secondArgument;//number of tweets to display
		
		if(args.length == 2){
			try{
				firstArgument = args[0];
				secondArgument = Integer.parseInt(args[1]);//convert argument to an int
				TweetRetriever tr = new TweetRetriever();
				tr.retrieveUserTweets(twitter, firstArgument, secondArgument);
			} catch(NumberFormatException e){
				System.err.println("Arguments are incorrect. Enter a username and then an integer");
				System.exit(1);
			} 
		} else{
			System.out.println("\nIncorrect number of arguments. Should include a username and an integer");
		}
	}

}
