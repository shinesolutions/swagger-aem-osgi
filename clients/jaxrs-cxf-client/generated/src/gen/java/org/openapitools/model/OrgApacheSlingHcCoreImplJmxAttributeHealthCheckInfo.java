package org.openapitools.model;

import org.openapitools.model.OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo  {
  
  @ApiModelProperty(value = "")
  private String pid = null;

  @ApiModelProperty(value = "")
  private String title = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "")
  private OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties properties = null;
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

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo pid(String pid) {
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

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo title(String title) {
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

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties properties) {
    this.properties = properties;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo properties(OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties properties) {
    this.properties = properties;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

