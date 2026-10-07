package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties
 */

@JsonTypeName("comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes;

  public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties formsFormparagraphpostprocessorEnabled(@Nullable ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled) {
    this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
    return this;
  }

  /**
   * Get formsFormparagraphpostprocessorEnabled
   * @return formsFormparagraphpostprocessorEnabled
   */
  @Valid 
  @Schema(name = "forms.formparagraphpostprocessor.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forms.formparagraphpostprocessor.enabled")
  public @Nullable ConfigNodePropertyBoolean getFormsFormparagraphpostprocessorEnabled() {
    return formsFormparagraphpostprocessorEnabled;
  }

  @JsonProperty("forms.formparagraphpostprocessor.enabled")
  public void setFormsFormparagraphpostprocessorEnabled(@Nullable ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled) {
    this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
  }

  public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties formsFormparagraphpostprocessorFormresourcetypes(@Nullable ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes) {
    this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
    return this;
  }

  /**
   * Get formsFormparagraphpostprocessorFormresourcetypes
   * @return formsFormparagraphpostprocessorFormresourcetypes
   */
  @Valid 
  @Schema(name = "forms.formparagraphpostprocessor.formresourcetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forms.formparagraphpostprocessor.formresourcetypes")
  public @Nullable ConfigNodePropertyArray getFormsFormparagraphpostprocessorFormresourcetypes() {
    return formsFormparagraphpostprocessorFormresourcetypes;
  }

  @JsonProperty("forms.formparagraphpostprocessor.formresourcetypes")
  public void setFormsFormparagraphpostprocessorFormresourcetypes(@Nullable ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes) {
    this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties = (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties) o;
    return Objects.equals(this.formsFormparagraphpostprocessorEnabled, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.formsFormparagraphpostprocessorEnabled) &&
        Objects.equals(this.formsFormparagraphpostprocessorFormresourcetypes, comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.formsFormparagraphpostprocessorFormresourcetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formsFormparagraphpostprocessorEnabled, formsFormparagraphpostprocessorFormresourcetypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {\n");
    sb.append("    formsFormparagraphpostprocessorEnabled: ").append(toIndentedString(formsFormparagraphpostprocessorEnabled)).append("\n");
    sb.append("    formsFormparagraphpostprocessorFormresourcetypes: ").append(toIndentedString(formsFormparagraphpostprocessorFormresourcetypes)).append("\n");
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

