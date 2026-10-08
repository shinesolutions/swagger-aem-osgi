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
 * ComDayCqDamCoreImplRenditionMakerImplProperties
 */

@JsonTypeName("comDayCqDamCoreImplRenditionMakerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplRenditionMakerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean xmpPropagate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray xmpExcludes;

  public ComDayCqDamCoreImplRenditionMakerImplProperties xmpPropagate(@Nullable ConfigNodePropertyBoolean xmpPropagate) {
    this.xmpPropagate = xmpPropagate;
    return this;
  }

  /**
   * Get xmpPropagate
   * @return xmpPropagate
   */
  @Valid 
  @Schema(name = "xmp.propagate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("xmp.propagate")
  public @Nullable ConfigNodePropertyBoolean getXmpPropagate() {
    return xmpPropagate;
  }

  @JsonProperty("xmp.propagate")
  public void setXmpPropagate(@Nullable ConfigNodePropertyBoolean xmpPropagate) {
    this.xmpPropagate = xmpPropagate;
  }

  public ComDayCqDamCoreImplRenditionMakerImplProperties xmpExcludes(@Nullable ConfigNodePropertyArray xmpExcludes) {
    this.xmpExcludes = xmpExcludes;
    return this;
  }

  /**
   * Get xmpExcludes
   * @return xmpExcludes
   */
  @Valid 
  @Schema(name = "xmp.excludes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("xmp.excludes")
  public @Nullable ConfigNodePropertyArray getXmpExcludes() {
    return xmpExcludes;
  }

  @JsonProperty("xmp.excludes")
  public void setXmpExcludes(@Nullable ConfigNodePropertyArray xmpExcludes) {
    this.xmpExcludes = xmpExcludes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplRenditionMakerImplProperties comDayCqDamCoreImplRenditionMakerImplProperties = (ComDayCqDamCoreImplRenditionMakerImplProperties) o;
    return Objects.equals(this.xmpPropagate, comDayCqDamCoreImplRenditionMakerImplProperties.xmpPropagate) &&
        Objects.equals(this.xmpExcludes, comDayCqDamCoreImplRenditionMakerImplProperties.xmpExcludes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xmpPropagate, xmpExcludes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplRenditionMakerImplProperties {\n");
    sb.append("    xmpPropagate: ").append(toIndentedString(xmpPropagate)).append("\n");
    sb.append("    xmpExcludes: ").append(toIndentedString(xmpExcludes)).append("\n");
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

