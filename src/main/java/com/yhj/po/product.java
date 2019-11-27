package com.yhj.po;

/**
 * @author hua
 * @create 2019-11-21-下午2:46
 */
public class product {
    private String product_id;
    private String product_name;
    private int product_sum;
    private String product_price;
    private int status_id;

    public product(String product_id, String product_name, int product_sum, String product_price, int status_id) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_sum = product_sum;
        this.product_price = product_price;
        this.status_id = status_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_sum() {
        return product_sum;
    }

    public void setProduct_sum(int product_sum) {
        this.product_sum = product_sum;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }
}
