package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties
 */

@JsonTypeName("comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray hcTags;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray excludeSearchPath;

  public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties hcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  /**
   * Get hcTags
   * @return hcTags
   */
  @Valid 
  @Schema(name = "hc.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.tags")
  public @Nullable ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  @JsonProperty("hc.tags")
  public void setHcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties excludeSearchPath(@Nullable ConfigNodePropertyArray excludeSearchPath) {
    this.excludeSearchPath = excludeSearchPath;
    return this;
  }

  /**
   * Get excludeSearchPath
   * @return excludeSearchPath
   */
  @Valid 
  @Schema(name = "exclude.search.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclude.search.path")
  public @Nullable ConfigNodePropertyArray getExcludeSearchPath() {
    return excludeSearchPath;
  }

  @JsonProperty("exclude.search.path")
  public void setExcludeSearchPath(@Nullable ConfigNodePropertyArray excludeSearchPath) {
    this.excludeSearchPath = excludeSearchPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties = (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.hcTags) &&
        Objects.equals(this.excludeSearchPath, comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.excludeSearchPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, excludeSearchPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties {\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    excludeSearchPath: ").append(toIndentedString(excludeSearchPath)).append("\n");
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

