package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString cqSearchpromoteConfigurationServerUri;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger connectionTimeout;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger socketTimeout;
 /**
   * Get cqSearchpromoteConfigurationServerUri
   * @return cqSearchpromoteConfigurationServerUri
  **/
  @JsonProperty("cq.searchpromote.configuration.server.uri")
  public ConfigNodePropertyString getCqSearchpromoteConfigurationServerUri() {
    return cqSearchpromoteConfigurationServerUri;
  }

  public void setCqSearchpromoteConfigurationServerUri(ConfigNodePropertyString cqSearchpromoteConfigurationServerUri) {
    this.cqSearchpromoteConfigurationServerUri = cqSearchpromoteConfigurationServerUri;
  }

  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties cqSearchpromoteConfigurationServerUri(ConfigNodePropertyString cqSearchpromoteConfigurationServerUri) {
    this.cqSearchpromoteConfigurationServerUri = cqSearchpromoteConfigurationServerUri;
    return this;
  }

 /**
   * Get cqSearchpromoteConfigurationEnvironment
   * @return cqSearchpromoteConfigurationEnvironment
  **/
  @JsonProperty("cq.searchpromote.configuration.environment")
  public ConfigNodePropertyString getCqSearchpromoteConfigurationEnvironment() {
    return cqSearchpromoteConfigurationEnvironment;
  }

  public void setCqSearchpromoteConfigurationEnvironment(ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment) {
    this.cqSearchpromoteConfigurationEnvironment = cqSearchpromoteConfigurationEnvironment;
  }

  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties cqSearchpromoteConfigurationEnvironment(ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment) {
    this.cqSearchpromoteConfigurationEnvironment = cqSearchpromoteConfigurationEnvironment;
    return this;
  }

 /**
   * Get connectionTimeout
   * @return connectionTimeout
  **/
  @JsonProperty("connection.timeout")
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

 /**
   * Get socketTimeout
   * @return socketTimeout
  **/
  @JsonProperty("socket.timeout")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
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
    ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties comDayCqSearchpromoteImplSearchPromoteServiceImplProperties = (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties) o;
    return Objects.equals(this.cqSearchpromoteConfigurationServerUri, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties.cqSearchpromoteConfigurationServerUri) &&
        Objects.equals(this.cqSearchpromoteConfigurationEnvironment, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties.cqSearchpromoteConfigurationEnvironment) &&
        Objects.equals(this.connectionTimeout, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties.connectionTimeout) &&
        Objects.equals(this.socketTimeout, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties.socketTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqSearchpromoteConfigurationServerUri, cqSearchpromoteConfigurationEnvironment, connectionTimeout, socketTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties {\n");
    
    sb.append("    cqSearchpromoteConfigurationServerUri: ").append(toIndentedString(cqSearchpromoteConfigurationServerUri)).append("\n");
    sb.append("    cqSearchpromoteConfigurationEnvironment: ").append(toIndentedString(cqSearchpromoteConfigurationEnvironment)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("    socketTimeout: ").append(toIndentedString(socketTimeout)).append("\n");
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

