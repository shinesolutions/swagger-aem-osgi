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
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialGroupImplGroupServiceImplProperties   {
  
  private ConfigNodePropertyInteger maxWaitTime;
  private ConfigNodePropertyInteger minWaitBetweenRetries;

  /**
   */
  public ComAdobeCqSocialGroupImplGroupServiceImplProperties maxWaitTime(ConfigNodePropertyInteger maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxWaitTime")
  public ConfigNodePropertyInteger getMaxWaitTime() {
    return maxWaitTime;
  }
  public void setMaxWaitTime(ConfigNodePropertyInteger maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
  }

  /**
   */
  public ComAdobeCqSocialGroupImplGroupServiceImplProperties minWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("minWaitBetweenRetries")
  public ConfigNodePropertyInteger getMinWaitBetweenRetries() {
    return minWaitBetweenRetries;
  }
  public void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialGroupImplGroupServiceImplProperties comAdobeCqSocialGroupImplGroupServiceImplProperties = (ComAdobeCqSocialGroupImplGroupServiceImplProperties) o;
    return Objects.equals(maxWaitTime, comAdobeCqSocialGroupImplGroupServiceImplProperties.maxWaitTime) &&
        Objects.equals(minWaitBetweenRetries, comAdobeCqSocialGroupImplGroupServiceImplProperties.minWaitBetweenRetries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWaitTime, minWaitBetweenRetries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialGroupImplGroupServiceImplProperties {\n");
    
    sb.append("    maxWaitTime: ").append(toIndentedString(maxWaitTime)).append("\n");
    sb.append("    minWaitBetweenRetries: ").append(toIndentedString(minWaitBetweenRetries)).append("\n");
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

