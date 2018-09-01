package com.example.khokan.recycleview;

/**
 * Created by USER on 8/24/2018.
 */

public class ListItem{
    private String title;
    private String desc;

    public ListItem(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
