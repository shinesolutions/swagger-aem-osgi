package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqWcmFoundationFormsImplMailServletProperties   {
  
  private ConfigNodePropertyString slingServletResourceTypes = null;
  private ConfigNodePropertyString slingServletSelectors = null;
  private ConfigNodePropertyArray resourceWhitelist = null;
  private ConfigNodePropertyString resourceBlacklist = null;

  /**
   **/
  
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

