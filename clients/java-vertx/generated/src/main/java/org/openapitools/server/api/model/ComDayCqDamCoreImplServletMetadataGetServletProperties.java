package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplServletMetadataGetServletProperties   {
  
  private ConfigNodePropertyString slingServletResourceTypes = null;
  private ConfigNodePropertyString slingServletMethods = null;
  private ConfigNodePropertyString slingServletExtensions = null;
  private ConfigNodePropertyString slingServletSelectors = null;

  public ComDayCqDamCoreImplServletMetadataGetServletProperties () {

  }

  public ComDayCqDamCoreImplServletMetadataGetServletProperties (ConfigNodePropertyString slingServletResourceTypes, ConfigNodePropertyString slingServletMethods, ConfigNodePropertyString slingServletExtensions, ConfigNodePropertyString slingServletSelectors) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    this.slingServletMethods = slingServletMethods;
    this.slingServletExtensions = slingServletExtensions;
    this.slingServletSelectors = slingServletSelectors;
  }

    
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }
  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

    
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }
  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

    
  @JsonProperty("sling.servlet.extensions")
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }
  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }

    
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }
  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletMetadataGetServletProperties comDayCqDamCoreImplServletMetadataGetServletProperties = (ComDayCqDamCoreImplServletMetadataGetServletProperties) o;
    return Objects.equals(slingServletResourceTypes, comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletResourceTypes) &&
        Objects.equals(slingServletMethods, comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletMethods) &&
        Objects.equals(slingServletExtensions, comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletExtensions) &&
        Objects.equals(slingServletSelectors, comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletResourceTypes, slingServletMethods, slingServletExtensions, slingServletSelectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletMetadataGetServletProperties {\n");
    
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
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
