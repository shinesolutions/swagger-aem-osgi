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
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMailerImplCqMailingServiceProperties   {
  
  private ConfigNodePropertyString maxRecipientCount;

  /**
   */
  public ComDayCqMailerImplCqMailingServiceProperties maxRecipientCount(ConfigNodePropertyString maxRecipientCount) {
    this.maxRecipientCount = maxRecipientCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.recipient.count")
  public ConfigNodePropertyString getMaxRecipientCount() {
    return maxRecipientCount;
  }
  public void setMaxRecipientCount(ConfigNodePropertyString maxRecipientCount) {
    this.maxRecipientCount = maxRecipientCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMailerImplCqMailingServiceProperties comDayCqMailerImplCqMailingServiceProperties = (ComDayCqMailerImplCqMailingServiceProperties) o;
    return Objects.equals(maxRecipientCount, comDayCqMailerImplCqMailingServiceProperties.maxRecipientCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRecipientCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMailerImplCqMailingServiceProperties {\n");
    
    sb.append("    maxRecipientCount: ").append(toIndentedString(maxRecipientCount)).append("\n");
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

