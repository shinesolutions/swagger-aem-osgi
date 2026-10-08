package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties
 */

@JsonTypeName("orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString whitelistName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray whitelistBundles;

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties whitelistName(@Nullable ConfigNodePropertyString whitelistName) {
    this.whitelistName = whitelistName;
    return this;
  }

  /**
   * Get whitelistName
   * @return whitelistName
   */
  @Valid 
  @Schema(name = "whitelist.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("whitelist.name")
  public @Nullable ConfigNodePropertyString getWhitelistName() {
    return whitelistName;
  }

  @JsonProperty("whitelist.name")
  public void setWhitelistName(@Nullable ConfigNodePropertyString whitelistName) {
    this.whitelistName = whitelistName;
  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties whitelistBundles(@Nullable ConfigNodePropertyArray whitelistBundles) {
    this.whitelistBundles = whitelistBundles;
    return this;
  }

  /**
   * Get whitelistBundles
   * @return whitelistBundles
   */
  @Valid 
  @Schema(name = "whitelist.bundles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("whitelist.bundles")
  public @Nullable ConfigNodePropertyArray getWhitelistBundles() {
    return whitelistBundles;
  }

  @JsonProperty("whitelist.bundles")
  public void setWhitelistBundles(@Nullable ConfigNodePropertyArray whitelistBundles) {
    this.whitelistBundles = whitelistBundles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties = (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties) o;
    return Objects.equals(this.whitelistName, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.whitelistName) &&
        Objects.equals(this.whitelistBundles, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.whitelistBundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whitelistName, whitelistBundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {\n");
    sb.append("    whitelistName: ").append(toIndentedString(whitelistName)).append("\n");
    sb.append("    whitelistBundles: ").append(toIndentedString(whitelistBundles)).append("\n");
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

