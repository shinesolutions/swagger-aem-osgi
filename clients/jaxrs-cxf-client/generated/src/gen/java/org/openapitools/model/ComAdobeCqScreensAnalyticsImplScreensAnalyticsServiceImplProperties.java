package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency;
 /**
   * Get comAdobeCqScreensAnalyticsImplUrl
   * @return comAdobeCqScreensAnalyticsImplUrl
  **/
  @JsonProperty("com.adobe.cq.screens.analytics.impl.url")
  public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplUrl() {
    return comAdobeCqScreensAnalyticsImplUrl;
  }

  public void setComAdobeCqScreensAnalyticsImplUrl(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl) {
    this.comAdobeCqScreensAnalyticsImplUrl = comAdobeCqScreensAnalyticsImplUrl;
  }

  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplUrl(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl) {
    this.comAdobeCqScreensAnalyticsImplUrl = comAdobeCqScreensAnalyticsImplUrl;
    return this;
  }

 /**
   * Get comAdobeCqScreensAnalyticsImplApikey
   * @return comAdobeCqScreensAnalyticsImplApikey
  **/
  @JsonProperty("com.adobe.cq.screens.analytics.impl.apikey")
  public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplApikey() {
    return comAdobeCqScreensAnalyticsImplApikey;
  }

  public void setComAdobeCqScreensAnalyticsImplApikey(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey) {
    this.comAdobeCqScreensAnalyticsImplApikey = comAdobeCqScreensAnalyticsImplApikey;
  }

  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplApikey(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey) {
    this.comAdobeCqScreensAnalyticsImplApikey = comAdobeCqScreensAnalyticsImplApikey;
    return this;
  }

 /**
   * Get comAdobeCqScreensAnalyticsImplProject
   * @return comAdobeCqScreensAnalyticsImplProject
  **/
  @JsonProperty("com.adobe.cq.screens.analytics.impl.project")
  public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplProject() {
    return comAdobeCqScreensAnalyticsImplProject;
  }

  public void setComAdobeCqScreensAnalyticsImplProject(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject) {
    this.comAdobeCqScreensAnalyticsImplProject = comAdobeCqScreensAnalyticsImplProject;
  }

  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplProject(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject) {
    this.comAdobeCqScreensAnalyticsImplProject = comAdobeCqScreensAnalyticsImplProject;
    return this;
  }

 /**
   * Get comAdobeCqScreensAnalyticsImplEnvironment
   * @return comAdobeCqScreensAnalyticsImplEnvironment
  **/
  @JsonProperty("com.adobe.cq.screens.analytics.impl.environment")
  public ConfigNodePropertyDropDown getComAdobeCqScreensAnalyticsImplEnvironment() {
    return comAdobeCqScreensAnalyticsImplEnvironment;
  }

  public void setComAdobeCqScreensAnalyticsImplEnvironment(ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment) {
    this.comAdobeCqScreensAnalyticsImplEnvironment = comAdobeCqScreensAnalyticsImplEnvironment;
  }

  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplEnvironment(ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment) {
    this.comAdobeCqScreensAnalyticsImplEnvironment = comAdobeCqScreensAnalyticsImplEnvironment;
    return this;
  }

 /**
   * Get comAdobeCqScreensAnalyticsImplSendFrequency
   * @return comAdobeCqScreensAnalyticsImplSendFrequency
  **/
  @JsonProperty("com.adobe.cq.screens.analytics.impl.sendFrequency")
  public ConfigNodePropertyInteger getComAdobeCqScreensAnalyticsImplSendFrequency() {
    return comAdobeCqScreensAnalyticsImplSendFrequency;
  }

  public void setComAdobeCqScreensAnalyticsImplSendFrequency(ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency) {
    this.comAdobeCqScreensAnalyticsImplSendFrequency = comAdobeCqScreensAnalyticsImplSendFrequency;
  }

  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplSendFrequency(ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency) {
    this.comAdobeCqScreensAnalyticsImplSendFrequency = comAdobeCqScreensAnalyticsImplSendFrequency;
    return this;
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
    return Objects.equals(this.comAdobeCqScreensAnalyticsImplUrl, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplUrl) &&
        Objects.equals(this.comAdobeCqScreensAnalyticsImplApikey, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplApikey) &&
        Objects.equals(this.comAdobeCqScreensAnalyticsImplProject, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplProject) &&
        Objects.equals(this.comAdobeCqScreensAnalyticsImplEnvironment, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplEnvironment) &&
        Objects.equals(this.comAdobeCqScreensAnalyticsImplSendFrequency, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.comAdobeCqScreensAnalyticsImplSendFrequency);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

