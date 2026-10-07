package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties
 */

@JsonTypeName("orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString javaNamingFactoryInitial;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString javaNamingProviderUrl;

  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties javaNamingFactoryInitial(@Nullable ConfigNodePropertyString javaNamingFactoryInitial) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
    return this;
  }

  /**
   * Get javaNamingFactoryInitial
   * @return javaNamingFactoryInitial
   */
  @Valid 
  @Schema(name = "java.naming.factory.initial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("java.naming.factory.initial")
  public @Nullable ConfigNodePropertyString getJavaNamingFactoryInitial() {
    return javaNamingFactoryInitial;
  }

  @JsonProperty("java.naming.factory.initial")
  public void setJavaNamingFactoryInitial(@Nullable ConfigNodePropertyString javaNamingFactoryInitial) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
  }

  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties javaNamingProviderUrl(@Nullable ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingProviderUrl = javaNamingProviderUrl;
    return this;
  }

  /**
   * Get javaNamingProviderUrl
   * @return javaNamingProviderUrl
   */
  @Valid 
  @Schema(name = "java.naming.provider.url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("java.naming.provider.url")
  public @Nullable ConfigNodePropertyString getJavaNamingProviderUrl() {
    return javaNamingProviderUrl;
  }

  @JsonProperty("java.naming.provider.url")
  public void setJavaNamingProviderUrl(@Nullable ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingProviderUrl = javaNamingProviderUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties = (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties) o;
    return Objects.equals(this.javaNamingFactoryInitial, orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.javaNamingFactoryInitial) &&
        Objects.equals(this.javaNamingProviderUrl, orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.javaNamingProviderUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(javaNamingFactoryInitial, javaNamingProviderUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties {\n");
    sb.append("    javaNamingFactoryInitial: ").append(toIndentedString(javaNamingFactoryInitial)).append("\n");
    sb.append("    javaNamingProviderUrl: ").append(toIndentedString(javaNamingProviderUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

