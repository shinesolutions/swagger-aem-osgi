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
 * ComAdobeCqProjectsImplServletProjectImageServletProperties
 */

@JsonTypeName("comAdobeCqProjectsImplServletProjectImageServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqProjectsImplServletProjectImageServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString imageQuality;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString imageSupportedResolutions;

  public ComAdobeCqProjectsImplServletProjectImageServletProperties imageQuality(@Nullable ConfigNodePropertyString imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

  /**
   * Get imageQuality
   * @return imageQuality
   */
  @Valid 
  @Schema(name = "image.quality", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image.quality")
  public @Nullable ConfigNodePropertyString getImageQuality() {
    return imageQuality;
  }

  @JsonProperty("image.quality")
  public void setImageQuality(@Nullable ConfigNodePropertyString imageQuality) {
    this.imageQuality = imageQuality;
  }

  public ComAdobeCqProjectsImplServletProjectImageServletProperties imageSupportedResolutions(@Nullable ConfigNodePropertyString imageSupportedResolutions) {
    this.imageSupportedResolutions = imageSupportedResolutions;
    return this;
  }

  /**
   * Get imageSupportedResolutions
   * @return imageSupportedResolutions
   */
  @Valid 
  @Schema(name = "image.supported.resolutions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image.supported.resolutions")
  public @Nullable ConfigNodePropertyString getImageSupportedResolutions() {
    return imageSupportedResolutions;
  }

  @JsonProperty("image.supported.resolutions")
  public void setImageSupportedResolutions(@Nullable ConfigNodePropertyString imageSupportedResolutions) {
    this.imageSupportedResolutions = imageSupportedResolutions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqProjectsImplServletProjectImageServletProperties comAdobeCqProjectsImplServletProjectImageServletProperties = (ComAdobeCqProjectsImplServletProjectImageServletProperties) o;
    return Objects.equals(this.imageQuality, comAdobeCqProjectsImplServletProjectImageServletProperties.imageQuality) &&
        Objects.equals(this.imageSupportedResolutions, comAdobeCqProjectsImplServletProjectImageServletProperties.imageSupportedResolutions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageQuality, imageSupportedResolutions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqProjectsImplServletProjectImageServletProperties {\n");
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
    sb.append("    imageSupportedResolutions: ").append(toIndentedString(imageSupportedResolutions)).append("\n");
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

