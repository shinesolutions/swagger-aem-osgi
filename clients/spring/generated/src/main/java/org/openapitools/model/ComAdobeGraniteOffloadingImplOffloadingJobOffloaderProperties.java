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
 * ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties
 */

@JsonTypeName("comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean offloadingOffloaderEnabled;

  public ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties offloadingOffloaderEnabled(@Nullable ConfigNodePropertyBoolean offloadingOffloaderEnabled) {
    this.offloadingOffloaderEnabled = offloadingOffloaderEnabled;
    return this;
  }

  /**
   * Get offloadingOffloaderEnabled
   * @return offloadingOffloaderEnabled
   */
  @Valid 
  @Schema(name = "offloading.offloader.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offloading.offloader.enabled")
  public @Nullable ConfigNodePropertyBoolean getOffloadingOffloaderEnabled() {
    return offloadingOffloaderEnabled;
  }

  @JsonProperty("offloading.offloader.enabled")
  public void setOffloadingOffloaderEnabled(@Nullable ConfigNodePropertyBoolean offloadingOffloaderEnabled) {
    this.offloadingOffloaderEnabled = offloadingOffloaderEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties = (ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties) o;
    return Objects.equals(this.offloadingOffloaderEnabled, comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.offloadingOffloaderEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offloadingOffloaderEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties {\n");
    sb.append("    offloadingOffloaderEnabled: ").append(toIndentedString(offloadingOffloaderEnabled)).append("\n");
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

