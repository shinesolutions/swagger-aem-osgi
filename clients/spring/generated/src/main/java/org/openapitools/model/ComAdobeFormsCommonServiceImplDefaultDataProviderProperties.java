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
 * ComAdobeFormsCommonServiceImplDefaultDataProviderProperties
 */

@JsonTypeName("comAdobeFormsCommonServiceImplDefaultDataProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray alloweddataFileLocations;

  public ComAdobeFormsCommonServiceImplDefaultDataProviderProperties alloweddataFileLocations(@Nullable ConfigNodePropertyArray alloweddataFileLocations) {
    this.alloweddataFileLocations = alloweddataFileLocations;
    return this;
  }

  /**
   * Get alloweddataFileLocations
   * @return alloweddataFileLocations
   */
  @Valid 
  @Schema(name = "alloweddataFileLocations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alloweddataFileLocations")
  public @Nullable ConfigNodePropertyArray getAlloweddataFileLocations() {
    return alloweddataFileLocations;
  }

  @JsonProperty("alloweddataFileLocations")
  public void setAlloweddataFileLocations(@Nullable ConfigNodePropertyArray alloweddataFileLocations) {
    this.alloweddataFileLocations = alloweddataFileLocations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeFormsCommonServiceImplDefaultDataProviderProperties comAdobeFormsCommonServiceImplDefaultDataProviderProperties = (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties) o;
    return Objects.equals(this.alloweddataFileLocations, comAdobeFormsCommonServiceImplDefaultDataProviderProperties.alloweddataFileLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alloweddataFileLocations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties {\n");
    sb.append("    alloweddataFileLocations: ").append(toIndentedString(alloweddataFileLocations)).append("\n");
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

