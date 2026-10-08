package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteLicenseImplLicenseCheckFilterProperties
 */

@JsonTypeName("comAdobeGraniteLicenseImplLicenseCheckFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger checkInternval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray excludeIds;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean encryptPing;

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties checkInternval(@Nullable ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
    return this;
  }

  /**
   * Get checkInternval
   * @return checkInternval
   */
  @Valid 
  @Schema(name = "checkInternval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checkInternval")
  public @Nullable ConfigNodePropertyInteger getCheckInternval() {
    return checkInternval;
  }

  @JsonProperty("checkInternval")
  public void setCheckInternval(@Nullable ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
  }

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties excludeIds(@Nullable ConfigNodePropertyArray excludeIds) {
    this.excludeIds = excludeIds;
    return this;
  }

  /**
   * Get excludeIds
   * @return excludeIds
   */
  @Valid 
  @Schema(name = "excludeIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludeIds")
  public @Nullable ConfigNodePropertyArray getExcludeIds() {
    return excludeIds;
  }

  @JsonProperty("excludeIds")
  public void setExcludeIds(@Nullable ConfigNodePropertyArray excludeIds) {
    this.excludeIds = excludeIds;
  }

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties encryptPing(@Nullable ConfigNodePropertyBoolean encryptPing) {
    this.encryptPing = encryptPing;
    return this;
  }

  /**
   * Get encryptPing
   * @return encryptPing
   */
  @Valid 
  @Schema(name = "encryptPing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encryptPing")
  public @Nullable ConfigNodePropertyBoolean getEncryptPing() {
    return encryptPing;
  }

  @JsonProperty("encryptPing")
  public void setEncryptPing(@Nullable ConfigNodePropertyBoolean encryptPing) {
    this.encryptPing = encryptPing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteLicenseImplLicenseCheckFilterProperties comAdobeGraniteLicenseImplLicenseCheckFilterProperties = (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties) o;
    return Objects.equals(this.checkInternval, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.checkInternval) &&
        Objects.equals(this.excludeIds, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.excludeIds) &&
        Objects.equals(this.encryptPing, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.encryptPing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInternval, excludeIds, encryptPing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {\n");
    sb.append("    checkInternval: ").append(toIndentedString(checkInternval)).append("\n");
    sb.append("    excludeIds: ").append(toIndentedString(excludeIds)).append("\n");
    sb.append("    encryptPing: ").append(toIndentedString(encryptPing)).append("\n");
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

