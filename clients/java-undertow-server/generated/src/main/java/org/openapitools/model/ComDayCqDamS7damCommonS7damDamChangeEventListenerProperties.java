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
public class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties   {
  
  private ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled;

  /**
   */
  public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties cqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled) {
    this.cqDamS7damDamchangeeventlistenerEnabled = cqDamS7damDamchangeeventlistenerEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.s7dam.damchangeeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqDamS7damDamchangeeventlistenerEnabled() {
    return cqDamS7damDamchangeeventlistenerEnabled;
  }
  public void setCqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled) {
    this.cqDamS7damDamchangeeventlistenerEnabled = cqDamS7damDamchangeeventlistenerEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties comDayCqDamS7damCommonS7damDamChangeEventListenerProperties = (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties) o;
    return Objects.equals(cqDamS7damDamchangeeventlistenerEnabled, comDayCqDamS7damCommonS7damDamChangeEventListenerProperties.cqDamS7damDamchangeeventlistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamS7damDamchangeeventlistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties {\n");
    
    sb.append("    cqDamS7damDamchangeeventlistenerEnabled: ").append(toIndentedString(cqDamS7damDamchangeeventlistenerEnabled)).append("\n");
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

