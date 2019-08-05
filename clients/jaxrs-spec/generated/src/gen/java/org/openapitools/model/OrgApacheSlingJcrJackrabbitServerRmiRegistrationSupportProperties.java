package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties   {
  
  private @Valid ConfigNodePropertyInteger port = null;

  /**
   **/
  public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties port(ConfigNodePropertyInteger port) {
    this.port = port;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("port")
  public ConfigNodePropertyInteger getPort() {
    return port;
  }
  public void setPort(ConfigNodePropertyInteger port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties = (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties) o;
    return Objects.equals(port, orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties {\n");
    
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

