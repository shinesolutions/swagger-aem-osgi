package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties   {
  
  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl = null;
  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey = null;
  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject = null;
  private ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment = null;
  private ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency = null;

  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties () {

  }

  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties (ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl, ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey, ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject, ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment, ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency) {
    this.comAdobeCqScreensAnalyticsImplUrl = comAdobeCqScreensAnalyticsImplUrl;
    this.comAdobeCqScreensAnalyticsImplApikey = comAdobeCqScreensAnalyticsImplApikey;
    this.comAdobeCqScreensAnalyticsImplProject = comAdobeCqScreensAnalyticsImplProject;
    this.comAdobeCqScreensAnalyticsImplEnvironment = comAdobeCqScreensAnalyticsImplEnvironment;
    this.comAdobeCqScreensAnalyticsImplSendFrequency = comAdobeCqScreensAnalyticsImplSendFrequency;
  }

    
  @JsonProperty("com.adobe.cq.screens.analytics.impl.url")
  public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplUrl() {
    return comAdobeCqScreensAnalyticsImplUrl;
  }
  public void setComAdobeCqScreensAnalyticsImplUrl(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl) {
    this.comAdobeCqScreensAnalyticsImplUrl = comAdobeCqScreensAnalyticsImplUrl;
  }

    
  @JsonProperty("com.adobe.cq.screens.analytics.impl.apikey")
  public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplApikey() {
    return comAdobeCqScreensAnalyticsImplApikey;
  }
  public void setComAdobeCqScreensAnalyticsImplApikey(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey) {
    this.comAdobeCqScreensAnalyticsImplApikey = comAdobeCqScreensAnalyticsImplApikey;
  }

    
  @JsonProperty("com.adobe.cq.screens.analytics.impl.project")
  public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplProject() {
    return comAdobeCqScreensAnalyticsImplProject;
  }
  public void setComAdobeCqScreensAnalyticsImplProject(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject) {
    this.comAdobeCqScreensAnalyticsImplProject = comAdobeCqScreensAnalyticsImplProject;
  }

    
  @JsonProperty("com.adobe.cq.screens.analytics.impl.environment")
  public ConfigNodePropertyDropDown getComAdobeCqScreensAnalyticsImplEnvironment() {
    return comAdobeCqScreensAnalyticsImplEnvironment;
  }
  public void setComAdobeCqScreensAnalyticsImplEnvironment(ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment) {
    this.comAdobeCqScreensAnalyticsImplEnvironment = comAdobeCqScreensAnalyticsImplEnvironment;
  }

    
  @JsonProperty("com.adobe.cq.screens.analytics.impl.sendFrequency")
  public ConfigNodePropertyInteger getComAdobeCqScreensAnalyticsImplSendFrequency() {
    return comAdobeCqScreensAnalyticsImplSendFrequency;
  }
  public void setComAdobeCqScreensAnalyticsImplSendFrequency(ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency) {
    this.comAdobeCqScreensAnalyticsImplSendFrequency = comAdobeCqScreensAnalyticsImplSendFrequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties = (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties) o;
    return Objects.equals(comAdobeCqScreensAnalyticsImplUrl, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplUrl) &&
        Objects.equals(comAdobeCqScreensAnalyticsImplApikey, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplApikey) &&
        Objects.equals(comAdobeCqScreensAnalyticsImplProject, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplProject) &&
        Objects.equals(comAdobeCqScreensAnalyticsImplEnvironment, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplEnvironment) &&
        Objects.equals(comAdobeCqScreensAnalyticsImplSendFrequency, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplSendFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeCqScreensAnalyticsImplUrl, comAdobeCqScreensAnalyticsImplApikey, comAdobeCqScreensAnalyticsImplProject, comAdobeCqScreensAnalyticsImplEnvironment, comAdobeCqScreensAnalyticsImplSendFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties {\n");
    
    sb.append("    comAdobeCqScreensAnalyticsImplUrl: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplUrl)).append("\n");
    sb.append("    comAdobeCqScreensAnalyticsImplApikey: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplApikey)).append("\n");
    sb.append("    comAdobeCqScreensAnalyticsImplProject: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplProject)).append("\n");
    sb.append("    comAdobeCqScreensAnalyticsImplEnvironment: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplEnvironment)).append("\n");
    sb.append("    comAdobeCqScreensAnalyticsImplSendFrequency: ").append(toIndentedString(comAdobeCqScreensAnalyticsImplSendFrequency)).append("\n");
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
