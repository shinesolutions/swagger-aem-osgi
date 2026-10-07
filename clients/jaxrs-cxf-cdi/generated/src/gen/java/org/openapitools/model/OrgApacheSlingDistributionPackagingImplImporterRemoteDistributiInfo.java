package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo   {
  
  private String pid;

  private String title;

  private String description;

  private OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties properties;

  /**
   **/
  public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo pid(String pid) {
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
  public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo title(String title) {
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
  public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo description(String description) {
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
  public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo properties(OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties getProperties() {
    return properties;
  }
  public void setProperties(OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties properties) {
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
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo = (OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo) o;
    return Objects.equals(this.pid, orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.pid) &&
        Objects.equals(this.title, orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.title) &&
        Objects.equals(this.description, orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.description) &&
        Objects.equals(this.properties, orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo {\n");
    
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

