/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties   {
  
  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplUrl;
  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplApikey;
  private ConfigNodePropertyString comAdobeCqScreensAnalyticsImplProject;
  private ConfigNodePropertyDropDown comAdobeCqScreensAnalyticsImplEnvironment;
  private ConfigNodePropertyInteger comAdobeCqScreensAnalyticsImplSendFrequency;

  /**
   */
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
   */
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
   */
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
   */
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
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

