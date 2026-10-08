package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {

  private ConfigNodePropertyString defaultConnectorName;

  private ConfigNodePropertyString defaultCategory;

  public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties defaultConnectorName(ConfigNodePropertyString defaultConnectorName) {
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
  public ConfigNodePropertyString getDefaultConnectorName() {
    return defaultConnectorName;
  }

  public void setDefaultConnectorName(ConfigNodePropertyString defaultConnectorName) {
    this.defaultConnectorName = defaultConnectorName;
  }

  public ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties defaultCategory(ConfigNodePropertyString defaultCategory) {
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
  public ConfigNodePropertyString getDefaultCategory() {
    return defaultCategory;
  }

  public void setDefaultCategory(ConfigNodePropertyString defaultCategory) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

