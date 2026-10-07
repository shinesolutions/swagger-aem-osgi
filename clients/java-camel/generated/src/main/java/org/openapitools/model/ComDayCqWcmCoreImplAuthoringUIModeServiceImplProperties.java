package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties
 */

@JsonTypeName("comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties {

  private ConfigNodePropertyString authoringUIModeServiceDefault;

  public ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties authoringUIModeServiceDefault(ConfigNodePropertyString authoringUIModeServiceDefault) {
    this.authoringUIModeServiceDefault = authoringUIModeServiceDefault;
    return this;
  }

  /**
   * Get authoringUIModeServiceDefault
   * @return authoringUIModeServiceDefault
   */
  @Valid 
  @Schema(name = "authoringUIModeService.default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authoringUIModeService.default")
  public ConfigNodePropertyString getAuthoringUIModeServiceDefault() {
    return authoringUIModeServiceDefault;
  }

  public void setAuthoringUIModeServiceDefault(ConfigNodePropertyString authoringUIModeServiceDefault) {
    this.authoringUIModeServiceDefault = authoringUIModeServiceDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties = (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties) o;
    return Objects.equals(this.authoringUIModeServiceDefault, comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.authoringUIModeServiceDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authoringUIModeServiceDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties {\n");
    sb.append("    authoringUIModeServiceDefault: ").append(toIndentedString(authoringUIModeServiceDefault)).append("\n");
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

