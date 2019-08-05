package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties   {
  @JsonProperty("port")
  private ConfigNodePropertyInteger port = null;

  public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties port(ConfigNodePropertyInteger port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.port, orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.port);
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

