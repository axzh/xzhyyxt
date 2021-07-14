package cn.yy.pojo;

import java.util.Date;

public class selldetail {
    private Integer id;
    private String sellName;
    private Double sellPrice;
    private Double sellCount;
    private Date sellTime;
    private Integer medid;
    private Integer userid;

    public selldetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSellName() {
        return sellName;
    }

    public void setSellName(String sellName) {
        this.sellName = sellName;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getSellCount() {
        return sellCount;
    }

    public void setSellCount(Double sellCount) {
        this.sellCount = sellCount;
    }

    public Date getSellTime() {
        return sellTime;
    }

    public void setSellTime(Date sellTime) {
        this.sellTime = sellTime;
    }

    public Integer getMedid() {
        return medid;
    }

    public void setMedid(Integer medid) {
        this.medid = medid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "selldetail{" +
                "id=" + id +
                ", sellName='" + sellName + '\'' +
                ", sellPrice=" + sellPrice +
                ", sellCount=" + sellCount +
                ", sellTime=" + sellTime +
                ", medid=" + medid +
                ", userid=" + userid +
                '}';
    }
}
