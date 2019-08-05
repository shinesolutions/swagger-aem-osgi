package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  @JsonProperty("ignoredPathsPatterns")
  private ConfigNodePropertyArray ignoredPathsPatterns = null;

  @JsonProperty("serviceName")
  private ConfigNodePropertyString serviceName = null;

  @JsonProperty("deep")
  private ConfigNodePropertyBoolean deep = null;

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties ignoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns) {
    this.ignoredPathsPatterns = ignoredPathsPatterns;
    return this;
  }

   /**
   * Get ignoredPathsPatterns
   * @return ignoredPathsPatterns
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getIgnoredPathsPatterns() {
    return ignoredPathsPatterns;
  }

  public void setIgnoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns) {
    this.ignoredPathsPatterns = ignoredPathsPatterns;
  }

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties deep(ConfigNodePropertyBoolean deep) {
    this.deep = deep;
    return this;
  }

   /**
   * Get deep
   * @return deep
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDeep() {
    return deep;
  }

  public void setDeep(ConfigNodePropertyBoolean deep) {
    this.deep = deep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

