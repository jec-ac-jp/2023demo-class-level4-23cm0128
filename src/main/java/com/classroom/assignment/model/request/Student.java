package com.classroom.assignment.model.request;

public class Student {
  private String id;
  private String name;
  private String gaka;

  public Student(String id, String name, String gaka) {
    this.setId(id);
    this.setName(name);
    this.setGaka(gaka);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getGaka() {
    return gaka;
  }

  public void setGaka(String gaka) {
    this.gaka = gaka;
  }

}
