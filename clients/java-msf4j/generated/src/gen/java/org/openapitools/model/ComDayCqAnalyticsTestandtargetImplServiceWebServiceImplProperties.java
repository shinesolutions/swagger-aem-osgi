package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties   {
  @JsonProperty("endpointUri")
  private ConfigNodePropertyString endpointUri = null;

  @JsonProperty("connectionTimeout")
  private ConfigNodePropertyInteger connectionTimeout = null;

  @JsonProperty("socketTimeout")
  private ConfigNodePropertyInteger socketTimeout = null;

  public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties endpointUri(ConfigNodePropertyString endpointUri) {
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

  public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
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

  public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
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
    ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties = (ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties) o;
    return Objects.equals(this.endpointUri, comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.endpointUri) &&
        Objects.equals(this.connectionTimeout, comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.connectionTimeout) &&
        Objects.equals(this.socketTimeout, comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.socketTimeout);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

