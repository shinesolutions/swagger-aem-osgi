package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
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

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties () {

  }

  public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties (ConfigNodePropertyString linkExpiredPrefix, ConfigNodePropertyBoolean linkExpiredRemove, ConfigNodePropertyString linkExpiredSuffix, ConfigNodePropertyString linkInvalidPrefix, ConfigNodePropertyBoolean linkInvalidRemove, ConfigNodePropertyString linkInvalidSuffix, ConfigNodePropertyString linkPredatedPrefix, ConfigNodePropertyBoolean linkPredatedRemove, ConfigNodePropertyString linkPredatedSuffix, ConfigNodePropertyArray linkWcmmodes) {
    this.linkExpiredPrefix = linkExpiredPrefix;
    this.linkExpiredRemove = linkExpiredRemove;
    this.linkExpiredSuffix = linkExpiredSuffix;
    this.linkInvalidPrefix = linkInvalidPrefix;
    this.linkInvalidRemove = linkInvalidRemove;
    this.linkInvalidSuffix = linkInvalidSuffix;
    this.linkPredatedPrefix = linkPredatedPrefix;
    this.linkPredatedRemove = linkPredatedRemove;
    this.linkPredatedSuffix = linkPredatedSuffix;
    this.linkWcmmodes = linkWcmmodes;
  }

    
  @JsonProperty("link.expired.prefix")
  public ConfigNodePropertyString getLinkExpiredPrefix() {
    return linkExpiredPrefix;
  }
  public void setLinkExpiredPrefix(ConfigNodePropertyString linkExpiredPrefix) {
    this.linkExpiredPrefix = linkExpiredPrefix;
  }

    
  @JsonProperty("link.expired.remove")
  public ConfigNodePropertyBoolean getLinkExpiredRemove() {
    return linkExpiredRemove;
  }
  public void setLinkExpiredRemove(ConfigNodePropertyBoolean linkExpiredRemove) {
    this.linkExpiredRemove = linkExpiredRemove;
  }

    
  @JsonProperty("link.expired.suffix")
  public ConfigNodePropertyString getLinkExpiredSuffix() {
    return linkExpiredSuffix;
  }
  public void setLinkExpiredSuffix(ConfigNodePropertyString linkExpiredSuffix) {
    this.linkExpiredSuffix = linkExpiredSuffix;
  }

    
  @JsonProperty("link.invalid.prefix")
  public ConfigNodePropertyString getLinkInvalidPrefix() {
    return linkInvalidPrefix;
  }
  public void setLinkInvalidPrefix(ConfigNodePropertyString linkInvalidPrefix) {
    this.linkInvalidPrefix = linkInvalidPrefix;
  }

    
  @JsonProperty("link.invalid.remove")
  public ConfigNodePropertyBoolean getLinkInvalidRemove() {
    return linkInvalidRemove;
  }
  public void setLinkInvalidRemove(ConfigNodePropertyBoolean linkInvalidRemove) {
    this.linkInvalidRemove = linkInvalidRemove;
  }

    
  @JsonProperty("link.invalid.suffix")
  public ConfigNodePropertyString getLinkInvalidSuffix() {
    return linkInvalidSuffix;
  }
  public void setLinkInvalidSuffix(ConfigNodePropertyString linkInvalidSuffix) {
    this.linkInvalidSuffix = linkInvalidSuffix;
  }

    
  @JsonProperty("link.predated.prefix")
  public ConfigNodePropertyString getLinkPredatedPrefix() {
    return linkPredatedPrefix;
  }
  public void setLinkPredatedPrefix(ConfigNodePropertyString linkPredatedPrefix) {
    this.linkPredatedPrefix = linkPredatedPrefix;
  }

    
  @JsonProperty("link.predated.remove")
  public ConfigNodePropertyBoolean getLinkPredatedRemove() {
    return linkPredatedRemove;
  }
  public void setLinkPredatedRemove(ConfigNodePropertyBoolean linkPredatedRemove) {
    this.linkPredatedRemove = linkPredatedRemove;
  }

    
  @JsonProperty("link.predated.suffix")
  public ConfigNodePropertyString getLinkPredatedSuffix() {
    return linkPredatedSuffix;
  }
  public void setLinkPredatedSuffix(ConfigNodePropertyString linkPredatedSuffix) {
    this.linkPredatedSuffix = linkPredatedSuffix;
  }

    
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
