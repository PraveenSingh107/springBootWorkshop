package com.example.workshop.com.example.workshop.topic;

import com.example.workshop.com.example.workshop.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TopicsController {

    @Value("${tripService.description}")
    private String _description;

    @Autowired
    private TopicService topicService;

    public TopicsController(TopicService service) {
        this.topicService = topicService;
    }

    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        System.out.println(this._description);
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
        System.out.println(topic);
        topicService.update(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.delete(id);
    }

}
