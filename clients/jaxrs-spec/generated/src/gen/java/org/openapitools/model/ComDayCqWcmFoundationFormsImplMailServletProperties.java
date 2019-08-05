package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmFoundationFormsImplMailServletProperties   {
  
  private @Valid ConfigNodePropertyString slingServletResourceTypes = null;
  private @Valid ConfigNodePropertyString slingServletSelectors = null;
  private @Valid ConfigNodePropertyArray resourceWhitelist = null;
  private @Valid ConfigNodePropertyString resourceBlacklist = null;

  /**
   **/
  public ComDayCqWcmFoundationFormsImplMailServletProperties slingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }
  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  /**
   **/
  public ComDayCqWcmFoundationFormsImplMailServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }
  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  /**
   **/
  public ComDayCqWcmFoundationFormsImplMailServletProperties resourceWhitelist(ConfigNodePropertyArray resourceWhitelist) {
    this.resourceWhitelist = resourceWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.whitelist")
  public ConfigNodePropertyArray getResourceWhitelist() {
    return resourceWhitelist;
  }
  public void setResourceWhitelist(ConfigNodePropertyArray resourceWhitelist) {
    this.resourceWhitelist = resourceWhitelist;
  }

  /**
   **/
  public ComDayCqWcmFoundationFormsImplMailServletProperties resourceBlacklist(ConfigNodePropertyString resourceBlacklist) {
    this.resourceBlacklist = resourceBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resource.blacklist")
  public ConfigNodePropertyString getResourceBlacklist() {
    return resourceBlacklist;
  }
  public void setResourceBlacklist(ConfigNodePropertyString resourceBlacklist) {
    this.resourceBlacklist = resourceBlacklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationFormsImplMailServletProperties comDayCqWcmFoundationFormsImplMailServletProperties = (ComDayCqWcmFoundationFormsImplMailServletProperties) o;
    return Objects.equals(slingServletResourceTypes, comDayCqWcmFoundationFormsImplMailServletProperties.slingServletResourceTypes) &&
        Objects.equals(slingServletSelectors, comDayCqWcmFoundationFormsImplMailServletProperties.slingServletSelectors) &&
        Objects.equals(resourceWhitelist, comDayCqWcmFoundationFormsImplMailServletProperties.resourceWhitelist) &&
        Objects.equals(resourceBlacklist, comDayCqWcmFoundationFormsImplMailServletProperties.resourceBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletResourceTypes, slingServletSelectors, resourceWhitelist, resourceBlacklist);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

