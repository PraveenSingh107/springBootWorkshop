package com.example.workshop.com.example.workshop.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "topic 1", "topic 1 desc"),
                new Topic("2", "topic 2", "topic 2 desc"),
                new Topic("3", "topic 3", "topic 3 desc")
                ));

    public TopicService() {
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void addTopic(Topic topic)  {
        topics.add(topic);
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void update(Topic topic, String id) {
        for (Topic topicToUpdate:topics) {
            if (topicToUpdate.getId().equals(id)) {
                topicToUpdate.setName(topic.getName());
                topicToUpdate.setDesc(topic.getDesc());
            }
        }
    }

    public void delete(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
