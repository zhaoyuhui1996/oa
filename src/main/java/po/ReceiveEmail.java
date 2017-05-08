package po;

public class ReceiveEmail {
    private String receiveuserid;

    private Integer emailid;

    private Short isread;

    private Short isdel;

    public String getReceiveuserid() {
        return receiveuserid;
    }

    public void setReceiveuserid(String receiveuserid) {
        this.receiveuserid = receiveuserid == null ? null : receiveuserid.trim();
    }

    public Integer getEmailid() {
        return emailid;
    }

    public void setEmailid(Integer emailid) {
        this.emailid = emailid;
    }

    public Short getIsread() {
        return isread;
    }

    public void setIsread(Short isread) {
        this.isread = isread;
    }

    public Short getIsdel() {
        return isdel;
    }

    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }
}