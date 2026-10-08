package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {

  private ConfigNodePropertyString whitelistName;

  private ConfigNodePropertyArray whitelistBundles;

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties whitelistName(ConfigNodePropertyString whitelistName) {
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
  public ConfigNodePropertyString getWhitelistName() {
    return whitelistName;
  }

  public void setWhitelistName(ConfigNodePropertyString whitelistName) {
    this.whitelistName = whitelistName;
  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties whitelistBundles(ConfigNodePropertyArray whitelistBundles) {
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
  public ConfigNodePropertyArray getWhitelistBundles() {
    return whitelistBundles;
  }

  public void setWhitelistBundles(ConfigNodePropertyArray whitelistBundles) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

