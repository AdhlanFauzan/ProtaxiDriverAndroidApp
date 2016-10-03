package org.protaxiandroidapp.restful.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by DIEGO on 01/02/2016.
 */
public class Greeting {

    @JsonProperty
    private static String id;

    @JsonProperty
    private static String content;

    public Greeting(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
