package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqDamHandlerStandardPsPostScriptHandlerProperties
 */

@JsonTypeName("comDayCqDamHandlerStandardPsPostScriptHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean rasterAnnotation;

  public ComDayCqDamHandlerStandardPsPostScriptHandlerProperties rasterAnnotation(@Nullable ConfigNodePropertyBoolean rasterAnnotation) {
    this.rasterAnnotation = rasterAnnotation;
    return this;
  }

  /**
   * Get rasterAnnotation
   * @return rasterAnnotation
   */
  @Valid 
  @Schema(name = "raster.annotation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("raster.annotation")
  public @Nullable ConfigNodePropertyBoolean getRasterAnnotation() {
    return rasterAnnotation;
  }

  @JsonProperty("raster.annotation")
  public void setRasterAnnotation(@Nullable ConfigNodePropertyBoolean rasterAnnotation) {
    this.rasterAnnotation = rasterAnnotation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamHandlerStandardPsPostScriptHandlerProperties comDayCqDamHandlerStandardPsPostScriptHandlerProperties = (ComDayCqDamHandlerStandardPsPostScriptHandlerProperties) o;
    return Objects.equals(this.rasterAnnotation, comDayCqDamHandlerStandardPsPostScriptHandlerProperties.rasterAnnotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rasterAnnotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties {\n");
    sb.append("    rasterAnnotation: ").append(toIndentedString(rasterAnnotation)).append("\n");
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

