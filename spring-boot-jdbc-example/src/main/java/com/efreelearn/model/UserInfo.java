

package com.efreelearn.model;

import java.util.Date;

public class UserInfo {

    int pk_user_id;
    String user_name;
    public int getPk_user_id() {
		return pk_user_id;
	}

	public void setPk_user_id(int pk_user_id) {
		this.pk_user_id = pk_user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	String password;
    String email;
    Date date;

    public UserInfo(int id, String name, String email, Date date) {
        this.pk_user_id = id;
        this.user_name = name;
        this.email = email;
        this.date = date;
    }

    public UserInfo() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Customer{" +
                "pk_user_id=" + pk_user_id +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                '}';
    }

    public int getId() {
        return pk_user_id;
    }

    public void setId(int id) {
        this.pk_user_id = id;
    }

    public String getName() {
        return user_name;
    }

    public void setName(String name) {
        this.user_name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
