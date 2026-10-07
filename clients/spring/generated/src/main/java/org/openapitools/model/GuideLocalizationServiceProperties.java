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
 * GuideLocalizationServiceProperties
 */

@JsonTypeName("guideLocalizationServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class GuideLocalizationServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray supportedLocales;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray localizableProperties;

  public GuideLocalizationServiceProperties supportedLocales(@Nullable ConfigNodePropertyArray supportedLocales) {
    this.supportedLocales = supportedLocales;
    return this;
  }

  /**
   * Get supportedLocales
   * @return supportedLocales
   */
  @Valid 
  @Schema(name = "supportedLocales", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportedLocales")
  public @Nullable ConfigNodePropertyArray getSupportedLocales() {
    return supportedLocales;
  }

  @JsonProperty("supportedLocales")
  public void setSupportedLocales(@Nullable ConfigNodePropertyArray supportedLocales) {
    this.supportedLocales = supportedLocales;
  }

  public GuideLocalizationServiceProperties localizableProperties(@Nullable ConfigNodePropertyArray localizableProperties) {
    this.localizableProperties = localizableProperties;
    return this;
  }

  /**
   * Get localizableProperties
   * @return localizableProperties
   */
  @Valid 
  @Schema(name = "Localizable Properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Localizable Properties")
  public @Nullable ConfigNodePropertyArray getLocalizableProperties() {
    return localizableProperties;
  }

  @JsonProperty("Localizable Properties")
  public void setLocalizableProperties(@Nullable ConfigNodePropertyArray localizableProperties) {
    this.localizableProperties = localizableProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideLocalizationServiceProperties guideLocalizationServiceProperties = (GuideLocalizationServiceProperties) o;
    return Objects.equals(this.supportedLocales, guideLocalizationServiceProperties.supportedLocales) &&
        Objects.equals(this.localizableProperties, guideLocalizationServiceProperties.localizableProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedLocales, localizableProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideLocalizationServiceProperties {\n");
    sb.append("    supportedLocales: ").append(toIndentedString(supportedLocales)).append("\n");
    sb.append("    localizableProperties: ").append(toIndentedString(localizableProperties)).append("\n");
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

