package com.ssafy.excuseMe.tour.model;

import org.springframework.stereotype.Repository;

@Repository
public class TourDto {
	int id;
	String name, addr, tel, img, type;
	float map_x, map_y;
	
	public TourDto() {
		super();
	}

	public TourDto(int id, String name, String addr, String tel, String img, String type, float map_x, float map_y) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.img = img;
		this.type = type;
		this.map_x = map_x;
		this.map_y = map_y;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getMap_x() {
		return map_x;
	}

	public void setMap_x(float map_x) {
		this.map_x = map_x;
	}

	public float getMap_y() {
		return map_y;
	}

	public void setMap_y(float map_y) {
		this.map_y = map_y;
	}

	@Override
	public String toString() {
		return "TourDto [id=" + id + ", name=" + name + ", addr=" + addr + ", tel=" + tel + ", img=" + img + ", type="
				+ type + ", map_x=" + map_x + ", map_y=" + map_y + "]";
	}
	
	
	
}
