package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmFoundationFormsImplMailServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmFoundationFormsImplMailServletProperties   {
  @JsonProperty("sling.servlet.resourceTypes")
  private ConfigNodePropertyString slingServletResourceTypes = null;

  @JsonProperty("sling.servlet.selectors")
  private ConfigNodePropertyString slingServletSelectors = null;

  @JsonProperty("resource.whitelist")
  private ConfigNodePropertyArray resourceWhitelist = null;

  @JsonProperty("resource.blacklist")
  private ConfigNodePropertyString resourceBlacklist = null;

  public ComDayCqWcmFoundationFormsImplMailServletProperties slingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

   /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
  **/
  @Valid
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqWcmFoundationFormsImplMailServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

   /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @Valid
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComDayCqWcmFoundationFormsImplMailServletProperties resourceWhitelist(ConfigNodePropertyArray resourceWhitelist) {
    this.resourceWhitelist = resourceWhitelist;
    return this;
  }

   /**
   * Get resourceWhitelist
   * @return resourceWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getResourceWhitelist() {
    return resourceWhitelist;
  }

  public void setResourceWhitelist(ConfigNodePropertyArray resourceWhitelist) {
    this.resourceWhitelist = resourceWhitelist;
  }

  public ComDayCqWcmFoundationFormsImplMailServletProperties resourceBlacklist(ConfigNodePropertyString resourceBlacklist) {
    this.resourceBlacklist = resourceBlacklist;
    return this;
  }

   /**
   * Get resourceBlacklist
   * @return resourceBlacklist
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

