package com.example.Assign_Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assign_Project.entity.Topic;
import com.example.Assign_Project.repository.TopicRepository;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    // Get All
    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    // Save
    public Topic saveTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    // Get by Id
    public Topic getTopicById(Long id) {
        return topicRepository.findById(id).orElse(null);
    }

    // Delete
    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}