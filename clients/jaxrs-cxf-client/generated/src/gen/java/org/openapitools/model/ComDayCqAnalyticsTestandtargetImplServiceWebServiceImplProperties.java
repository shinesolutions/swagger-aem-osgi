package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString endpointUri = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger connectionTimeout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger socketTimeout = null;
 /**
   * Get endpointUri
   * @return endpointUri
  **/
  @JsonProperty("endpointUri")
  public ConfigNodePropertyString getEndpointUri() {
    return endpointUri;
  }

  public void setEndpointUri(ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
  }

  public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties endpointUri(ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
    return this;
  }

 /**
   * Get connectionTimeout
   * @return connectionTimeout
  **/
  @JsonProperty("connectionTimeout")
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

 /**
   * Get socketTimeout
   * @return socketTimeout
  **/
  @JsonProperty("socketTimeout")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

