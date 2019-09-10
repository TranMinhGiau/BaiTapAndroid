package com.example.student.myapplication;

public class Contact {
    private String name;
    private  String phone;
    private  int avatar;
    private int pic;

    public  Contact(String Name, String Phone, int Avatar, int Pic)
    {
        setName(Name);
        setPhone(Phone);
        setAvatar(Avatar);
        setPic(Pic);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
