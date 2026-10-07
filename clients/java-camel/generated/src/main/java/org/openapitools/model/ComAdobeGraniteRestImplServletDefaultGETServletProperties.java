package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteRestImplServletDefaultGETServletProperties
 */

@JsonTypeName("comAdobeGraniteRestImplServletDefaultGETServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteRestImplServletDefaultGETServletProperties {

  private ConfigNodePropertyInteger defaultLimit;

  private ConfigNodePropertyBoolean useAbsoluteUri;

  public ComAdobeGraniteRestImplServletDefaultGETServletProperties defaultLimit(ConfigNodePropertyInteger defaultLimit) {
    this.defaultLimit = defaultLimit;
    return this;
  }

  /**
   * Get defaultLimit
   * @return defaultLimit
   */
  @Valid 
  @Schema(name = "default.limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default.limit")
  public ConfigNodePropertyInteger getDefaultLimit() {
    return defaultLimit;
  }

  public void setDefaultLimit(ConfigNodePropertyInteger defaultLimit) {
    this.defaultLimit = defaultLimit;
  }

  public ComAdobeGraniteRestImplServletDefaultGETServletProperties useAbsoluteUri(ConfigNodePropertyBoolean useAbsoluteUri) {
    this.useAbsoluteUri = useAbsoluteUri;
    return this;
  }

  /**
   * Get useAbsoluteUri
   * @return useAbsoluteUri
   */
  @Valid 
  @Schema(name = "use.absolute.uri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("use.absolute.uri")
  public ConfigNodePropertyBoolean getUseAbsoluteUri() {
    return useAbsoluteUri;
  }

  public void setUseAbsoluteUri(ConfigNodePropertyBoolean useAbsoluteUri) {
    this.useAbsoluteUri = useAbsoluteUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRestImplServletDefaultGETServletProperties comAdobeGraniteRestImplServletDefaultGETServletProperties = (ComAdobeGraniteRestImplServletDefaultGETServletProperties) o;
    return Objects.equals(this.defaultLimit, comAdobeGraniteRestImplServletDefaultGETServletProperties.defaultLimit) &&
        Objects.equals(this.useAbsoluteUri, comAdobeGraniteRestImplServletDefaultGETServletProperties.useAbsoluteUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLimit, useAbsoluteUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRestImplServletDefaultGETServletProperties {\n");
    sb.append("    defaultLimit: ").append(toIndentedString(defaultLimit)).append("\n");
    sb.append("    useAbsoluteUri: ").append(toIndentedString(useAbsoluteUri)).append("\n");
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

