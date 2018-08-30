package com.smg.art.mvpbase.bean;

/**
 * Created by Mervin on 2018/7/25 0025.
 */

public class LoginBean {


    /**
     * status : 1
     * msg : 登录成功
     * data : {"memberNo":"15343026139","headImg":"/static/uploads/userHeadImg/15343026139.jpg","JSESSIONID_SHIRO":"3fea3df2-2960-4d8e-b2a0-c5d30a8c25af","memberName":"珐琅","JSESSIONID":"3fea3df2-2960-4d8e-b2a0-c5d30a8c25af","memberId":98,"RCToken":"27nTM8ZFYs7cc4h2moV8nKd4zGNQjLesC+4CACdACo5vg2QNJyvplRjG5tmfMUenc86W3UYJQ4qJAGarVnIJKw=="}
     */

    private int status;
    private String msg;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * memberNo : 15343026139
         * headImg : /static/uploads/userHeadImg/15343026139.jpg
         * JSESSIONID_SHIRO : 3fea3df2-2960-4d8e-b2a0-c5d30a8c25af
         * memberName : 珐琅
         * JSESSIONID : 3fea3df2-2960-4d8e-b2a0-c5d30a8c25af
         * memberId : 98
         * RCToken : 27nTM8ZFYs7cc4h2moV8nKd4zGNQjLesC+4CACdACo5vg2QNJyvplRjG5tmfMUenc86W3UYJQ4qJAGarVnIJKw==
         */

        private String memberNo;
        private String headImg;
        private String JSESSIONID_SHIRO;
        private String memberName;
        private String JSESSIONID;
        private int memberId;
        private String RCToken;

        public String getMemberNo() {
            return memberNo;
        }

        public void setMemberNo(String memberNo) {
            this.memberNo = memberNo;
        }

        public String getHeadImg() {
            return headImg;
        }

        public void setHeadImg(String headImg) {
            this.headImg = headImg;
        }

        public String getJSESSIONID_SHIRO() {
            return JSESSIONID_SHIRO;
        }

        public void setJSESSIONID_SHIRO(String JSESSIONID_SHIRO) {
            this.JSESSIONID_SHIRO = JSESSIONID_SHIRO;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getJSESSIONID() {
            return JSESSIONID;
        }

        public void setJSESSIONID(String JSESSIONID) {
            this.JSESSIONID = JSESSIONID;
        }

        public int getMemberId() {
            return memberId;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }

        public String getRCToken() {
            return RCToken;
        }

        public void setRCToken(String RCToken) {
            this.RCToken = RCToken;
        }
    }
}
