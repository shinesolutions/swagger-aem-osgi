package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("connection.timeout")
  private ConfigNodePropertyInteger connectionTimeout;

  @JsonProperty("socket.timeout")
  private ConfigNodePropertyInteger socketTimeout;

  /**
   * 
   * @return connectionTimeout
   */
  public ConfigNodePropertyInteger getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  /**
   * 
   * @return socketTimeout
   */
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
    ComAdobeCqDtmImplServiceDTMWebServiceImplProperties comAdobeCqDtmImplServiceDTMWebServiceImplProperties = (ComAdobeCqDtmImplServiceDTMWebServiceImplProperties) o;
    return Objects.equals(this.connectionTimeout, comAdobeCqDtmImplServiceDTMWebServiceImplProperties.connectionTimeout) &&
        Objects.equals(this.socketTimeout, comAdobeCqDtmImplServiceDTMWebServiceImplProperties.socketTimeout);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
