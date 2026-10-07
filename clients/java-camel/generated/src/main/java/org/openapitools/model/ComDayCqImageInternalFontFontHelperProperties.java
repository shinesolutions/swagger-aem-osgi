package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqImageInternalFontFontHelperProperties
 */

@JsonTypeName("comDayCqImageInternalFontFontHelperProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqImageInternalFontFontHelperProperties {

  private ConfigNodePropertyArray fontpath;

  private ConfigNodePropertyInteger oversamplingFactor;

  public ComDayCqImageInternalFontFontHelperProperties fontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
    return this;
  }

  /**
   * Get fontpath
   * @return fontpath
   */
  @Valid 
  @Schema(name = "fontpath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fontpath")
  public ConfigNodePropertyArray getFontpath() {
    return fontpath;
  }

  public void setFontpath(ConfigNodePropertyArray fontpath) {
    this.fontpath = fontpath;
  }

  public ComDayCqImageInternalFontFontHelperProperties oversamplingFactor(ConfigNodePropertyInteger oversamplingFactor) {
    this.oversamplingFactor = oversamplingFactor;
    return this;
  }

  /**
   * Get oversamplingFactor
   * @return oversamplingFactor
   */
  @Valid 
  @Schema(name = "oversamplingFactor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oversamplingFactor")
  public ConfigNodePropertyInteger getOversamplingFactor() {
    return oversamplingFactor;
  }

  public void setOversamplingFactor(ConfigNodePropertyInteger oversamplingFactor) {
    this.oversamplingFactor = oversamplingFactor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqImageInternalFontFontHelperProperties comDayCqImageInternalFontFontHelperProperties = (ComDayCqImageInternalFontFontHelperProperties) o;
    return Objects.equals(this.fontpath, comDayCqImageInternalFontFontHelperProperties.fontpath) &&
        Objects.equals(this.oversamplingFactor, comDayCqImageInternalFontFontHelperProperties.oversamplingFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontpath, oversamplingFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqImageInternalFontFontHelperProperties {\n");
    sb.append("    fontpath: ").append(toIndentedString(fontpath)).append("\n");
    sb.append("    oversamplingFactor: ").append(toIndentedString(oversamplingFactor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

