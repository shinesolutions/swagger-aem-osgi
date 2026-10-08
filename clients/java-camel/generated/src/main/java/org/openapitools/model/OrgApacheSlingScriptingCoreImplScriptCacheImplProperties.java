package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {

  private ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize;

  private ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions;

  public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties orgApacheSlingScriptingCacheSize(ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize) {
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
  public ConfigNodePropertyInteger getOrgApacheSlingScriptingCacheSize() {
    return orgApacheSlingScriptingCacheSize;
  }

  public void setOrgApacheSlingScriptingCacheSize(ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize) {
    this.orgApacheSlingScriptingCacheSize = orgApacheSlingScriptingCacheSize;
  }

  public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties orgApacheSlingScriptingCacheAdditionalExtensions(ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions) {
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
  public ConfigNodePropertyArray getOrgApacheSlingScriptingCacheAdditionalExtensions() {
    return orgApacheSlingScriptingCacheAdditionalExtensions;
  }

  public void setOrgApacheSlingScriptingCacheAdditionalExtensions(ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

