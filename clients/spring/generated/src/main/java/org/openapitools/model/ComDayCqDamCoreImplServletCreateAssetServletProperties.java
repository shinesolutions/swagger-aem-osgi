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
 * ComDayCqDamCoreImplServletCreateAssetServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplServletCreateAssetServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletCreateAssetServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean detectDuplicate;

  public ComDayCqDamCoreImplServletCreateAssetServletProperties detectDuplicate(@Nullable ConfigNodePropertyBoolean detectDuplicate) {
    this.detectDuplicate = detectDuplicate;
    return this;
  }

  /**
   * Get detectDuplicate
   * @return detectDuplicate
   */
  @Valid 
  @Schema(name = "detect_duplicate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detect_duplicate")
  public @Nullable ConfigNodePropertyBoolean getDetectDuplicate() {
    return detectDuplicate;
  }

  @JsonProperty("detect_duplicate")
  public void setDetectDuplicate(@Nullable ConfigNodePropertyBoolean detectDuplicate) {
    this.detectDuplicate = detectDuplicate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCreateAssetServletProperties comDayCqDamCoreImplServletCreateAssetServletProperties = (ComDayCqDamCoreImplServletCreateAssetServletProperties) o;
    return Objects.equals(this.detectDuplicate, comDayCqDamCoreImplServletCreateAssetServletProperties.detectDuplicate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectDuplicate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCreateAssetServletProperties {\n");
    sb.append("    detectDuplicate: ").append(toIndentedString(detectDuplicate)).append("\n");
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

