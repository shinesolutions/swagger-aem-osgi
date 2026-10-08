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
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplWCMDebugFilterProperties   {
  
  private ConfigNodePropertyBoolean wcmdbgfilterEnabled;
  private ConfigNodePropertyBoolean wcmdbgfilterJspDebug;

  /**
   */
  public ComDayCqWcmCoreImplWCMDebugFilterProperties wcmdbgfilterEnabled(ConfigNodePropertyBoolean wcmdbgfilterEnabled) {
    this.wcmdbgfilterEnabled = wcmdbgfilterEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("wcmdbgfilter.enabled")
  public ConfigNodePropertyBoolean getWcmdbgfilterEnabled() {
    return wcmdbgfilterEnabled;
  }
  public void setWcmdbgfilterEnabled(ConfigNodePropertyBoolean wcmdbgfilterEnabled) {
    this.wcmdbgfilterEnabled = wcmdbgfilterEnabled;
  }

  /**
   */
  public ComDayCqWcmCoreImplWCMDebugFilterProperties wcmdbgfilterJspDebug(ConfigNodePropertyBoolean wcmdbgfilterJspDebug) {
    this.wcmdbgfilterJspDebug = wcmdbgfilterJspDebug;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("wcmdbgfilter.jspDebug")
  public ConfigNodePropertyBoolean getWcmdbgfilterJspDebug() {
    return wcmdbgfilterJspDebug;
  }
  public void setWcmdbgfilterJspDebug(ConfigNodePropertyBoolean wcmdbgfilterJspDebug) {
    this.wcmdbgfilterJspDebug = wcmdbgfilterJspDebug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWCMDebugFilterProperties comDayCqWcmCoreImplWCMDebugFilterProperties = (ComDayCqWcmCoreImplWCMDebugFilterProperties) o;
    return Objects.equals(wcmdbgfilterEnabled, comDayCqWcmCoreImplWCMDebugFilterProperties.wcmdbgfilterEnabled) &&
        Objects.equals(wcmdbgfilterJspDebug, comDayCqWcmCoreImplWCMDebugFilterProperties.wcmdbgfilterJspDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmdbgfilterEnabled, wcmdbgfilterJspDebug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWCMDebugFilterProperties {\n");
    
    sb.append("    wcmdbgfilterEnabled: ").append(toIndentedString(wcmdbgfilterEnabled)).append("\n");
    sb.append("    wcmdbgfilterJspDebug: ").append(toIndentedString(wcmdbgfilterJspDebug)).append("\n");
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

