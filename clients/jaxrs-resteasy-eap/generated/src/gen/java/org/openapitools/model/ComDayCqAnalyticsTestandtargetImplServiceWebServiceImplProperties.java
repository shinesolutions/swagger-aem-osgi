package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties   {
  

  private ConfigNodePropertyString endpointUri = null;

  private ConfigNodePropertyInteger connectionTimeout = null;

  private ConfigNodePropertyInteger socketTimeout = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endpointUri")
  public ConfigNodePropertyString getEndpointUri() {
    return endpointUri;
  }
  public void setEndpointUri(ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connectionTimeout")
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }
  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("socketTimeout")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }
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
    ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties = (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties) o;
    return Objects.equals(endpointUri, comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.endpointUri) &&
        Objects.equals(connectionTimeout, comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.connectionTimeout) &&
        Objects.equals(socketTimeout, comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.socketTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointUri, connectionTimeout, socketTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

