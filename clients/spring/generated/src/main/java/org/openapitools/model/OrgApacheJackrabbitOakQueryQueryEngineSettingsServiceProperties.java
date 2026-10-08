package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties
 */

@JsonTypeName("orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queryLimitInMemory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queryLimitReads;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean queryFailTraversal;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean fastQuerySize;

  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryLimitInMemory(@Nullable ConfigNodePropertyInteger queryLimitInMemory) {
    this.queryLimitInMemory = queryLimitInMemory;
    return this;
  }

  /**
   * Get queryLimitInMemory
   * @return queryLimitInMemory
   */
  @Valid 
  @Schema(name = "queryLimitInMemory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryLimitInMemory")
  public @Nullable ConfigNodePropertyInteger getQueryLimitInMemory() {
    return queryLimitInMemory;
  }

  @JsonProperty("queryLimitInMemory")
  public void setQueryLimitInMemory(@Nullable ConfigNodePropertyInteger queryLimitInMemory) {
    this.queryLimitInMemory = queryLimitInMemory;
  }

  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryLimitReads(@Nullable ConfigNodePropertyInteger queryLimitReads) {
    this.queryLimitReads = queryLimitReads;
    return this;
  }

  /**
   * Get queryLimitReads
   * @return queryLimitReads
   */
  @Valid 
  @Schema(name = "queryLimitReads", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryLimitReads")
  public @Nullable ConfigNodePropertyInteger getQueryLimitReads() {
    return queryLimitReads;
  }

  @JsonProperty("queryLimitReads")
  public void setQueryLimitReads(@Nullable ConfigNodePropertyInteger queryLimitReads) {
    this.queryLimitReads = queryLimitReads;
  }

  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryFailTraversal(@Nullable ConfigNodePropertyBoolean queryFailTraversal) {
    this.queryFailTraversal = queryFailTraversal;
    return this;
  }

  /**
   * Get queryFailTraversal
   * @return queryFailTraversal
   */
  @Valid 
  @Schema(name = "queryFailTraversal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryFailTraversal")
  public @Nullable ConfigNodePropertyBoolean getQueryFailTraversal() {
    return queryFailTraversal;
  }

  @JsonProperty("queryFailTraversal")
  public void setQueryFailTraversal(@Nullable ConfigNodePropertyBoolean queryFailTraversal) {
    this.queryFailTraversal = queryFailTraversal;
  }

  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties fastQuerySize(@Nullable ConfigNodePropertyBoolean fastQuerySize) {
    this.fastQuerySize = fastQuerySize;
    return this;
  }

  /**
   * Get fastQuerySize
   * @return fastQuerySize
   */
  @Valid 
  @Schema(name = "fastQuerySize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fastQuerySize")
  public @Nullable ConfigNodePropertyBoolean getFastQuerySize() {
    return fastQuerySize;
  }

  @JsonProperty("fastQuerySize")
  public void setFastQuerySize(@Nullable ConfigNodePropertyBoolean fastQuerySize) {
    this.fastQuerySize = fastQuerySize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties = (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties) o;
    return Objects.equals(this.queryLimitInMemory, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.queryLimitInMemory) &&
        Objects.equals(this.queryLimitReads, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.queryLimitReads) &&
        Objects.equals(this.queryFailTraversal, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.queryFailTraversal) &&
        Objects.equals(this.fastQuerySize, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.fastQuerySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryLimitInMemory, queryLimitReads, queryFailTraversal, fastQuerySize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {\n");
    sb.append("    queryLimitInMemory: ").append(toIndentedString(queryLimitInMemory)).append("\n");
    sb.append("    queryLimitReads: ").append(toIndentedString(queryLimitReads)).append("\n");
    sb.append("    queryFailTraversal: ").append(toIndentedString(queryFailTraversal)).append("\n");
    sb.append("    fastQuerySize: ").append(toIndentedString(fastQuerySize)).append("\n");
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

