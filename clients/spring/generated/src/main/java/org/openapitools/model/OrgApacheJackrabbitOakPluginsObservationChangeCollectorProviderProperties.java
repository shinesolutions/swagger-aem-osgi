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
 * OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties
 */

@JsonTypeName("orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxItems;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxPathDepth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties maxItems(@Nullable ConfigNodePropertyInteger maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * Get maxItems
   * @return maxItems
   */
  @Valid 
  @Schema(name = "maxItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxItems")
  public @Nullable ConfigNodePropertyInteger getMaxItems() {
    return maxItems;
  }

  @JsonProperty("maxItems")
  public void setMaxItems(@Nullable ConfigNodePropertyInteger maxItems) {
    this.maxItems = maxItems;
  }

  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties maxPathDepth(@Nullable ConfigNodePropertyInteger maxPathDepth) {
    this.maxPathDepth = maxPathDepth;
    return this;
  }

  /**
   * Get maxPathDepth
   * @return maxPathDepth
   */
  @Valid 
  @Schema(name = "maxPathDepth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxPathDepth")
  public @Nullable ConfigNodePropertyInteger getMaxPathDepth() {
    return maxPathDepth;
  }

  @JsonProperty("maxPathDepth")
  public void setMaxPathDepth(@Nullable ConfigNodePropertyInteger maxPathDepth) {
    this.maxPathDepth = maxPathDepth;
  }

  public OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties = (OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties) o;
    return Objects.equals(this.maxItems, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.maxItems) &&
        Objects.equals(this.maxPathDepth, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.maxPathDepth) &&
        Objects.equals(this.enabled, orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxItems, maxPathDepth, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    maxPathDepth: ").append(toIndentedString(maxPathDepth)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

