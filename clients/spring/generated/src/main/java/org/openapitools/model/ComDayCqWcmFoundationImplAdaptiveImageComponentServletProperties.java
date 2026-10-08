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
 * ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties
 */

@JsonTypeName("comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray adaptSupportedWidths;

  public ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties adaptSupportedWidths(@Nullable ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
    return this;
  }

  /**
   * Get adaptSupportedWidths
   * @return adaptSupportedWidths
   */
  @Valid 
  @Schema(name = "adapt.supported.widths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adapt.supported.widths")
  public @Nullable ConfigNodePropertyArray getAdaptSupportedWidths() {
    return adaptSupportedWidths;
  }

  @JsonProperty("adapt.supported.widths")
  public void setAdaptSupportedWidths(@Nullable ConfigNodePropertyArray adaptSupportedWidths) {
    this.adaptSupportedWidths = adaptSupportedWidths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties = (ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties) o;
    return Objects.equals(this.adaptSupportedWidths, comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.adaptSupportedWidths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptSupportedWidths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties {\n");
    sb.append("    adaptSupportedWidths: ").append(toIndentedString(adaptSupportedWidths)).append("\n");
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

