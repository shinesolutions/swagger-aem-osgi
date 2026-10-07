package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString endpointUri;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger connectionTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger socketTimeout;
 /**
  * Get endpointUri
  * @return endpointUri
  */
  @JsonProperty("endpointUri")
  public ConfigNodePropertyString getEndpointUri() {
    return endpointUri;
  }

  /**
   * Sets the <code>endpointUri</code> property.
   */
 public void setEndpointUri(ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
  }

  /**
   * Sets the <code>endpointUri</code> property.
   */
  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties endpointUri(ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
    return this;
  }

 /**
  * Get connectionTimeout
  * @return connectionTimeout
  */
  @JsonProperty("connectionTimeout")
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  /**
   * Sets the <code>connectionTimeout</code> property.
   */
 public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  /**
   * Sets the <code>connectionTimeout</code> property.
   */
  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

 /**
  * Get socketTimeout
  * @return socketTimeout
  */
  @JsonProperty("socketTimeout")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  /**
   * Sets the <code>socketTimeout</code> property.
   */
 public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  /**
   * Sets the <code>socketTimeout</code> property.
   */
  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

