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
 * ComAdobeGraniteInfocollectorInfoCollectorProperties
 */

@JsonTypeName("comAdobeGraniteInfocollectorInfoCollectorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteInfocollectorInfoCollectorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump;

  public ComAdobeGraniteInfocollectorInfoCollectorProperties graniteInfocollectorIncludeThreadDumps(@Nullable ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
    this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
    return this;
  }

  /**
   * Get graniteInfocollectorIncludeThreadDumps
   * @return graniteInfocollectorIncludeThreadDumps
   */
  @Valid 
  @Schema(name = "granite.infocollector.includeThreadDumps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.infocollector.includeThreadDumps")
  public @Nullable ConfigNodePropertyBoolean getGraniteInfocollectorIncludeThreadDumps() {
    return graniteInfocollectorIncludeThreadDumps;
  }

  @JsonProperty("granite.infocollector.includeThreadDumps")
  public void setGraniteInfocollectorIncludeThreadDumps(@Nullable ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
    this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
  }

  public ComAdobeGraniteInfocollectorInfoCollectorProperties graniteInfocollectorIncludeHeapDump(@Nullable ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
    this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
    return this;
  }

  /**
   * Get graniteInfocollectorIncludeHeapDump
   * @return graniteInfocollectorIncludeHeapDump
   */
  @Valid 
  @Schema(name = "granite.infocollector.includeHeapDump", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.infocollector.includeHeapDump")
  public @Nullable ConfigNodePropertyBoolean getGraniteInfocollectorIncludeHeapDump() {
    return graniteInfocollectorIncludeHeapDump;
  }

  @JsonProperty("granite.infocollector.includeHeapDump")
  public void setGraniteInfocollectorIncludeHeapDump(@Nullable ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
    this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteInfocollectorInfoCollectorProperties comAdobeGraniteInfocollectorInfoCollectorProperties = (ComAdobeGraniteInfocollectorInfoCollectorProperties) o;
    return Objects.equals(this.graniteInfocollectorIncludeThreadDumps, comAdobeGraniteInfocollectorInfoCollectorProperties.graniteInfocollectorIncludeThreadDumps) &&
        Objects.equals(this.graniteInfocollectorIncludeHeapDump, comAdobeGraniteInfocollectorInfoCollectorProperties.graniteInfocollectorIncludeHeapDump);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteInfocollectorIncludeThreadDumps, graniteInfocollectorIncludeHeapDump);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteInfocollectorInfoCollectorProperties {\n");
    sb.append("    graniteInfocollectorIncludeThreadDumps: ").append(toIndentedString(graniteInfocollectorIncludeThreadDumps)).append("\n");
    sb.append("    graniteInfocollectorIncludeHeapDump: ").append(toIndentedString(graniteInfocollectorIncludeHeapDump)).append("\n");
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

