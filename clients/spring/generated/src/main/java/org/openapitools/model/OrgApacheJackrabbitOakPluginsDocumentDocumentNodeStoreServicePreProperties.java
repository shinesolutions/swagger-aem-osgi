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
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties
 */

@JsonTypeName("orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray persistentCacheIncludes;

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties persistentCacheIncludes(@Nullable ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
    return this;
  }

  /**
   * Get persistentCacheIncludes
   * @return persistentCacheIncludes
   */
  @Valid 
  @Schema(name = "persistentCacheIncludes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("persistentCacheIncludes")
  public @Nullable ConfigNodePropertyArray getPersistentCacheIncludes() {
    return persistentCacheIncludes;
  }

  @JsonProperty("persistentCacheIncludes")
  public void setPersistentCacheIncludes(@Nullable ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties = (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties) o;
    return Objects.equals(this.persistentCacheIncludes, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.persistentCacheIncludes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistentCacheIncludes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties {\n");
    sb.append("    persistentCacheIncludes: ").append(toIndentedString(persistentCacheIncludes)).append("\n");
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

