package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
 */

@JsonTypeName("comAdobeGraniteI18nImplBundlePseudoTranslationsProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {

  private ConfigNodePropertyArray pseudoPatterns;

  public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties pseudoPatterns(ConfigNodePropertyArray pseudoPatterns) {
    this.pseudoPatterns = pseudoPatterns;
    return this;
  }

  /**
   * Get pseudoPatterns
   * @return pseudoPatterns
   */
  @Valid 
  @Schema(name = "pseudo.patterns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pseudo.patterns")
  public ConfigNodePropertyArray getPseudoPatterns() {
    return pseudoPatterns;
  }

  public void setPseudoPatterns(ConfigNodePropertyArray pseudoPatterns) {
    this.pseudoPatterns = pseudoPatterns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties comAdobeGraniteI18nImplBundlePseudoTranslationsProperties = (ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties) o;
    return Objects.equals(this.pseudoPatterns, comAdobeGraniteI18nImplBundlePseudoTranslationsProperties.pseudoPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pseudoPatterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {\n");
    sb.append("    pseudoPatterns: ").append(toIndentedString(pseudoPatterns)).append("\n");
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

