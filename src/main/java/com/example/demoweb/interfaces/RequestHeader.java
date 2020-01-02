package com.example.demoweb.interfaces;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class RequestHeader {
    @JsonProperty("headServiceCode")
    private String headServiceCode;
    @JsonProperty("headJson")
    private String headJson;
    @JsonProperty("userInfo")
    private UserInfoBean userInfo;

    public String getHeadServiceCode() {
        return headServiceCode;
    }

    public void setHeadServiceCode(String headServiceCode) {
        this.headServiceCode = headServiceCode;
    }

    public String getHeadJson() {
        return headJson;
    }

    public void setHeadJson(String headJson) {
        this.headJson = headJson;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

    public static class UserInfoBean {
        /**
         * userName :
         * userId :
         */

        private String userName;
        private String userId;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
    /**
     {
     "headServiceCode":"",
     "userInfo":["userName":"","userId":""],
     "headJson":""
     }
     */


}
