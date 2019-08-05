package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqReplicationContentStaticContentBuilderProperties   {
  
  private ConfigNodePropertyString host = null;
  private ConfigNodePropertyInteger port = null;

  public ComDayCqReplicationContentStaticContentBuilderProperties () {

  }

  public ComDayCqReplicationContentStaticContentBuilderProperties (ConfigNodePropertyString host, ConfigNodePropertyInteger port) {
    this.host = host;
    this.port = port;
  }

    
  @JsonProperty("host")
  public ConfigNodePropertyString getHost() {
    return host;
  }
  public void setHost(ConfigNodePropertyString host) {
    this.host = host;
  }

    
  @JsonProperty("port")
  public ConfigNodePropertyInteger getPort() {
    return port;
  }
  public void setPort(ConfigNodePropertyInteger port) {
    this.port = port;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationContentStaticContentBuilderProperties comDayCqReplicationContentStaticContentBuilderProperties = (ComDayCqReplicationContentStaticContentBuilderProperties) o;
    return Objects.equals(host, comDayCqReplicationContentStaticContentBuilderProperties.host) &&
        Objects.equals(port, comDayCqReplicationContentStaticContentBuilderProperties.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationContentStaticContentBuilderProperties {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
