package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeGraniteRestImplServletDefaultGETServletProperties
 */

@JsonTypeName("comAdobeGraniteRestImplServletDefaultGETServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteRestImplServletDefaultGETServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger defaultLimit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean useAbsoluteUri;

  public ComAdobeGraniteRestImplServletDefaultGETServletProperties defaultLimit(@Nullable ConfigNodePropertyInteger defaultLimit) {
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
  public @Nullable ConfigNodePropertyInteger getDefaultLimit() {
    return defaultLimit;
  }

  @JsonProperty("default.limit")
  public void setDefaultLimit(@Nullable ConfigNodePropertyInteger defaultLimit) {
    this.defaultLimit = defaultLimit;
  }

  public ComAdobeGraniteRestImplServletDefaultGETServletProperties useAbsoluteUri(@Nullable ConfigNodePropertyBoolean useAbsoluteUri) {
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
  public @Nullable ConfigNodePropertyBoolean getUseAbsoluteUri() {
    return useAbsoluteUri;
  }

  @JsonProperty("use.absolute.uri")
  public void setUseAbsoluteUri(@Nullable ConfigNodePropertyBoolean useAbsoluteUri) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

