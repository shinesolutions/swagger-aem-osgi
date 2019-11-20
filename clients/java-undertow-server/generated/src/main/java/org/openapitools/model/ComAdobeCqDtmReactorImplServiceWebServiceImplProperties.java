package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties   {
  
  private ConfigNodePropertyString endpointUri = null;
  private ConfigNodePropertyInteger connectionTimeout = null;
  private ConfigNodePropertyInteger socketTimeout = null;

  /**
   **/
  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties endpointUri(ConfigNodePropertyString endpointUri) {
    this.endpointUri = endpointUri;
    return this;
  }

  
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
  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

  
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
  public ComAdobeCqDtmReactorImplServiceWebServiceImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("socketTimeout")
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
    return Objects.equals(endpointUri, comAdobeCqDtmReactorImplServiceWebServiceImplProperties.endpointUri) &&
        Objects.equals(connectionTimeout, comAdobeCqDtmReactorImplServiceWebServiceImplProperties.connectionTimeout) &&
        Objects.equals(socketTimeout, comAdobeCqDtmReactorImplServiceWebServiceImplProperties.socketTimeout);
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
