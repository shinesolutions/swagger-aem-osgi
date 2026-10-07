package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamHandlerStandardPsdPsdHandlerProperties
 */

@JsonTypeName("comDayCqDamHandlerStandardPsdPsdHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamHandlerStandardPsdPsdHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger largeFileThreshold;

  public ComDayCqDamHandlerStandardPsdPsdHandlerProperties largeFileThreshold(@Nullable ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
    return this;
  }

  /**
   * Get largeFileThreshold
   * @return largeFileThreshold
   */
  @Valid 
  @Schema(name = "large_file_threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("large_file_threshold")
  public @Nullable ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }

  @JsonProperty("large_file_threshold")
  public void setLargeFileThreshold(@Nullable ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamHandlerStandardPsdPsdHandlerProperties comDayCqDamHandlerStandardPsdPsdHandlerProperties = (ComDayCqDamHandlerStandardPsdPsdHandlerProperties) o;
    return Objects.equals(this.largeFileThreshold, comDayCqDamHandlerStandardPsdPsdHandlerProperties.largeFileThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largeFileThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamHandlerStandardPsdPsdHandlerProperties {\n");
    sb.append("    largeFileThreshold: ").append(toIndentedString(largeFileThreshold)).append("\n");
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

