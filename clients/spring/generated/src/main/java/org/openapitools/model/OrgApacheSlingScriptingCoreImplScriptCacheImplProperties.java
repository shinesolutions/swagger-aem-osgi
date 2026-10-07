package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * OrgApacheSlingScriptingCoreImplScriptCacheImplProperties
 */

@JsonTypeName("orgApacheSlingScriptingCoreImplScriptCacheImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions;

  public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties orgApacheSlingScriptingCacheSize(@Nullable ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize) {
    this.orgApacheSlingScriptingCacheSize = orgApacheSlingScriptingCacheSize;
    return this;
  }

  /**
   * Get orgApacheSlingScriptingCacheSize
   * @return orgApacheSlingScriptingCacheSize
   */
  @Valid 
  @Schema(name = "org.apache.sling.scripting.cache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.scripting.cache.size")
  public @Nullable ConfigNodePropertyInteger getOrgApacheSlingScriptingCacheSize() {
    return orgApacheSlingScriptingCacheSize;
  }

  @JsonProperty("org.apache.sling.scripting.cache.size")
  public void setOrgApacheSlingScriptingCacheSize(@Nullable ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize) {
    this.orgApacheSlingScriptingCacheSize = orgApacheSlingScriptingCacheSize;
  }

  public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties orgApacheSlingScriptingCacheAdditionalExtensions(@Nullable ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions) {
    this.orgApacheSlingScriptingCacheAdditionalExtensions = orgApacheSlingScriptingCacheAdditionalExtensions;
    return this;
  }

  /**
   * Get orgApacheSlingScriptingCacheAdditionalExtensions
   * @return orgApacheSlingScriptingCacheAdditionalExtensions
   */
  @Valid 
  @Schema(name = "org.apache.sling.scripting.cache.additional_extensions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.scripting.cache.additional_extensions")
  public @Nullable ConfigNodePropertyArray getOrgApacheSlingScriptingCacheAdditionalExtensions() {
    return orgApacheSlingScriptingCacheAdditionalExtensions;
  }

  @JsonProperty("org.apache.sling.scripting.cache.additional_extensions")
  public void setOrgApacheSlingScriptingCacheAdditionalExtensions(@Nullable ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions) {
    this.orgApacheSlingScriptingCacheAdditionalExtensions = orgApacheSlingScriptingCacheAdditionalExtensions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingCoreImplScriptCacheImplProperties orgApacheSlingScriptingCoreImplScriptCacheImplProperties = (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties) o;
    return Objects.equals(this.orgApacheSlingScriptingCacheSize, orgApacheSlingScriptingCoreImplScriptCacheImplProperties.orgApacheSlingScriptingCacheSize) &&
        Objects.equals(this.orgApacheSlingScriptingCacheAdditionalExtensions, orgApacheSlingScriptingCoreImplScriptCacheImplProperties.orgApacheSlingScriptingCacheAdditionalExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingScriptingCacheSize, orgApacheSlingScriptingCacheAdditionalExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {\n");
    sb.append("    orgApacheSlingScriptingCacheSize: ").append(toIndentedString(orgApacheSlingScriptingCacheSize)).append("\n");
    sb.append("    orgApacheSlingScriptingCacheAdditionalExtensions: ").append(toIndentedString(orgApacheSlingScriptingCacheAdditionalExtensions)).append("\n");
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

