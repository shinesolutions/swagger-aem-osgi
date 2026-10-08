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
 * ComAdobeGraniteAuthImsProperties
 */

@JsonTypeName("comAdobeGraniteAuthImsProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthImsProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString configid;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString scope;

  public ComAdobeGraniteAuthImsProperties configid(@Nullable ConfigNodePropertyString configid) {
    this.configid = configid;
    return this;
  }

  /**
   * Get configid
   * @return configid
   */
  @Valid 
  @Schema(name = "configid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configid")
  public @Nullable ConfigNodePropertyString getConfigid() {
    return configid;
  }

  @JsonProperty("configid")
  public void setConfigid(@Nullable ConfigNodePropertyString configid) {
    this.configid = configid;
  }

  public ComAdobeGraniteAuthImsProperties scope(@Nullable ConfigNodePropertyString scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public @Nullable ConfigNodePropertyString getScope() {
    return scope;
  }

  @JsonProperty("scope")
  public void setScope(@Nullable ConfigNodePropertyString scope) {
    this.scope = scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties = (ComAdobeGraniteAuthImsProperties) o;
    return Objects.equals(this.configid, comAdobeGraniteAuthImsProperties.configid) &&
        Objects.equals(this.scope, comAdobeGraniteAuthImsProperties.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configid, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthImsProperties {\n");
    sb.append("    configid: ").append(toIndentedString(configid)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

