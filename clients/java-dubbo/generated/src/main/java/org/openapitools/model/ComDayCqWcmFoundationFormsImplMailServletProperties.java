package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmFoundationFormsImplMailServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sling.servlet.resourceTypes")
  private ConfigNodePropertyString slingServletResourceTypes;

  @JsonProperty("sling.servlet.selectors")
  private ConfigNodePropertyString slingServletSelectors;

  @JsonProperty("resource.whitelist")
  private ConfigNodePropertyArray resourceWhitelist;

  @JsonProperty("resource.blacklist")
  private ConfigNodePropertyString resourceBlacklist;

  /**
   * 
   * @return slingServletResourceTypes
   */
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  /**
   * 
   * @return slingServletSelectors
   */
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  /**
   * 
   * @return resourceWhitelist
   */
  public ConfigNodePropertyArray getResourceWhitelist() {
    return resourceWhitelist;
  }

  public void setResourceWhitelist(ConfigNodePropertyArray resourceWhitelist) {
    this.resourceWhitelist = resourceWhitelist;
  }

  /**
   * 
   * @return resourceBlacklist
   */
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
    return Objects.equals(this.slingServletResourceTypes, comDayCqWcmFoundationFormsImplMailServletProperties.slingServletResourceTypes) &&
        Objects.equals(this.slingServletSelectors, comDayCqWcmFoundationFormsImplMailServletProperties.slingServletSelectors) &&
        Objects.equals(this.resourceWhitelist, comDayCqWcmFoundationFormsImplMailServletProperties.resourceWhitelist) &&
        Objects.equals(this.resourceBlacklist, comDayCqWcmFoundationFormsImplMailServletProperties.resourceBlacklist);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
