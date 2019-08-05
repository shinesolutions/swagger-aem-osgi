package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString path = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray ignoredPathsPatterns = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString serviceName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean deep = null;
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

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties name(ConfigNodePropertyString name) {
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

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get ignoredPathsPatterns
   * @return ignoredPathsPatterns
  **/
  @JsonProperty("ignoredPathsPatterns")
  public ConfigNodePropertyArray getIgnoredPathsPatterns() {
    return ignoredPathsPatterns;
  }

  public void setIgnoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns) {
    this.ignoredPathsPatterns = ignoredPathsPatterns;
  }

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties ignoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns) {
    this.ignoredPathsPatterns = ignoredPathsPatterns;
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

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
   * Get deep
   * @return deep
  **/
  @JsonProperty("deep")
  public ConfigNodePropertyBoolean getDeep() {
    return deep;
  }

  public void setDeep(ConfigNodePropertyBoolean deep) {
    this.deep = deep;
  }

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties deep(ConfigNodePropertyBoolean deep) {
    this.deep = deep;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    ignoredPathsPatterns: ").append(toIndentedString(ignoredPathsPatterns)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    deep: ").append(toIndentedString(deep)).append("\n");
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

