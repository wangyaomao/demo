package com.example.demo.bean;

public class User {
                private String id;
                private String username;
                private String sex;//'性别'
                private String city;//'城市'
                private String sign;//'签名'
                private String experience;//'积分'
                private String score;//'评分'
                private String classify;//'职业'
                private String wealth;//'财富'

    public User(){}

    public User(String id, String username, String sex, String city, String sign, String experience, String score, String classify, String wealth) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.city = city;
        this.sign = sign;
        this.experience = experience;
        this.score = score;
        this.classify = classify;
        this.wealth = wealth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getWealth() {
        return wealth;
    }

    public void setWealth(String wealth) {
        this.wealth = wealth;
    }
}
