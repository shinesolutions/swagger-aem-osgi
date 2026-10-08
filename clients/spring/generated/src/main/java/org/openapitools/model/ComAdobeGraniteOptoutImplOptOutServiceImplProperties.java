package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteOptoutImplOptOutServiceImplProperties
 */

@JsonTypeName("comAdobeGraniteOptoutImplOptOutServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOptoutImplOptOutServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray optoutCookies;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray optoutHeaders;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray optoutWhitelistCookies;

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutCookies(@Nullable ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
    return this;
  }

  /**
   * Get optoutCookies
   * @return optoutCookies
   */
  @Valid 
  @Schema(name = "optout.cookies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optout.cookies")
  public @Nullable ConfigNodePropertyArray getOptoutCookies() {
    return optoutCookies;
  }

  @JsonProperty("optout.cookies")
  public void setOptoutCookies(@Nullable ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutHeaders(@Nullable ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
    return this;
  }

  /**
   * Get optoutHeaders
   * @return optoutHeaders
   */
  @Valid 
  @Schema(name = "optout.headers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optout.headers")
  public @Nullable ConfigNodePropertyArray getOptoutHeaders() {
    return optoutHeaders;
  }

  @JsonProperty("optout.headers")
  public void setOptoutHeaders(@Nullable ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutWhitelistCookies(@Nullable ConfigNodePropertyArray optoutWhitelistCookies) {
    this.optoutWhitelistCookies = optoutWhitelistCookies;
    return this;
  }

  /**
   * Get optoutWhitelistCookies
   * @return optoutWhitelistCookies
   */
  @Valid 
  @Schema(name = "optout.whitelist.cookies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optout.whitelist.cookies")
  public @Nullable ConfigNodePropertyArray getOptoutWhitelistCookies() {
    return optoutWhitelistCookies;
  }

  @JsonProperty("optout.whitelist.cookies")
  public void setOptoutWhitelistCookies(@Nullable ConfigNodePropertyArray optoutWhitelistCookies) {
    this.optoutWhitelistCookies = optoutWhitelistCookies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOptoutImplOptOutServiceImplProperties comAdobeGraniteOptoutImplOptOutServiceImplProperties = (ComAdobeGraniteOptoutImplOptOutServiceImplProperties) o;
    return Objects.equals(this.optoutCookies, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutCookies) &&
        Objects.equals(this.optoutHeaders, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutHeaders) &&
        Objects.equals(this.optoutWhitelistCookies, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutWhitelistCookies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optoutCookies, optoutHeaders, optoutWhitelistCookies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOptoutImplOptOutServiceImplProperties {\n");
    sb.append("    optoutCookies: ").append(toIndentedString(optoutCookies)).append("\n");
    sb.append("    optoutHeaders: ").append(toIndentedString(optoutHeaders)).append("\n");
    sb.append("    optoutWhitelistCookies: ").append(toIndentedString(optoutWhitelistCookies)).append("\n");
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

