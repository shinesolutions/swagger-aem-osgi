package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqHcContentPackagesHealthCheckProperties   {
  

  private ConfigNodePropertyString hcName = null;

  private ConfigNodePropertyArray hcTags = null;

  private ConfigNodePropertyString hcMbeanName = null;

  private ConfigNodePropertyArray packageNames = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("package.names")
  public ConfigNodePropertyArray getPackageNames() {
    return packageNames;
  }
  public void setPackageNames(ConfigNodePropertyArray packageNames) {
    this.packageNames = packageNames;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

