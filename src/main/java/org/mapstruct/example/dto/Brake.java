package org.mapstruct.example.dto;


public class Brake {

  private Integer id;

  private String name;

  public Integer getId() {
	return id;
  }

  public void setId(Integer id) {
	this.id = id;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }


  @Override
  public String toString() {
	return "Brake{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}
