package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties
 */

@JsonTypeName("orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties {

  private ConfigNodePropertyString name;

  private ConfigNodePropertyString username;

  private ConfigNodePropertyString password;

  public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties username(ConfigNodePropertyString username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @Valid 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public ConfigNodePropertyString getUsername() {
    return username;
  }

  public void setUsername(ConfigNodePropertyString username) {
    this.username = username;
  }

  public OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties password(ConfigNodePropertyString password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @Valid 
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

