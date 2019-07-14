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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeCqDtmReactorImplServiceWebServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties {
  public static final String SERIALIZED_NAME_ENDPOINT_URI = "endpointUri";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_URI)
  private ConfigNodePropertyString endpointUri = null;

  public static final String SERIALIZED_NAME_CONNECTION_TIMEOUT = "connectionTimeout";
  @SerializedName(SERIALIZED_NAME_CONNECTION_TIMEOUT)
  private ConfigNodePropertyInteger connectionTimeout = null;

  public static final String SERIALIZED_NAME_SOCKET_TIMEOUT = "socketTimeout";
  @SerializedName(SERIALIZED_NAME_SOCKET_TIMEOUT)
  private ConfigNodePropertyInteger socketTimeout = null;

  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties endpointUri(ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
    return this;
  }

   /**
   * Get endpointUri
   * @return endpointUri
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getEndpointUri() {
    return endpointUri;
  }

  public void setEndpointUri(ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
  }

  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

   /**
   * Get connectionTimeout
   * @return connectionTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

   /**
   * Get socketTimeout
   * @return socketTimeout
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDtmReactorImplServiceWebServiceImplProperties comAdobeCqDtmReactorImplServiceWebServiceImplProperties = (ComAdobeCqDtmReactorImplServiceWebServiceImplProperties) o;
    return Objects.equals(this.endpointUri, comAdobeCqDtmReactorImplServiceWebServiceImplProperties.endpointUri) &&
        Objects.equals(this.connectionTimeout, comAdobeCqDtmReactorImplServiceWebServiceImplProperties.connectionTimeout) &&
        Objects.equals(this.socketTimeout, comAdobeCqDtmReactorImplServiceWebServiceImplProperties.socketTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointUri, connectionTimeout, socketTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties {\n");
    sb.append("    endpointUri: ").append(toIndentedString(endpointUri)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("    socketTimeout: ").append(toIndentedString(socketTimeout)).append("\n");
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

