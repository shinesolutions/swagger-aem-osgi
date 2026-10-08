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
 * OrgApacheSlingFeatureflagsFeatureProperties
 */

@JsonTypeName("orgApacheSlingFeatureflagsFeatureProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingFeatureflagsFeatureProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString description;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  public OrgApacheSlingFeatureflagsFeatureProperties name(@Nullable ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingFeatureflagsFeatureProperties description(@Nullable ConfigNodePropertyString description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @Valid 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable ConfigNodePropertyString getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable ConfigNodePropertyString description) {
    this.description = description;
  }

  public OrgApacheSlingFeatureflagsFeatureProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
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
    OrgApacheSlingFeatureflagsFeatureProperties orgApacheSlingFeatureflagsFeatureProperties = (OrgApacheSlingFeatureflagsFeatureProperties) o;
    return Objects.equals(this.name, orgApacheSlingFeatureflagsFeatureProperties.name) &&
        Objects.equals(this.description, orgApacheSlingFeatureflagsFeatureProperties.description) &&
        Objects.equals(this.enabled, orgApacheSlingFeatureflagsFeatureProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingFeatureflagsFeatureProperties {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

