package com.example.alumini.network.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MemberListResponse {


//    private java.util.List<com.example.alumini.network.pojo.List> list = new ArrayList<com.example.alumini.network.pojo.List>();
    private java.util.List<MemberInstance> list = new ArrayList<>();
    private String time;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The list
     */
    public java.util.List<com.example.alumini.network.pojo.MemberInstance> getList() {
        return list;
    }

    /**
     *
     * @param list
     *     The list
     */
    public void setList(java.util.List<com.example.alumini.network.pojo.MemberInstance> list) {
        this.list = list;
    }

    /**
     *
     * @return
     *     The time
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     *     The time
     */
    public void setTime(String time) {
        this.time = time;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


