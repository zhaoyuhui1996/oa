package po;

import controller.validation.ValidGroup1;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {
    private Integer id;

    //校验用户ID在3到16个字符中间
    //message：提示校验出错的显示信息
    //groups：此校验属于哪个分组,可以定义多个分组
    @Size(min = 3, max = 16, message = "{user.userid.length.error}", groups = {ValidGroup1.class})
    private String userid;

    //非空校验
    @NotNull(message = "{user.realname.isNull}")
    private String realname;

    private Integer dutyid;

    @Size(min = 6, max = 16, message = "{user.pwd.length.error}")
    private String pwd;

    private String sex;

    private Date birthday;

    private String city;

    private String marry;

    @NotNull(message = "{user.idcard.isNull}")
    private String idcard;

    @NotNull(message = "{user.phone.isNull}")
    private String phone;

    private String email;

    private String address;

    private String permission;

    private Date registerdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getDutyid() {
        return dutyid;
    }

    public void setDutyid(Integer dutyid) {
        this.dutyid = dutyid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry == null ? null : marry.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", realname='" + realname + '\'' +
                ", dutyid=" + dutyid +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", city='" + city + '\'' +
                ", marry='" + marry + '\'' +
                ", idcard='" + idcard + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", permission='" + permission + '\'' +
                ", registerdate=" + registerdate +
                '}';
    }
}