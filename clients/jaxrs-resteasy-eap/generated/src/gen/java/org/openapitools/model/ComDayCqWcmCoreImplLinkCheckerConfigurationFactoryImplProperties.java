package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties   {
  

  private ConfigNodePropertyString linkExpiredPrefix = null;

  private ConfigNodePropertyBoolean linkExpiredRemove = null;

  private ConfigNodePropertyString linkExpiredSuffix = null;

  private ConfigNodePropertyString linkInvalidPrefix = null;

  private ConfigNodePropertyBoolean linkInvalidRemove = null;

  private ConfigNodePropertyString linkInvalidSuffix = null;

  private ConfigNodePropertyString linkPredatedPrefix = null;

  private ConfigNodePropertyBoolean linkPredatedRemove = null;

  private ConfigNodePropertyString linkPredatedSuffix = null;

  private ConfigNodePropertyArray linkWcmmodes = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.expired.prefix")
  public ConfigNodePropertyString getLinkExpiredPrefix() {
    return linkExpiredPrefix;
  }
  public void setLinkExpiredPrefix(ConfigNodePropertyString linkExpiredPrefix) {
    this.linkExpiredPrefix = linkExpiredPrefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.expired.remove")
  public ConfigNodePropertyBoolean getLinkExpiredRemove() {
    return linkExpiredRemove;
  }
  public void setLinkExpiredRemove(ConfigNodePropertyBoolean linkExpiredRemove) {
    this.linkExpiredRemove = linkExpiredRemove;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.expired.suffix")
  public ConfigNodePropertyString getLinkExpiredSuffix() {
    return linkExpiredSuffix;
  }
  public void setLinkExpiredSuffix(ConfigNodePropertyString linkExpiredSuffix) {
    this.linkExpiredSuffix = linkExpiredSuffix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.invalid.prefix")
  public ConfigNodePropertyString getLinkInvalidPrefix() {
    return linkInvalidPrefix;
  }
  public void setLinkInvalidPrefix(ConfigNodePropertyString linkInvalidPrefix) {
    this.linkInvalidPrefix = linkInvalidPrefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.invalid.remove")
  public ConfigNodePropertyBoolean getLinkInvalidRemove() {
    return linkInvalidRemove;
  }
  public void setLinkInvalidRemove(ConfigNodePropertyBoolean linkInvalidRemove) {
    this.linkInvalidRemove = linkInvalidRemove;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.invalid.suffix")
  public ConfigNodePropertyString getLinkInvalidSuffix() {
    return linkInvalidSuffix;
  }
  public void setLinkInvalidSuffix(ConfigNodePropertyString linkInvalidSuffix) {
    this.linkInvalidSuffix = linkInvalidSuffix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.predated.prefix")
  public ConfigNodePropertyString getLinkPredatedPrefix() {
    return linkPredatedPrefix;
  }
  public void setLinkPredatedPrefix(ConfigNodePropertyString linkPredatedPrefix) {
    this.linkPredatedPrefix = linkPredatedPrefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.predated.remove")
  public ConfigNodePropertyBoolean getLinkPredatedRemove() {
    return linkPredatedRemove;
  }
  public void setLinkPredatedRemove(ConfigNodePropertyBoolean linkPredatedRemove) {
    this.linkPredatedRemove = linkPredatedRemove;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.predated.suffix")
  public ConfigNodePropertyString getLinkPredatedSuffix() {
    return linkPredatedSuffix;
  }
  public void setLinkPredatedSuffix(ConfigNodePropertyString linkPredatedSuffix) {
    this.linkPredatedSuffix = linkPredatedSuffix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("link.wcmmodes")
  public ConfigNodePropertyArray getLinkWcmmodes() {
    return linkWcmmodes;
  }
  public void setLinkWcmmodes(ConfigNodePropertyArray linkWcmmodes) {
    this.linkWcmmodes = linkWcmmodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties = (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties) o;
    return Objects.equals(linkExpiredPrefix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkExpiredPrefix) &&
        Objects.equals(linkExpiredRemove, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkExpiredRemove) &&
        Objects.equals(linkExpiredSuffix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkExpiredSuffix) &&
        Objects.equals(linkInvalidPrefix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkInvalidPrefix) &&
        Objects.equals(linkInvalidRemove, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkInvalidRemove) &&
        Objects.equals(linkInvalidSuffix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkInvalidSuffix) &&
        Objects.equals(linkPredatedPrefix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkPredatedPrefix) &&
        Objects.equals(linkPredatedRemove, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkPredatedRemove) &&
        Objects.equals(linkPredatedSuffix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkPredatedSuffix) &&
        Objects.equals(linkWcmmodes, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkWcmmodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkExpiredPrefix, linkExpiredRemove, linkExpiredSuffix, linkInvalidPrefix, linkInvalidRemove, linkInvalidSuffix, linkPredatedPrefix, linkPredatedRemove, linkPredatedSuffix, linkWcmmodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {\n");
    
    sb.append("    linkExpiredPrefix: ").append(toIndentedString(linkExpiredPrefix)).append("\n");
    sb.append("    linkExpiredRemove: ").append(toIndentedString(linkExpiredRemove)).append("\n");
    sb.append("    linkExpiredSuffix: ").append(toIndentedString(linkExpiredSuffix)).append("\n");
    sb.append("    linkInvalidPrefix: ").append(toIndentedString(linkInvalidPrefix)).append("\n");
    sb.append("    linkInvalidRemove: ").append(toIndentedString(linkInvalidRemove)).append("\n");
    sb.append("    linkInvalidSuffix: ").append(toIndentedString(linkInvalidSuffix)).append("\n");
    sb.append("    linkPredatedPrefix: ").append(toIndentedString(linkPredatedPrefix)).append("\n");
    sb.append("    linkPredatedRemove: ").append(toIndentedString(linkPredatedRemove)).append("\n");
    sb.append("    linkPredatedSuffix: ").append(toIndentedString(linkPredatedSuffix)).append("\n");
    sb.append("    linkWcmmodes: ").append(toIndentedString(linkWcmmodes)).append("\n");
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

