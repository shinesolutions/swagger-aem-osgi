package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger connectionTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger socketTimeout = null;
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

  public ComAdobeCqDtmImplServiceDTMWebServiceImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
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

  public ComAdobeCqDtmImplServiceDTMWebServiceImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties {\n");
    
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

