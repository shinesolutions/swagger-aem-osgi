package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmFoundationFormsImplMailServletProperties   {
  
  private ConfigNodePropertyString slingServletResourceTypes = null;
  private ConfigNodePropertyString slingServletSelectors = null;
  private ConfigNodePropertyArray resourceWhitelist = null;
  private ConfigNodePropertyString resourceBlacklist = null;

  public ComDayCqWcmFoundationFormsImplMailServletProperties () {

  }

  public ComDayCqWcmFoundationFormsImplMailServletProperties (ConfigNodePropertyString slingServletResourceTypes, ConfigNodePropertyString slingServletSelectors, ConfigNodePropertyArray resourceWhitelist, ConfigNodePropertyString resourceBlacklist) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    this.slingServletSelectors = slingServletSelectors;
    this.resourceWhitelist = resourceWhitelist;
    this.resourceBlacklist = resourceBlacklist;
  }

    
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }
  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

    
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }
  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

    
  @JsonProperty("resource.whitelist")
  public ConfigNodePropertyArray getResourceWhitelist() {
    return resourceWhitelist;
  }
  public void setResourceWhitelist(ConfigNodePropertyArray resourceWhitelist) {
    this.resourceWhitelist = resourceWhitelist;
  }

    
  @JsonProperty("resource.blacklist")
  public ConfigNodePropertyString getResourceBlacklist() {
    return resourceBlacklist;
  }
  public void setResourceBlacklist(ConfigNodePropertyString resourceBlacklist) {
    this.resourceBlacklist = resourceBlacklist;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
