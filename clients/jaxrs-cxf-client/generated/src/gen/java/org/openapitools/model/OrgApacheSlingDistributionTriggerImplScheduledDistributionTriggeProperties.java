package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString path = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString seconds = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString serviceName = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get seconds
   * @return seconds
  **/
  @JsonProperty("seconds")
  public ConfigNodePropertyString getSeconds() {
    return seconds;
  }

  public void setSeconds(ConfigNodePropertyString seconds) {
    this.seconds = seconds;
  }

  public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties seconds(ConfigNodePropertyString seconds) {
    this.seconds = seconds;
    return this;
  }

 /**
   * Get serviceName
   * @return serviceName
  **/
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
