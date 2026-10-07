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
 * ComDayCqExtwidgetServletsImageSpriteServletProperties
 */

@JsonTypeName("comDayCqExtwidgetServletsImageSpriteServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqExtwidgetServletsImageSpriteServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxWidth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxHeight;

  public ComDayCqExtwidgetServletsImageSpriteServletProperties maxWidth(@Nullable ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

  /**
   * Get maxWidth
   * @return maxWidth
   */
  @Valid 
  @Schema(name = "maxWidth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxWidth")
  public @Nullable ConfigNodePropertyInteger getMaxWidth() {
    return maxWidth;
  }

  @JsonProperty("maxWidth")
  public void setMaxWidth(@Nullable ConfigNodePropertyInteger maxWidth) {
    this.maxWidth = maxWidth;
  }

  public ComDayCqExtwidgetServletsImageSpriteServletProperties maxHeight(@Nullable ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

  /**
   * Get maxHeight
   * @return maxHeight
   */
  @Valid 
  @Schema(name = "maxHeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxHeight")
  public @Nullable ConfigNodePropertyInteger getMaxHeight() {
    return maxHeight;
  }

  @JsonProperty("maxHeight")
  public void setMaxHeight(@Nullable ConfigNodePropertyInteger maxHeight) {
    this.maxHeight = maxHeight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqExtwidgetServletsImageSpriteServletProperties comDayCqExtwidgetServletsImageSpriteServletProperties = (ComDayCqExtwidgetServletsImageSpriteServletProperties) o;
    return Objects.equals(this.maxWidth, comDayCqExtwidgetServletsImageSpriteServletProperties.maxWidth) &&
        Objects.equals(this.maxHeight, comDayCqExtwidgetServletsImageSpriteServletProperties.maxHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxWidth, maxHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqExtwidgetServletsImageSpriteServletProperties {\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
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

