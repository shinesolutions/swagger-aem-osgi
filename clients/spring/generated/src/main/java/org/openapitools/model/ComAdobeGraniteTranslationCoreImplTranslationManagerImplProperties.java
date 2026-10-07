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
 * ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties
 */

@JsonTypeName("comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultConnectorName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultCategory;

  public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties defaultConnectorName(@Nullable ConfigNodePropertyString defaultConnectorName) {
    this.defaultConnectorName = defaultConnectorName;
    return this;
  }

  /**
   * Get defaultConnectorName
   * @return defaultConnectorName
   */
  @Valid 
  @Schema(name = "defaultConnectorName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultConnectorName")
  public @Nullable ConfigNodePropertyString getDefaultConnectorName() {
    return defaultConnectorName;
  }

  @JsonProperty("defaultConnectorName")
  public void setDefaultConnectorName(@Nullable ConfigNodePropertyString defaultConnectorName) {
    this.defaultConnectorName = defaultConnectorName;
  }

  public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties defaultCategory(@Nullable ConfigNodePropertyString defaultCategory) {
    this.defaultCategory = defaultCategory;
    return this;
  }

  /**
   * Get defaultCategory
   * @return defaultCategory
   */
  @Valid 
  @Schema(name = "defaultCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultCategory")
  public @Nullable ConfigNodePropertyString getDefaultCategory() {
    return defaultCategory;
  }

  @JsonProperty("defaultCategory")
  public void setDefaultCategory(@Nullable ConfigNodePropertyString defaultCategory) {
    this.defaultCategory = defaultCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties = (ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties) o;
    return Objects.equals(this.defaultConnectorName, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.defaultConnectorName) &&
        Objects.equals(this.defaultCategory, comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.defaultCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultConnectorName, defaultCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {\n");
    sb.append("    defaultConnectorName: ").append(toIndentedString(defaultConnectorName)).append("\n");
    sb.append("    defaultCategory: ").append(toIndentedString(defaultCategory)).append("\n");
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

