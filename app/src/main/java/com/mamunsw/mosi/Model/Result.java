
package com.mamunsw.mosi.Model;

import java.util.HashMap;
import java.util.Map;

public class Result {

    private String id;
    private String judulfilm;
    private String genrefilm;
    private String sinopsisfilm;
    private String gambarfilm;
    private String durasifilm;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudulfilm() {
        return judulfilm;
    }

    public void setJudulfilm(String judulfilm) {
        this.judulfilm = judulfilm;
    }

    public String getGenrefilm() {
        return genrefilm;
    }

    public void setGenrefilm(String genrefilm) {
        this.genrefilm = genrefilm;
    }

    public String getSinopsisfilm() {
        return sinopsisfilm;
    }

    public void setSinopsisfilm(String sinopsisfilm) {
        this.sinopsisfilm = sinopsisfilm;
    }

    public String getGambarfilm() {
        return gambarfilm;
    }

    public void setGambarfilm(String gambarfilm) {
        this.gambarfilm = gambarfilm;
    }

    public String getDurasifilm() {
        return durasifilm;
    }

    public void setDurasifilm(String durasifilm) {
        this.durasifilm = durasifilm;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
