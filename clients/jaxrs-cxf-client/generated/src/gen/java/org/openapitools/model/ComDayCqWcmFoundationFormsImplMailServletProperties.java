package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmFoundationFormsImplMailServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingServletResourceTypes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingServletSelectors = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray resourceWhitelist = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString resourceBlacklist = null;
 /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
  **/
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqWcmFoundationFormsImplMailServletProperties slingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

 /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComDayCqWcmFoundationFormsImplMailServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

 /**
   * Get resourceWhitelist
   * @return resourceWhitelist
  **/
  @JsonProperty("resource.whitelist")
  public ConfigNodePropertyArray getResourceWhitelist() {
    return resourceWhitelist;
  }

  public void setResourceWhitelist(ConfigNodePropertyArray resourceWhitelist) {
    this.resourceWhitelist = resourceWhitelist;
  }

  public ComDayCqWcmFoundationFormsImplMailServletProperties resourceWhitelist(ConfigNodePropertyArray resourceWhitelist) {
    this.resourceWhitelist = resourceWhitelist;
    return this;
  }

 /**
   * Get resourceBlacklist
   * @return resourceBlacklist
  **/
  @JsonProperty("resource.blacklist")
  public ConfigNodePropertyString getResourceBlacklist() {
    return resourceBlacklist;
  }

  public void setResourceBlacklist(ConfigNodePropertyString resourceBlacklist) {
    this.resourceBlacklist = resourceBlacklist;
  }

  public ComDayCqWcmFoundationFormsImplMailServletProperties resourceBlacklist(ConfigNodePropertyString resourceBlacklist) {
    this.resourceBlacklist = resourceBlacklist;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationFormsImplMailServletProperties {\n");
    
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    resourceWhitelist: ").append(toIndentedString(resourceWhitelist)).append("\n");
    sb.append("    resourceBlacklist: ").append(toIndentedString(resourceBlacklist)).append("\n");
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

