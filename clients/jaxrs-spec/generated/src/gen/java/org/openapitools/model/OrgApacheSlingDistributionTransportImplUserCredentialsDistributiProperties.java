package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyString username = null;
  private @Valid ConfigNodePropertyString password = null;

  /**
   **/
  public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }
  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  /**
   **/
  public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public ConfigNodePropertyString getPassword() {
    return password;
  }
  public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties = (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.name) &&
        Objects.equals(username, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.username) &&
        Objects.equals(password, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

