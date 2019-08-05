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

public class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString linkExpiredPrefix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean linkExpiredRemove = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString linkExpiredSuffix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString linkInvalidPrefix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean linkInvalidRemove = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString linkInvalidSuffix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString linkPredatedPrefix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean linkPredatedRemove = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString linkPredatedSuffix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray linkWcmmodes = null;
 /**
   * Get linkExpiredPrefix
   * @return linkExpiredPrefix
  **/
  @JsonProperty("link.expired.prefix")
  public ConfigNodePropertyString getLinkExpiredPrefix() {
    return linkExpiredPrefix;
  }

  public void setLinkExpiredPrefix(ConfigNodePropertyString linkExpiredPrefix) {
    this.linkExpiredPrefix = linkExpiredPrefix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredPrefix(ConfigNodePropertyString linkExpiredPrefix) {
    this.linkExpiredPrefix = linkExpiredPrefix;
    return this;
  }

 /**
   * Get linkExpiredRemove
   * @return linkExpiredRemove
  **/
  @JsonProperty("link.expired.remove")
  public ConfigNodePropertyBoolean getLinkExpiredRemove() {
    return linkExpiredRemove;
  }

  public void setLinkExpiredRemove(ConfigNodePropertyBoolean linkExpiredRemove) {
    this.linkExpiredRemove = linkExpiredRemove;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredRemove(ConfigNodePropertyBoolean linkExpiredRemove) {
    this.linkExpiredRemove = linkExpiredRemove;
    return this;
  }

 /**
   * Get linkExpiredSuffix
   * @return linkExpiredSuffix
  **/
  @JsonProperty("link.expired.suffix")
  public ConfigNodePropertyString getLinkExpiredSuffix() {
    return linkExpiredSuffix;
  }

  public void setLinkExpiredSuffix(ConfigNodePropertyString linkExpiredSuffix) {
    this.linkExpiredSuffix = linkExpiredSuffix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredSuffix(ConfigNodePropertyString linkExpiredSuffix) {
    this.linkExpiredSuffix = linkExpiredSuffix;
    return this;
  }

 /**
   * Get linkInvalidPrefix
   * @return linkInvalidPrefix
  **/
  @JsonProperty("link.invalid.prefix")
  public ConfigNodePropertyString getLinkInvalidPrefix() {
    return linkInvalidPrefix;
  }

  public void setLinkInvalidPrefix(ConfigNodePropertyString linkInvalidPrefix) {
    this.linkInvalidPrefix = linkInvalidPrefix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidPrefix(ConfigNodePropertyString linkInvalidPrefix) {
    this.linkInvalidPrefix = linkInvalidPrefix;
    return this;
  }

 /**
   * Get linkInvalidRemove
   * @return linkInvalidRemove
  **/
  @JsonProperty("link.invalid.remove")
  public ConfigNodePropertyBoolean getLinkInvalidRemove() {
    return linkInvalidRemove;
  }

  public void setLinkInvalidRemove(ConfigNodePropertyBoolean linkInvalidRemove) {
    this.linkInvalidRemove = linkInvalidRemove;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidRemove(ConfigNodePropertyBoolean linkInvalidRemove) {
    this.linkInvalidRemove = linkInvalidRemove;
    return this;
  }

 /**
   * Get linkInvalidSuffix
   * @return linkInvalidSuffix
  **/
  @JsonProperty("link.invalid.suffix")
  public ConfigNodePropertyString getLinkInvalidSuffix() {
    return linkInvalidSuffix;
  }

  public void setLinkInvalidSuffix(ConfigNodePropertyString linkInvalidSuffix) {
    this.linkInvalidSuffix = linkInvalidSuffix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidSuffix(ConfigNodePropertyString linkInvalidSuffix) {
    this.linkInvalidSuffix = linkInvalidSuffix;
    return this;
  }

 /**
   * Get linkPredatedPrefix
   * @return linkPredatedPrefix
  **/
  @JsonProperty("link.predated.prefix")
  public ConfigNodePropertyString getLinkPredatedPrefix() {
    return linkPredatedPrefix;
  }

  public void setLinkPredatedPrefix(ConfigNodePropertyString linkPredatedPrefix) {
    this.linkPredatedPrefix = linkPredatedPrefix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedPrefix(ConfigNodePropertyString linkPredatedPrefix) {
    this.linkPredatedPrefix = linkPredatedPrefix;
    return this;
  }

 /**
   * Get linkPredatedRemove
   * @return linkPredatedRemove
  **/
  @JsonProperty("link.predated.remove")
  public ConfigNodePropertyBoolean getLinkPredatedRemove() {
    return linkPredatedRemove;
  }

  public void setLinkPredatedRemove(ConfigNodePropertyBoolean linkPredatedRemove) {
    this.linkPredatedRemove = linkPredatedRemove;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedRemove(ConfigNodePropertyBoolean linkPredatedRemove) {
    this.linkPredatedRemove = linkPredatedRemove;
    return this;
  }

 /**
   * Get linkPredatedSuffix
   * @return linkPredatedSuffix
  **/
  @JsonProperty("link.predated.suffix")
  public ConfigNodePropertyString getLinkPredatedSuffix() {
    return linkPredatedSuffix;
  }

  public void setLinkPredatedSuffix(ConfigNodePropertyString linkPredatedSuffix) {
    this.linkPredatedSuffix = linkPredatedSuffix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedSuffix(ConfigNodePropertyString linkPredatedSuffix) {
    this.linkPredatedSuffix = linkPredatedSuffix;
    return this;
  }

 /**
   * Get linkWcmmodes
   * @return linkWcmmodes
  **/
  @JsonProperty("link.wcmmodes")
  public ConfigNodePropertyArray getLinkWcmmodes() {
    return linkWcmmodes;
  }

  public void setLinkWcmmodes(ConfigNodePropertyArray linkWcmmodes) {
    this.linkWcmmodes = linkWcmmodes;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkWcmmodes(ConfigNodePropertyArray linkWcmmodes) {
    this.linkWcmmodes = linkWcmmodes;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

