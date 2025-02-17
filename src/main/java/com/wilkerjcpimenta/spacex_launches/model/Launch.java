package com.wilkerjcpimenta.spacex_launches.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Launch {

    // A API provavelmente retorna o ID como string
    private String id;

    @JsonProperty("name")
    private String missionName;

    @JsonProperty("date_utc")
    private String launchDate;

    // Construtor sem argumentos é importante para a deserialização
    public Launch() {}

    public Launch(String id, String missionName, String launchDate) {
        this.id = id;
        this.missionName = missionName;
        this.launchDate = launchDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }
}
