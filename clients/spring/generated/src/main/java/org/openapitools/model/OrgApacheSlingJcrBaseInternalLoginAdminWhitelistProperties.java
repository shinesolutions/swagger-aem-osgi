package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties
 */

@JsonTypeName("orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean whitelistBypass;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString whitelistBundlesRegexp;

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties whitelistBypass(@Nullable ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
    return this;
  }

  /**
   * Get whitelistBypass
   * @return whitelistBypass
   */
  @Valid 
  @Schema(name = "whitelist.bypass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("whitelist.bypass")
  public @Nullable ConfigNodePropertyBoolean getWhitelistBypass() {
    return whitelistBypass;
  }

  @JsonProperty("whitelist.bypass")
  public void setWhitelistBypass(@Nullable ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties whitelistBundlesRegexp(@Nullable ConfigNodePropertyString whitelistBundlesRegexp) {
    this.whitelistBundlesRegexp = whitelistBundlesRegexp;
    return this;
  }

  /**
   * Get whitelistBundlesRegexp
   * @return whitelistBundlesRegexp
   */
  @Valid 
  @Schema(name = "whitelist.bundles.regexp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("whitelist.bundles.regexp")
  public @Nullable ConfigNodePropertyString getWhitelistBundlesRegexp() {
    return whitelistBundlesRegexp;
  }

  @JsonProperty("whitelist.bundles.regexp")
  public void setWhitelistBundlesRegexp(@Nullable ConfigNodePropertyString whitelistBundlesRegexp) {
    this.whitelistBundlesRegexp = whitelistBundlesRegexp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties = (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties) o;
    return Objects.equals(this.whitelistBypass, orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.whitelistBypass) &&
        Objects.equals(this.whitelistBundlesRegexp, orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.whitelistBundlesRegexp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whitelistBypass, whitelistBundlesRegexp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {\n");
    sb.append("    whitelistBypass: ").append(toIndentedString(whitelistBypass)).append("\n");
    sb.append("    whitelistBundlesRegexp: ").append(toIndentedString(whitelistBundlesRegexp)).append("\n");
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

