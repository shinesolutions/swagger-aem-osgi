/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {
  public static final String SERIALIZED_NAME_DEFAULT_TIMEOUT = "default.timeout";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TIMEOUT)
  private ConfigNodePropertyInteger defaultTimeout = null;

  public static final String SERIALIZED_NAME_MAX_TIMEOUT = "max.timeout";
  @SerializedName(SERIALIZED_NAME_MAX_TIMEOUT)
  private ConfigNodePropertyInteger maxTimeout = null;

  public static final String SERIALIZED_NAME_DEFAULT_PERIOD = "default.period";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PERIOD)
  private ConfigNodePropertyInteger defaultPeriod = null;

  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties defaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
    this.defaultTimeout = defaultTimeout;
    return this;
  }

   /**
   * Get defaultTimeout
   * @return defaultTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getDefaultTimeout() {
    return defaultTimeout;
  }

  public void setDefaultTimeout(ConfigNodePropertyInteger defaultTimeout) {
    this.defaultTimeout = defaultTimeout;
  }

  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties maxTimeout(ConfigNodePropertyInteger maxTimeout) {
    this.maxTimeout = maxTimeout;
    return this;
  }

   /**
   * Get maxTimeout
   * @return maxTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxTimeout() {
    return maxTimeout;
  }

  public void setMaxTimeout(ConfigNodePropertyInteger maxTimeout) {
    this.maxTimeout = maxTimeout;
  }

  public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties defaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
    return this;
  }

   /**
   * Get defaultPeriod
   * @return defaultPeriod
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getDefaultPeriod() {
    return defaultPeriod;
  }

  public void setDefaultPeriod(ConfigNodePropertyInteger defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties = (ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties) o;
    return Objects.equals(this.defaultTimeout, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.defaultTimeout) &&
        Objects.equals(this.maxTimeout, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.maxTimeout) &&
        Objects.equals(this.defaultPeriod, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.defaultPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTimeout, maxTimeout, defaultPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {\n");
    sb.append("    defaultTimeout: ").append(toIndentedString(defaultTimeout)).append("\n");
    sb.append("    maxTimeout: ").append(toIndentedString(maxTimeout)).append("\n");
    sb.append("    defaultPeriod: ").append(toIndentedString(defaultPeriod)).append("\n");
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

