package com.yhj.po;

/**
 * @author hua
 * @create 2019-11-21-下午2:46
 */
public class status {
    private  int status_id;
    private  String status_name;

    public status(int status_id, String status_name) {
        this.status_id = status_id;
        this.status_name = status_name;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }
}
