package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationContentStaticContentBuilderProperties   {
  
  private ConfigNodePropertyString host;
  private ConfigNodePropertyInteger port;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("host")
  @Valid
  public ConfigNodePropertyString getHost() {
    return host;
  }
  public void setHost(ConfigNodePropertyString host) {
    this.host = host;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("port")
  @Valid
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
    return Objects.equals(this.host, comDayCqReplicationContentStaticContentBuilderProperties.host) &&
        Objects.equals(this.port, comDayCqReplicationContentStaticContentBuilderProperties.port);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

