package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo   {
  
  private String pid;

  private String title;

  private String description;

  private ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties properties;

  /**
   **/
  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }


  /**
   **/
  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   **/
  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo properties(ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo = (ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo) o;
    return Objects.equals(this.pid, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.pid) &&
        Objects.equals(this.title, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.title) &&
        Objects.equals(this.description, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.description) &&
        Objects.equals(this.properties, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

