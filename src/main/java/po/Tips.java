package po;

public class Tips {
    private String showtips;

    private Integer tipsdate;

    private String showemail;

    private String shownotice;

    private String userid;

    public String getShowtips() {
        return showtips;
    }

    public void setShowtips(String showtips) {
        this.showtips = showtips == null ? null : showtips.trim();
    }

    public Integer getTipsdate() {
        return tipsdate;
    }

    public void setTipsdate(Integer tipsdate) {
        this.tipsdate = tipsdate;
    }

    public String getShowemail() {
        return showemail;
    }

    public void setShowemail(String showemail) {
        this.showemail = showemail == null ? null : showemail.trim();
    }

    public String getShownotice() {
        return shownotice;
    }

    public void setShownotice(String shownotice) {
        this.shownotice = shownotice == null ? null : shownotice.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}