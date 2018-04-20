package com.jxaummd.module_library.bean;

public class Question {
    String  userImage  ;
    String  userName;
    String submitTime;
    String  place;
    String  queContent;
    String  queImage1;
    String  quesImage2;
    String  quesImage3;
    long goodVal =0;
    long  commentVal = 0;


    public Question(String userImage, String userName, String submitTime, String place, String queContent, String queImage1, String quesImage2, String quesImage3, long goodVal, long commentVal) {
        this.userImage = userImage;
        this.userName = userName;
        this.submitTime = submitTime;
        this.place = place;
        this.queContent = queContent;
        this.queImage1 = queImage1;
        this.quesImage2 = quesImage2;
        this.quesImage3 = quesImage3;
        this.goodVal = goodVal;
        this.commentVal = commentVal;
    }


    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getQueContent() {
        return queContent;
    }

    public void setQueContent(String queContent) {
        this.queContent = queContent;
    }

    public String getQueImage1() {
        return queImage1;
    }

    public void setQueImage1(String queImage1) {
        this.queImage1 = queImage1;
    }

    public String getQuesImage2() {
        return quesImage2;
    }

    public void setQuesImage2(String quesImage2) {
        this.quesImage2 = quesImage2;
    }

    public String getQuesImage3() {
        return quesImage3;
    }

    public void setQuesImage3(String quesImage3) {
        this.quesImage3 = quesImage3;
    }

    public long getGoodVal() {
        return goodVal;
    }

    public void setGoodVal(long goodVal) {
        this.goodVal = goodVal;
    }

    public long getCommentVal() {
        return commentVal;
    }

    public void setCommentVal(long commentVal) {
        this.commentVal = commentVal;
    }
}
