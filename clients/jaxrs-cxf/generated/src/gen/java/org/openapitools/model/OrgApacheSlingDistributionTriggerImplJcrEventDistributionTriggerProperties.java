package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString path;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray ignoredPathsPatterns;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString serviceName;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean deep;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties = (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.name) &&
        Objects.equals(this.path, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.path) &&
        Objects.equals(this.ignoredPathsPatterns, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.ignoredPathsPatterns) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.serviceName) &&
        Objects.equals(this.deep, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.deep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, ignoredPathsPatterns, serviceName, deep);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

