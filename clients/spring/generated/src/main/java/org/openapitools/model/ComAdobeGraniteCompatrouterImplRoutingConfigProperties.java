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
 * ComAdobeGraniteCompatrouterImplRoutingConfigProperties
 */

@JsonTypeName("comAdobeGraniteCompatrouterImplRoutingConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString compatPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString newPath;

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties id(@Nullable ConfigNodePropertyString id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable ConfigNodePropertyString getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable ConfigNodePropertyString id) {
    this.id = id;
  }

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties compatPath(@Nullable ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
    return this;
  }

  /**
   * Get compatPath
   * @return compatPath
   */
  @Valid 
  @Schema(name = "compatPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compatPath")
  public @Nullable ConfigNodePropertyString getCompatPath() {
    return compatPath;
  }

  @JsonProperty("compatPath")
  public void setCompatPath(@Nullable ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
  }

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties newPath(@Nullable ConfigNodePropertyString newPath) {
    this.newPath = newPath;
    return this;
  }

  /**
   * Get newPath
   * @return newPath
   */
  @Valid 
  @Schema(name = "newPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newPath")
  public @Nullable ConfigNodePropertyString getNewPath() {
    return newPath;
  }

  @JsonProperty("newPath")
  public void setNewPath(@Nullable ConfigNodePropertyString newPath) {
    this.newPath = newPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties comAdobeGraniteCompatrouterImplRoutingConfigProperties = (ComAdobeGraniteCompatrouterImplRoutingConfigProperties) o;
    return Objects.equals(this.id, comAdobeGraniteCompatrouterImplRoutingConfigProperties.id) &&
        Objects.equals(this.compatPath, comAdobeGraniteCompatrouterImplRoutingConfigProperties.compatPath) &&
        Objects.equals(this.newPath, comAdobeGraniteCompatrouterImplRoutingConfigProperties.newPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, compatPath, newPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    compatPath: ").append(toIndentedString(compatPath)).append("\n");
    sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
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

