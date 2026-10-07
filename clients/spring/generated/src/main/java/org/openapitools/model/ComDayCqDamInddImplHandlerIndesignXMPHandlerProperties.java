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
 * ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties
 */

@JsonTypeName("comDayCqDamInddImplHandlerIndesignXMPHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString processLabel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean extractPages;

  public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties processLabel(@Nullable ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  /**
   * Get processLabel
   * @return processLabel
   */
  @Valid 
  @Schema(name = "process.label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("process.label")
  public @Nullable ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  @JsonProperty("process.label")
  public void setProcessLabel(@Nullable ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties extractPages(@Nullable ConfigNodePropertyBoolean extractPages) {
    this.extractPages = extractPages;
    return this;
  }

  /**
   * Get extractPages
   * @return extractPages
   */
  @Valid 
  @Schema(name = "extract.pages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extract.pages")
  public @Nullable ConfigNodePropertyBoolean getExtractPages() {
    return extractPages;
  }

  @JsonProperty("extract.pages")
  public void setExtractPages(@Nullable ConfigNodePropertyBoolean extractPages) {
    this.extractPages = extractPages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties comDayCqDamInddImplHandlerIndesignXMPHandlerProperties = (ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties) o;
    return Objects.equals(this.processLabel, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties.processLabel) &&
        Objects.equals(this.extractPages, comDayCqDamInddImplHandlerIndesignXMPHandlerProperties.extractPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, extractPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {\n");
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    extractPages: ").append(toIndentedString(extractPages)).append("\n");
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

