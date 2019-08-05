package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties   {
  @JsonProperty("connection.timeout")
  private ConfigNodePropertyInteger connectionTimeout = null;

  @JsonProperty("socket.timeout")
  private ConfigNodePropertyInteger socketTimeout = null;

  /**
   **/
  public ComAdobeCqDtmImplServiceDTMWebServiceImplProperties connectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
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
  public ComAdobeCqDtmImplServiceDTMWebServiceImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
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
    ComAdobeCqDtmImplServiceDTMWebServiceImplProperties comAdobeCqDtmImplServiceDTMWebServiceImplProperties = (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties) o;
    return Objects.equals(connectionTimeout, comAdobeCqDtmImplServiceDTMWebServiceImplProperties.connectionTimeout) &&
        Objects.equals(socketTimeout, comAdobeCqDtmImplServiceDTMWebServiceImplProperties.socketTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionTimeout, socketTimeout);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

