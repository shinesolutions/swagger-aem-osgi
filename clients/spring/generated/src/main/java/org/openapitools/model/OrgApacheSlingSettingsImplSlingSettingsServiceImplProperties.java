package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties
 */

@JsonTypeName("orgApacheSlingSettingsImplSlingSettingsServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingDescription;

  public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties slingName(@Nullable ConfigNodePropertyString slingName) {
    this.slingName = slingName;
    return this;
  }

  /**
   * Get slingName
   * @return slingName
   */
  @Valid 
  @Schema(name = "sling.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.name")
  public @Nullable ConfigNodePropertyString getSlingName() {
    return slingName;
  }

  @JsonProperty("sling.name")
  public void setSlingName(@Nullable ConfigNodePropertyString slingName) {
    this.slingName = slingName;
  }

  public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties slingDescription(@Nullable ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
    return this;
  }

  /**
   * Get slingDescription
   * @return slingDescription
   */
  @Valid 
  @Schema(name = "sling.description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.description")
  public @Nullable ConfigNodePropertyString getSlingDescription() {
    return slingDescription;
  }

  @JsonProperty("sling.description")
  public void setSlingDescription(@Nullable ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties orgApacheSlingSettingsImplSlingSettingsServiceImplProperties = (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties) o;
    return Objects.equals(this.slingName, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingName) &&
        Objects.equals(this.slingDescription, orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingName, slingDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {\n");
    sb.append("    slingName: ").append(toIndentedString(slingName)).append("\n");
    sb.append("    slingDescription: ").append(toIndentedString(slingDescription)).append("\n");
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

