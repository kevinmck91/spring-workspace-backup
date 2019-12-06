package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {
	
	@Autowired
	private static TopicRepository topicRepository;
	
	/*@Autowired
	public void setTopicRepopsitory(TopicRepository topicRepository) {
		TopicService.topicRepository = topicRepository;
	}*/

	//Creates a muatable list of topics
	private static List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1", "Maths", "Easy"), 
			new Topic("2", "IT", "Medium"), 
			new Topic("3", "English", "Difficult"),
			new Topic("4", "French", "Medium"), 
			new Topic("5", "History", "Easy")
	));

	// Returns the list of all the topics
	public static List<Topic> getAllTopics() {
		List<Topic> topics2 = new ArrayList<>();
		topicRepository.findAll().forEach(topics2::add);
		return topics2;
	}
	
	// Returns an individual topic based on the ID
	public static Topic getTopic(String id)	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public static void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public static void updateTopic(String id, Topic topic) {
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		
	}

	public static void deleteTopic(String id) {
		System.out.println("deleting topic");
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.remove(i);
			}
		}

		
	}
}
