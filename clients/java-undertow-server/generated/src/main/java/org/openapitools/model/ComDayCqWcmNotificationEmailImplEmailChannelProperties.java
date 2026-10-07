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
public class ComDayCqWcmNotificationEmailImplEmailChannelProperties   {
  
  private ConfigNodePropertyString emailFrom;

  /**
   */
  public ComDayCqWcmNotificationEmailImplEmailChannelProperties emailFrom(ConfigNodePropertyString emailFrom) {
    this.emailFrom = emailFrom;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.from")
  public ConfigNodePropertyString getEmailFrom() {
    return emailFrom;
  }
  public void setEmailFrom(ConfigNodePropertyString emailFrom) {
    this.emailFrom = emailFrom;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmNotificationEmailImplEmailChannelProperties comDayCqWcmNotificationEmailImplEmailChannelProperties = (ComDayCqWcmNotificationEmailImplEmailChannelProperties) o;
    return Objects.equals(emailFrom, comDayCqWcmNotificationEmailImplEmailChannelProperties.emailFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmNotificationEmailImplEmailChannelProperties {\n");
    
    sb.append("    emailFrom: ").append(toIndentedString(emailFrom)).append("\n");
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

