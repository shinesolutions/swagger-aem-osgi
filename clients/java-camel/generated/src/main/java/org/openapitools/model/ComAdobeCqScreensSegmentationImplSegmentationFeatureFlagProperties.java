package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties
 */

@JsonTypeName("comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties {

  private ConfigNodePropertyBoolean enableDataTriggeredContent;

  public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties enableDataTriggeredContent(ConfigNodePropertyBoolean enableDataTriggeredContent) {
    this.enableDataTriggeredContent = enableDataTriggeredContent;
    return this;
  }

  /**
   * Get enableDataTriggeredContent
   * @return enableDataTriggeredContent
   */
  @Valid 
  @Schema(name = "enableDataTriggeredContent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableDataTriggeredContent")
  public ConfigNodePropertyBoolean getEnableDataTriggeredContent() {
    return enableDataTriggeredContent;
  }

  public void setEnableDataTriggeredContent(ConfigNodePropertyBoolean enableDataTriggeredContent) {
    this.enableDataTriggeredContent = enableDataTriggeredContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties = (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties) o;
    return Objects.equals(this.enableDataTriggeredContent, comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.enableDataTriggeredContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableDataTriggeredContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties {\n");
    sb.append("    enableDataTriggeredContent: ").append(toIndentedString(enableDataTriggeredContent)).append("\n");
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

