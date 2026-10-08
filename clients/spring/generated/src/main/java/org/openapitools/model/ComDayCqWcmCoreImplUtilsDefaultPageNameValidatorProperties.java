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
 * ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
 */

@JsonTypeName("comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString nonValidChars;

  public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties nonValidChars(@Nullable ConfigNodePropertyString nonValidChars) {
    this.nonValidChars = nonValidChars;
    return this;
  }

  /**
   * Get nonValidChars
   * @return nonValidChars
   */
  @Valid 
  @Schema(name = "nonValidChars", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nonValidChars")
  public @Nullable ConfigNodePropertyString getNonValidChars() {
    return nonValidChars;
  }

  @JsonProperty("nonValidChars")
  public void setNonValidChars(@Nullable ConfigNodePropertyString nonValidChars) {
    this.nonValidChars = nonValidChars;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties = (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties) o;
    return Objects.equals(this.nonValidChars, comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.nonValidChars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonValidChars);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties {\n");
    sb.append("    nonValidChars: ").append(toIndentedString(nonValidChars)).append("\n");
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

