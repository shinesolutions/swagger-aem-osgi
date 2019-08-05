package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties   {
  
  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl = null;

  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey = null;

  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject = null;

  private ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment = null;

  private ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency = null;


  /**
   **/
  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplUrl(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl) {
    this.comAdobeCqScreensAnalyticsImplUrl = comAdobeCqScreensAnalyticsImplUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.screens.analytics.impl.url")
  public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplUrl() {
    return comAdobeCqScreensAnalyticsImplUrl;
  }
  public void setComAdobeCqScreensAnalyticsImplUrl(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl) {
    this.comAdobeCqScreensAnalyticsImplUrl = comAdobeCqScreensAnalyticsImplUrl;
  }


  /**
   **/
  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplApikey(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey) {
    this.comAdobeCqScreensAnalyticsImplApikey = comAdobeCqScreensAnalyticsImplApikey;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.screens.analytics.impl.apikey")
  public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplApikey() {
    return comAdobeCqScreensAnalyticsImplApikey;
  }
  public void setComAdobeCqScreensAnalyticsImplApikey(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey) {
    this.comAdobeCqScreensAnalyticsImplApikey = comAdobeCqScreensAnalyticsImplApikey;
  }


  /**
   **/
  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplProject(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject) {
    this.comAdobeCqScreensAnalyticsImplProject = comAdobeCqScreensAnalyticsImplProject;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.screens.analytics.impl.project")
  public ConfigNodePropertyString getComAdobeCqScreensAnalyticsImplProject() {
    return comAdobeCqScreensAnalyticsImplProject;
  }
  public void setComAdobeCqScreensAnalyticsImplProject(ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject) {
    this.comAdobeCqScreensAnalyticsImplProject = comAdobeCqScreensAnalyticsImplProject;
  }


  /**
   **/
  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplEnvironment(ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment) {
    this.comAdobeCqScreensAnalyticsImplEnvironment = comAdobeCqScreensAnalyticsImplEnvironment;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.screens.analytics.impl.environment")
  public ConfigNodePropertyDropDown getComAdobeCqScreensAnalyticsImplEnvironment() {
    return comAdobeCqScreensAnalyticsImplEnvironment;
  }
  public void setComAdobeCqScreensAnalyticsImplEnvironment(ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment) {
    this.comAdobeCqScreensAnalyticsImplEnvironment = comAdobeCqScreensAnalyticsImplEnvironment;
  }


  /**
   **/
  public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties comAdobeCqScreensAnalyticsImplSendFrequency(ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency) {
    this.comAdobeCqScreensAnalyticsImplSendFrequency = comAdobeCqScreensAnalyticsImplSendFrequency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.screens.analytics.impl.sendFrequency")
  public ConfigNodePropertyInteger getComAdobeCqScreensAnalyticsImplSendFrequency() {
    return comAdobeCqScreensAnalyticsImplSendFrequency;
  }
  public void setComAdobeCqScreensAnalyticsImplSendFrequency(ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency) {
    this.comAdobeCqScreensAnalyticsImplSendFrequency = comAdobeCqScreensAnalyticsImplSendFrequency;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

