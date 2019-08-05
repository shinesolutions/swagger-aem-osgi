package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo   {
  
  private String pid = null;

  private String title = null;

  private String description = null;

  private OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties properties = null;


  /**
   **/
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo pid(String pid) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo title(String title) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo description(String description) {
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
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo properties(OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties getProperties() {
    return properties;
  }
  public void setProperties(OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo = (OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo) o;
    return Objects.equals(pid, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.pid) &&
        Objects.equals(title, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.title) &&
        Objects.equals(description, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.description) &&
        Objects.equals(properties, orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

