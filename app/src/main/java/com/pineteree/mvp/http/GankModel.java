package com.pineteree.mvp.http;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/1/8.
 */
//bean
public class GankModel {

    private boolean error;
    private List<ResultsEntity> results;

    public void setError(boolean error) {
        this.error = error;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public boolean getError() {
        return error;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public static class ResultsEntity implements Serializable {
        public ResultsEntity() {
        }

        public ResultsEntity(String _id, String createdAt, String desc, String publishedAt,
                             String source, String type, String url, boolean used, String who,
                             List<String> images) {
            this._id = _id;
            this.createdAt = createdAt;
            this.desc = desc;
            this.publishedAt = publishedAt;
            this.source = source;
            this.type = type;
            this.url = url;
            this.used = used;
            this.who = who;
            this.images = images;
        }

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public String get_id() {
            return _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String getSource() {
            return source;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public boolean getUsed() {
            return used;
        }

        public String getWho() {
            return who;
        }

        public List<String> getImages() {
            return images;
        }
    }
}

