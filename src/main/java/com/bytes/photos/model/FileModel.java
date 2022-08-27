package com.bytes.photos.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name="picture16")
public class FileModel {
	@Id
	@GeneratedValue
    @Column(name = "id")
	@JsonView(View.FileInfo.class)
    private Long id;
	
    @Column(name = "name")
    @JsonView(View.FileInfo.class)
	private String name;
    
    @Column(name = "picturetype")
	private String picturetype;
	
	@Lob
    @Column(name="picture")
	private byte[] picture;
	

	public FileModel(){}
	public FileModel(String name, String picturetype, byte[] picture){
		this.name = name;
		this.picturetype = picturetype;
		this.picture = picture;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicturetype() {
		return this.picturetype;
	}

	public void setPicturetype(String picturetype) {
		this.picturetype = picturetype;
	}

	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] pic) {
		this.picture = pic;
	}
}