/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package twitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Instant;
import java.lang.Long;
import java.util.Collections;
import java.util.HashSet;

/**
 * Extract consists of methods that extract information from a list of tweets.
 * 
 * DO NOT change the method signatures and specifications of these methods, but
 * you should implement their method bodies, and you may add new public or
 * private methods or classes if you like.
 */
public class Extract {

    /**
     * Get the time period spanned by tweets.
     * 
     * @param tweets
     *            list of tweets with distinct ids, not modified by this method.
     * @return a minimum-length time interval that contains the timestamp of
     *         every tweet in the list.
     */
    public static Timespan getTimespan(List<Tweet> tweets) {
    	List<Long> epoch_second = new ArrayList<Long>(); 
    	for(Tweet tweet : tweets) {
        	epoch_second.add(tweet.getTimestamp().getEpochSecond());
        }
        
        Timespan result;
        result = new Timespan(Instant.ofEpochSecond(Collections.min(epoch_second)), Instant.ofEpochSecond(Collections.max(epoch_second)));
        return result;
    }

    /**
     * Get usernames mentioned in a list of tweets.
     * 
     * @param tweets
     *            list of tweets with distinct ids, not modified by this method.
     * @return the set of usernames who are mentioned in the text of the tweets.
     *         A username-mention is "@" followed by a Twitter username (as
     *         defined by Tweet.getAuthor()'s spec).
     *         The username-mention cannot be immediately preceded or followed by any
     *         character valid in a Twitter username.
     *         For this reason, an email address like bitdiddle@mit.edu does NOT 
     *         contain a mention of the username mit.
     *         Twitter usernames are case-insensitive, and the returned set may
     *         include a username at most once.
     */
    public static Set<String> getMentionedUsers(List<Tweet> tweets) {
        Set<String> username = new HashSet<String>();
        boolean flag = true;
        for(Tweet tweet : tweets) {
        	String text = tweet.getText();
        	char lastChar = text.charAt(text.length() - 1);
        	int atIndex = text.indexOf("@");
        	
        	while(atIndex != -1) {
	        	int spaceIndex = text.indexOf(" ", atIndex);
	        	String atname;
	        	if(spaceIndex == -1) {
	        		atname = text.substring(atIndex + 1).toLowerCase();
	        		for(int i = 0; i < atname.length(); i++) {
	        			flag = true;	
	        			if(!(Character.isDigit(atname.charAt(i)) || Character.isLowerCase(atname.charAt(i)))) {
	        				flag = false;
	        				break;
	        			}
	        		}
	        		if(flag == true)
	        			username.add(atname);
	        	}
	        	
	        	if(spaceIndex > atIndex) {
	        		atname = text.substring(atIndex + 1, spaceIndex).toLowerCase();
	        		for(int i = 0; i < atname.length(); i++) {
	        			flag = true;	
	        			if(!(Character.isDigit(atname.charAt(i)) || Character.isLowerCase(atname.charAt(i)))) {
	        				flag = false;
	        				break;
	        			}
	        		}
	        		if(flag == true)
	        			username.add(atname);
	        	}
	        	atIndex = text.indexOf("@", atIndex + 1);
        	}
        }
        return username;    
    }

}
