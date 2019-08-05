package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplServletResourceCollectionServletProperties   {
  
  private ConfigNodePropertyArray slingServletResourceTypes = null;
  private ConfigNodePropertyString slingServletMethods = null;
  private ConfigNodePropertyString slingServletSelectors = null;
  private ConfigNodePropertyString downloadConfig = null;
  private ConfigNodePropertyString viewSelector = null;
  private ConfigNodePropertyBoolean sendEmail = null;

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties () {

  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties (ConfigNodePropertyArray slingServletResourceTypes, ConfigNodePropertyString slingServletMethods, ConfigNodePropertyString slingServletSelectors, ConfigNodePropertyString downloadConfig, ConfigNodePropertyString viewSelector, ConfigNodePropertyBoolean sendEmail) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    this.slingServletMethods = slingServletMethods;
    this.slingServletSelectors = slingServletSelectors;
    this.downloadConfig = downloadConfig;
    this.viewSelector = viewSelector;
    this.sendEmail = sendEmail;
  }

    
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }
  public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

    
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }
  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

    
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }
  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

    
  @JsonProperty("download.config")
  public ConfigNodePropertyString getDownloadConfig() {
    return downloadConfig;
  }
  public void setDownloadConfig(ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
  }

    
  @JsonProperty("view.selector")
  public ConfigNodePropertyString getViewSelector() {
    return viewSelector;
  }
  public void setViewSelector(ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
  }

    
  @JsonProperty("send_email")
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }
  public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletResourceCollectionServletProperties comDayCqDamCoreImplServletResourceCollectionServletProperties = (ComDayCqDamCoreImplServletResourceCollectionServletProperties) o;
    return Objects.equals(slingServletResourceTypes, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletResourceTypes) &&
        Objects.equals(slingServletMethods, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletMethods) &&
        Objects.equals(slingServletSelectors, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletSelectors) &&
        Objects.equals(downloadConfig, comDayCqDamCoreImplServletResourceCollectionServletProperties.downloadConfig) &&
        Objects.equals(viewSelector, comDayCqDamCoreImplServletResourceCollectionServletProperties.viewSelector) &&
        Objects.equals(sendEmail, comDayCqDamCoreImplServletResourceCollectionServletProperties.sendEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletResourceTypes, slingServletMethods, slingServletSelectors, downloadConfig, viewSelector, sendEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletResourceCollectionServletProperties {\n");
    
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    downloadConfig: ").append(toIndentedString(downloadConfig)).append("\n");
    sb.append("    viewSelector: ").append(toIndentedString(viewSelector)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
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
