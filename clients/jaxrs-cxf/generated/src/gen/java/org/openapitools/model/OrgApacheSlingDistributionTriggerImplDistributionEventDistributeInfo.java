package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo  {
  
  @ApiModelProperty(value = "")

  private String pid;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties properties;
 /**
   * Get pid
   * @return pid
  **/
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties properties) {
    this.properties = properties;
  }

  public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo properties(OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties properties) {
    this.properties = properties;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo = (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo) o;
    return Objects.equals(this.pid, orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.pid) &&
        Objects.equals(this.title, orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.title) &&
        Objects.equals(this.description, orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.description) &&
        Objects.equals(this.properties, orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

