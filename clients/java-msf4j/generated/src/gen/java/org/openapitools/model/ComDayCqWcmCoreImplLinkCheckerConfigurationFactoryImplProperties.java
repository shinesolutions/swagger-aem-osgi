package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties   {
  @JsonProperty("link.expired.prefix")
  private ConfigNodePropertyString linkExpiredPrefix = null;

  @JsonProperty("link.expired.remove")
  private ConfigNodePropertyBoolean linkExpiredRemove = null;

  @JsonProperty("link.expired.suffix")
  private ConfigNodePropertyString linkExpiredSuffix = null;

  @JsonProperty("link.invalid.prefix")
  private ConfigNodePropertyString linkInvalidPrefix = null;

  @JsonProperty("link.invalid.remove")
  private ConfigNodePropertyBoolean linkInvalidRemove = null;

  @JsonProperty("link.invalid.suffix")
  private ConfigNodePropertyString linkInvalidSuffix = null;

  @JsonProperty("link.predated.prefix")
  private ConfigNodePropertyString linkPredatedPrefix = null;

  @JsonProperty("link.predated.remove")
  private ConfigNodePropertyBoolean linkPredatedRemove = null;

  @JsonProperty("link.predated.suffix")
  private ConfigNodePropertyString linkPredatedSuffix = null;

  @JsonProperty("link.wcmmodes")
  private ConfigNodePropertyArray linkWcmmodes = null;

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredPrefix(ConfigNodePropertyString linkExpiredPrefix) {
    this.linkExpiredPrefix = linkExpiredPrefix;
    return this;
  }

   /**
   * Get linkExpiredPrefix
   * @return linkExpiredPrefix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getLinkExpiredPrefix() {
    return linkExpiredPrefix;
  }

  public void setLinkExpiredPrefix(ConfigNodePropertyString linkExpiredPrefix) {
    this.linkExpiredPrefix = linkExpiredPrefix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredRemove(ConfigNodePropertyBoolean linkExpiredRemove) {
    this.linkExpiredRemove = linkExpiredRemove;
    return this;
  }

   /**
   * Get linkExpiredRemove
   * @return linkExpiredRemove
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getLinkExpiredRemove() {
    return linkExpiredRemove;
  }

  public void setLinkExpiredRemove(ConfigNodePropertyBoolean linkExpiredRemove) {
    this.linkExpiredRemove = linkExpiredRemove;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredSuffix(ConfigNodePropertyString linkExpiredSuffix) {
    this.linkExpiredSuffix = linkExpiredSuffix;
    return this;
  }

   /**
   * Get linkExpiredSuffix
   * @return linkExpiredSuffix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getLinkExpiredSuffix() {
    return linkExpiredSuffix;
  }

  public void setLinkExpiredSuffix(ConfigNodePropertyString linkExpiredSuffix) {
    this.linkExpiredSuffix = linkExpiredSuffix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidPrefix(ConfigNodePropertyString linkInvalidPrefix) {
    this.linkInvalidPrefix = linkInvalidPrefix;
    return this;
  }

   /**
   * Get linkInvalidPrefix
   * @return linkInvalidPrefix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getLinkInvalidPrefix() {
    return linkInvalidPrefix;
  }

  public void setLinkInvalidPrefix(ConfigNodePropertyString linkInvalidPrefix) {
    this.linkInvalidPrefix = linkInvalidPrefix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidRemove(ConfigNodePropertyBoolean linkInvalidRemove) {
    this.linkInvalidRemove = linkInvalidRemove;
    return this;
  }

   /**
   * Get linkInvalidRemove
   * @return linkInvalidRemove
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getLinkInvalidRemove() {
    return linkInvalidRemove;
  }

  public void setLinkInvalidRemove(ConfigNodePropertyBoolean linkInvalidRemove) {
    this.linkInvalidRemove = linkInvalidRemove;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidSuffix(ConfigNodePropertyString linkInvalidSuffix) {
    this.linkInvalidSuffix = linkInvalidSuffix;
    return this;
  }

   /**
   * Get linkInvalidSuffix
   * @return linkInvalidSuffix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getLinkInvalidSuffix() {
    return linkInvalidSuffix;
  }

  public void setLinkInvalidSuffix(ConfigNodePropertyString linkInvalidSuffix) {
    this.linkInvalidSuffix = linkInvalidSuffix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedPrefix(ConfigNodePropertyString linkPredatedPrefix) {
    this.linkPredatedPrefix = linkPredatedPrefix;
    return this;
  }

   /**
   * Get linkPredatedPrefix
   * @return linkPredatedPrefix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getLinkPredatedPrefix() {
    return linkPredatedPrefix;
  }

  public void setLinkPredatedPrefix(ConfigNodePropertyString linkPredatedPrefix) {
    this.linkPredatedPrefix = linkPredatedPrefix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedRemove(ConfigNodePropertyBoolean linkPredatedRemove) {
    this.linkPredatedRemove = linkPredatedRemove;
    return this;
  }

   /**
   * Get linkPredatedRemove
   * @return linkPredatedRemove
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getLinkPredatedRemove() {
    return linkPredatedRemove;
  }

  public void setLinkPredatedRemove(ConfigNodePropertyBoolean linkPredatedRemove) {
    this.linkPredatedRemove = linkPredatedRemove;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedSuffix(ConfigNodePropertyString linkPredatedSuffix) {
    this.linkPredatedSuffix = linkPredatedSuffix;
    return this;
  }

   /**
   * Get linkPredatedSuffix
   * @return linkPredatedSuffix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getLinkPredatedSuffix() {
    return linkPredatedSuffix;
  }

  public void setLinkPredatedSuffix(ConfigNodePropertyString linkPredatedSuffix) {
    this.linkPredatedSuffix = linkPredatedSuffix;
  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkWcmmodes(ConfigNodePropertyArray linkWcmmodes) {
    this.linkWcmmodes = linkWcmmodes;
    return this;
  }

   /**
   * Get linkWcmmodes
   * @return linkWcmmodes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getLinkWcmmodes() {
    return linkWcmmodes;
  }

  public void setLinkWcmmodes(ConfigNodePropertyArray linkWcmmodes) {
    this.linkWcmmodes = linkWcmmodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties = (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties) o;
    return Objects.equals(this.linkExpiredPrefix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkExpiredPrefix) &&
        Objects.equals(this.linkExpiredRemove, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkExpiredRemove) &&
        Objects.equals(this.linkExpiredSuffix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkExpiredSuffix) &&
        Objects.equals(this.linkInvalidPrefix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkInvalidPrefix) &&
        Objects.equals(this.linkInvalidRemove, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkInvalidRemove) &&
        Objects.equals(this.linkInvalidSuffix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkInvalidSuffix) &&
        Objects.equals(this.linkPredatedPrefix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkPredatedPrefix) &&
        Objects.equals(this.linkPredatedRemove, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkPredatedRemove) &&
        Objects.equals(this.linkPredatedSuffix, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkPredatedSuffix) &&
        Objects.equals(this.linkWcmmodes, comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.linkWcmmodes);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

