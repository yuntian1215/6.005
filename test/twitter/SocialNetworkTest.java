/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package twitter;

import static org.junit.Assert.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;



public class SocialNetworkTest {

    /*
     * TODO: your testing strategies for these methods should go here.
     * See the ic03-testing exercise for examples of what a testing strategy comment looks like.
     * Make sure you have partitions.
     */
	
	private static final Instant d1 = Instant.parse("2016-02-17T10:00:00Z");
    private static final Instant d2 = Instant.parse("2016-02-17T11:00:00Z");
    private static final Instant d3 = Instant.parse("2016-02-17T12:00:00Z");
    
    private static final Tweet tweet1 = new Tweet(1, "alyssa", "is it reasonable to talk about rivest so much?", d1);
    private static final Tweet tweet2 = new Tweet(2, "bbitdiddle", "rivest talk in 30 minutes #hype", d2);
    private static final Tweet tweet3 = new Tweet(3, "bbitdiddle", "rivest talk in 30 minutes #hype", d3);
    private static final Tweet tweet4 = new Tweet(4, "bbitdiddle", "rivest talk in 30 minutes @alyssa #hype", d3);
    private static final Tweet tweet5 = new Tweet(5, "xiaoli", "rivest talk @xiaoMing in 30 minutes @XIAOMING #hype", d2);
    private static final Tweet tweet6 = new Tweet(6, "xiaowang", "rivest talk in zhangzhipengcs@outlook.com @xiaoli 30 minutes #hype", d2);
    private static final Tweet tweet7 = new Tweet(7, "zhangzhipeng", "rivest talk in zhangzhipengcs@outlook.com @xiaoMing 30 minutes #hype", d2);
    private static final Tweet tweet8 = new Tweet(8, "xiaoMing", "rivest talk in 30 minutes @zhangzhipeng #hype", d2);
    private static final Tweet tweet9 = new Tweet(9, "bbitdiddle", "@ZHANGZHIPENG rivest talk @zhangzhipeng in 30 minutes #hype ", d2);
    
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void testGuessFollowsGraphEmpty() {
        Map<String, Set<String>> followsGraph = SocialNetwork.guessFollowsGraph(new ArrayList<>());
        
        assertTrue("expected empty graph", followsGraph.isEmpty());
    }
    
    @Test
    public void testGuessFollowsGraphOneMentioned() {
        Map<String, Set<String>> followsGraph = SocialNetwork.guessFollowsGraph(new ArrayList<Tweet>(Collections.singleton(tweet4)));

        assertTrue("expected bbitdiddle's graph", followsGraph.containsKey("bbitdiddle"));
        assertTrue("expected bbitdiddle's graph", followsGraph.get("bbitdiddle").contains("alyssa"));
    }
    
    @Test
    public void testGuessFollowsGraphManyToManyMentionedCaseDivergence() {
        Map<String, Set<String>> followsGraph = SocialNetwork.guessFollowsGraph(new ArrayList<Tweet>(Arrays.asList(tweet5, tweet7, tweet8)));
        
//        for (String key : followsGraph.keySet()) {
//            System.out.println(key + ": " + followsGraph.get(key));
//        }
        
        assertTrue("expected xiaoli's graph", followsGraph.containsKey("xiaoli"));
        assertTrue("expected xiaoli's graph", followsGraph.get("xiaoli").contains("xiaoming"));
        assertTrue("expected xiaoming's graph", followsGraph.containsKey("xiaoming"));
        assertTrue("expected xiaoming's graph", followsGraph.get("xiaoming").contains("zhangzhipeng"));
        assertTrue("expected zhangzhipeng's graph", followsGraph.containsKey("zhangzhipeng"));
        assertTrue("expected zhangzhipeng's graph", followsGraph.get("zhangzhipeng").contains("xiaoming"));
    }

    
    
    @Test
    public void testInfluencersEmpty() {
        Map<String, Set<String>> followsGraph = new HashMap<>();
        List<String> influencers = SocialNetwork.influencers(followsGraph);
        
        assertTrue("expected empty list", influencers.isEmpty());
    }
    
    @Test
    public void testInfluencersTwoElementGraphManyFollowing() {
        Map<String, Set<String>> followsGraph = SocialNetwork.guessFollowsGraph(List.of(tweet8, tweet9));
        List<String> influencers = SocialNetwork.influencers(followsGraph);

        assertTrue("expected pengzhangzhi", influencers.contains("zhangzhipeng"));
    }
    
    @Test
    public void testInfluencersTwoElementGraphManyFollowingMutualFollowing() {
        Map<String, Set<String>> followsGraph = SocialNetwork.guessFollowsGraph(List.of(tweet8, tweet7));
        List<String> influencers = SocialNetwork.influencers(followsGraph);

        assertTrue("expected zhangzhipeng", influencers.contains("zhangzhipeng"));
        assertTrue("expected xiaoming", influencers.contains("xiaoming"));
    }
    
    @Test
    public void testInfluencersTwoElementGraphManyFollowingMutualFollowingMultipleFollower() {
        Map<String, Set<String>> followsGraph = SocialNetwork.guessFollowsGraph(List.of(tweet8, tweet5,tweet7));
        List<String> influencers = SocialNetwork.influencers(followsGraph);
        assertEquals(0, influencers.indexOf("xiaoming"));
        System.out.println(influencers.get(1));
        assertEquals(1, influencers.indexOf("zhangzhipeng"));
    }
    
    @Test
    public void testInfluencersTwoElementGraph() {
        Map<String, Set<String>> followsGraph = SocialNetwork.guessFollowsGraph(List.of(tweet1, tweet2));
        List<String> influencers = SocialNetwork.influencers(followsGraph);

        assertTrue("expected zhangzhipeng", influencers.contains("alyssa"));
        assertTrue("expected zhangzhipeng", influencers.contains("bbitdiddle"));
    }
    
    @Test
    public void testInfluencersOneElementGraph() {
        Map<String, Set<String>> followsGraph = SocialNetwork.guessFollowsGraph(Collections.singletonList(tweet1));
        for (String key : followsGraph.keySet()) {
            System.out.println(key + ": " + followsGraph.get(key));
        }
        
        List<String> influencers = SocialNetwork.influencers(followsGraph);

        assertTrue("expected zhangzhipeng", influencers.contains("alyssa"));
    }

    /*
     * Warning: all the tests you write here must be runnable against any
     * SocialNetwork class that follows the spec. It will be run against several
     * staff implementations of SocialNetwork, which will be done by overwriting
     * (temporarily) your version of SocialNetwork with the staff's version.
     * DO NOT strengthen the spec of SocialNetwork or its methods.
     * 
     * In particular, your test cases must not call helper methods of your own
     * that you have put in SocialNetwork, because that means you're testing a
     * stronger spec than SocialNetwork says. If you need such helper methods,
     * define them in a different class. If you only need them in this test
     * class, then keep them in this test class.
     */

}
