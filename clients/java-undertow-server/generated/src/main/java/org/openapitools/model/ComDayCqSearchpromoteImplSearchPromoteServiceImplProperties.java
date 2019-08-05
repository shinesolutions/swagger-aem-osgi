package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties   {
  
  private ConfigNodePropertyString cqSearchpromoteConfigurationServerUri = null;
  private ConfigNodePropertyString cqSearchpromoteConfigurationEnvironment = null;
  private ConfigNodePropertyInteger connectionTimeout = null;
  private ConfigNodePropertyInteger socketTimeout = null;

  /**
   **/
  public ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties cqSearchpromoteConfigurationServerUri(ConfigNodePropertyString cqSearchpromoteConfigurationServerUri) {
    this.cqSearchpromoteConfigurationServerUri = cqSearchpromoteConfigurationServerUri;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.searchpromote.configuration.server.uri")
  public ConfigNodePropertyString getCqSearchpromoteConfigurationServerUri() {
    return cqSearchpromoteConfigurationServerUri;
  }
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
  public ConfigNodePropertyString getCqSearchpromoteConfigurationEnvironment() {
    return cqSearchpromoteConfigurationEnvironment;
  }
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
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }
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
    ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties comDayCqSearchpromoteImplSearchPromoteServiceImplProperties = (ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties) o;
    return Objects.equals(cqSearchpromoteConfigurationServerUri, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties.cqSearchpromoteConfigurationServerUri) &&
        Objects.equals(cqSearchpromoteConfigurationEnvironment, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties.cqSearchpromoteConfigurationEnvironment) &&
        Objects.equals(connectionTimeout, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties.connectionTimeout) &&
        Objects.equals(socketTimeout, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties.socketTimeout);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

