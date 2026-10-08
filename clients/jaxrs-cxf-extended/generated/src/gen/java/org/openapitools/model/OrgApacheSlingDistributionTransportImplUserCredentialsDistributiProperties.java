package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString username;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString password;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get username
  * @return username
  */
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  /**
   * Sets the <code>username</code> property.
   */
 public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  /**
   * Sets the <code>username</code> property.
   */
  public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

 /**
  * Get password
  * @return password
  */
  @JsonProperty("password")
  public ConfigNodePropertyString getPassword() {
    return password;
  }

  /**
   * Sets the <code>password</code> property.
   */
 public void setPassword(ConfigNodePropertyString password) {
    this.password = password;
  }

  /**
   * Sets the <code>password</code> property.
   */
  public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties password(ConfigNodePropertyString password) {
    this.password = password;
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
    OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties = (OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.name) &&
        Objects.equals(this.username, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.username) &&
        Objects.equals(this.password, orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.password);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

