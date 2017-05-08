package po;

import java.util.Date;

public class Email {
    private Integer emailid;

    private String sendid;

    private String title;

    private Date senddate;

    private Short isfile;

    private Short emailmode;

    private String content;

    public Integer getEmailid() {
        return emailid;
    }

    public void setEmailid(Integer emailid) {
        this.emailid = emailid;
    }

    public String getSendid() {
        return sendid;
    }

    public void setSendid(String sendid) {
        this.sendid = sendid == null ? null : sendid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Short getIsfile() {
        return isfile;
    }

    public void setIsfile(Short isfile) {
        this.isfile = isfile;
    }

    public Short getEmailmode() {
        return emailmode;
    }

    public void setEmailmode(Short emailmode) {
        this.emailmode = emailmode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}