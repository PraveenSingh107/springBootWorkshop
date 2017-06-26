package com.example.workshop.com.example.workshop.topic;

public class Topic {
    private String id;
    private String name;
    private String desc;


    public Topic(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Topic() {
    }

    public String getId() {


        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Topic)) return false;

        Topic topic = (Topic) o;

        if (getId() != topic.getId()) return false;
        if (getName() != null ? !getName().equals(topic.getName()) : topic.getName() != null) return false;
        return getDesc() != null ? getDesc().equals(topic.getDesc()) : topic.getDesc() == null;
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
