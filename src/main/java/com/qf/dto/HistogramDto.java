package com.qf.dto;

import lombok.Getter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2019/5/30.
 */

public class HistogramDto implements Serializable{
    List<String> data = new ArrayList<String>();
    List<String> category = new ArrayList<String>();

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public void addCategory(String categoryName){
        this.category.add(categoryName);
    }

    public void addData(String dataName){
        this.data.add(dataName);
    }

}
