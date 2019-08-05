package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
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

  /**
   **/
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredPrefix(ConfigNodePropertyString linkExpiredPrefix) {
    this.linkExpiredPrefix = linkExpiredPrefix;
    return this;
  }

  
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
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredRemove(ConfigNodePropertyBoolean linkExpiredRemove) {
    this.linkExpiredRemove = linkExpiredRemove;
    return this;
  }

  
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
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkExpiredSuffix(ConfigNodePropertyString linkExpiredSuffix) {
    this.linkExpiredSuffix = linkExpiredSuffix;
    return this;
  }

  
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
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidPrefix(ConfigNodePropertyString linkInvalidPrefix) {
    this.linkInvalidPrefix = linkInvalidPrefix;
    return this;
  }

  
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
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidRemove(ConfigNodePropertyBoolean linkInvalidRemove) {
    this.linkInvalidRemove = linkInvalidRemove;
    return this;
  }

  
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
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkInvalidSuffix(ConfigNodePropertyString linkInvalidSuffix) {
    this.linkInvalidSuffix = linkInvalidSuffix;
    return this;
  }

  
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
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedPrefix(ConfigNodePropertyString linkPredatedPrefix) {
    this.linkPredatedPrefix = linkPredatedPrefix;
    return this;
  }

  
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
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedRemove(ConfigNodePropertyBoolean linkPredatedRemove) {
    this.linkPredatedRemove = linkPredatedRemove;
    return this;
  }

  
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
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkPredatedSuffix(ConfigNodePropertyString linkPredatedSuffix) {
    this.linkPredatedSuffix = linkPredatedSuffix;
    return this;
  }

  
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
  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties linkWcmmodes(ConfigNodePropertyArray linkWcmmodes) {
    this.linkWcmmodes = linkWcmmodes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("link.wcmmodes")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

