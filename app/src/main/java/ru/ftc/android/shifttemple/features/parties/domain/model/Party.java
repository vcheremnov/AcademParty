package ru.ftc.android.shifttemple.features.parties.domain.model;

import java.util.List;

/**
 * Created: samokryl
 * Date: 01.07.18
 * Time: 22:40
 */

public final class Party {
    private String id = "";
    private String name = "";
    private String host = "";
    private String place = "";
    private String date = "";
    private String pictureUrl = "";
    private String description = "";
    private Integer maxPersons = 0;
    private Integer currentPersons = 0;
    private List<Person> participants = null;

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


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getMaxPersons() {
        return maxPersons;
    }

    public void setMaxPersons(Integer maxPersons) {
        this.maxPersons = maxPersons;
    }


    public Integer getCurrentPersons() {
        return currentPersons;
    }

    public void setCurrentPersons(Integer currentPersons) {
        this.currentPersons = currentPersons;
    }


    public List<Person> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Person> participants) {
        this.participants = participants;
    }

}
