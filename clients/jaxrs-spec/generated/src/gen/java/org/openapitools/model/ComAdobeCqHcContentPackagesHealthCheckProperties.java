package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqHcContentPackagesHealthCheckProperties   {
  
  private @Valid ConfigNodePropertyString hcName = null;
  private @Valid ConfigNodePropertyArray hcTags = null;
  private @Valid ConfigNodePropertyString hcMbeanName = null;
  private @Valid ConfigNodePropertyArray packageNames = null;

  /**
   **/
  public ComAdobeCqHcContentPackagesHealthCheckProperties hcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }
  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  /**
   **/
  public ComAdobeCqHcContentPackagesHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   **/
  public ComAdobeCqHcContentPackagesHealthCheckProperties hcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }
  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  /**
   **/
  public ComAdobeCqHcContentPackagesHealthCheckProperties packageNames(ConfigNodePropertyArray packageNames) {
    this.packageNames = packageNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("package.names")
  public ConfigNodePropertyArray getPackageNames() {
    return packageNames;
  }
  public void setPackageNames(ConfigNodePropertyArray packageNames) {
    this.packageNames = packageNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqHcContentPackagesHealthCheckProperties comAdobeCqHcContentPackagesHealthCheckProperties = (ComAdobeCqHcContentPackagesHealthCheckProperties) o;
    return Objects.equals(hcName, comAdobeCqHcContentPackagesHealthCheckProperties.hcName) &&
        Objects.equals(hcTags, comAdobeCqHcContentPackagesHealthCheckProperties.hcTags) &&
        Objects.equals(hcMbeanName, comAdobeCqHcContentPackagesHealthCheckProperties.hcMbeanName) &&
        Objects.equals(packageNames, comAdobeCqHcContentPackagesHealthCheckProperties.packageNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName, packageNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqHcContentPackagesHealthCheckProperties {\n");
    
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
    sb.append("    packageNames: ").append(toIndentedString(packageNames)).append("\n");
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

