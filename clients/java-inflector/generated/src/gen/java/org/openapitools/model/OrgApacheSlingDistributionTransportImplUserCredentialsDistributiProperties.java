package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name;

  @JsonProperty("username")
  private ConfigNodePropertyString username;

  @JsonProperty("password")
  private ConfigNodePropertyString password;

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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

