package org.logparser.datamodel;

import java.util.Date;

public class Creator {
  String name;
  Date date;
  
  public Creator(final String name, final Date date) {
	  this.name = name;
	  this.date = date;
  }
  
  public void setName(final String name) {
	  this.name = name;
  }
  
  public void setDate(final Date date) {
	  this.date = date;
  }
  
  public String getName() {
	  return name;
  }
  
  public Date getDate() {
	  return date;
  }
}
