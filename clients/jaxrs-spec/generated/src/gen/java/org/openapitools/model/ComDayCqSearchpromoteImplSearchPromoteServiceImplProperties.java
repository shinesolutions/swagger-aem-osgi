package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqSearchpromoteImplSearchPromoteServiceImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties   {
  private ConfigNodePropertyString cqSearchpromoteConfigurationServerUri;
  private ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment;
  private ConfigNodePropertyInteger connectionTimeout;
  private ConfigNodePropertyInteger socketTimeout;

  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties() {
  }

  /**
   **/
  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties cqSearchpromoteConfigurationServerUri(ConfigNodePropertyString cqSearchpromoteConfigurationServerUri) {
    this.cqSearchpromoteConfigurationServerUri = cqSearchpromoteConfigurationServerUri;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.searchpromote.configuration.server.uri")
  @Valid public ConfigNodePropertyString getCqSearchpromoteConfigurationServerUri() {
    return cqSearchpromoteConfigurationServerUri;
  }

  @JsonProperty("cq.searchpromote.configuration.server.uri")
  public void setCqSearchpromoteConfigurationServerUri(ConfigNodePropertyString cqSearchpromoteConfigurationServerUri) {
    this.cqSearchpromoteConfigurationServerUri = cqSearchpromoteConfigurationServerUri;
  }

  /**
   **/
  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties cqSearchpromoteConfigurationEnvironment(ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment) {
    this.cqSearchpromoteConfigurationEnvironment = cqSearchpromoteConfigurationEnvironment;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.searchpromote.configuration.environment")
  @Valid public ConfigNodePropertyString getCqSearchpromoteConfigurationEnvironment() {
    return cqSearchpromoteConfigurationEnvironment;
  }

  @JsonProperty("cq.searchpromote.configuration.environment")
  public void setCqSearchpromoteConfigurationEnvironment(ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment) {
    this.cqSearchpromoteConfigurationEnvironment = cqSearchpromoteConfigurationEnvironment;
  }

  /**
   **/
  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connection.timeout")
  @Valid public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  @JsonProperty("connection.timeout")
  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  /**
   **/
  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("socket.timeout")
  @Valid public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  @JsonProperty("socket.timeout")
  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
