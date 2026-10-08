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
 * ComAdobeGraniteCsrfImplCSRFFilterProperties
 */

@JsonTypeName("comAdobeGraniteCsrfImplCSRFFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteCsrfImplCSRFFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray filterMethods;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean filterEnableSafeUserAgents;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray filterSafeUserAgents;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray filterExcludedPaths;

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterMethods(@Nullable ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
    return this;
  }

  /**
   * Get filterMethods
   * @return filterMethods
   */
  @Valid 
  @Schema(name = "filter.methods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.methods")
  public @Nullable ConfigNodePropertyArray getFilterMethods() {
    return filterMethods;
  }

  @JsonProperty("filter.methods")
  public void setFilterMethods(@Nullable ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterEnableSafeUserAgents(@Nullable ConfigNodePropertyBoolean filterEnableSafeUserAgents) {
    this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
    return this;
  }

  /**
   * Get filterEnableSafeUserAgents
   * @return filterEnableSafeUserAgents
   */
  @Valid 
  @Schema(name = "filter.enable.safe.user.agents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.enable.safe.user.agents")
  public @Nullable ConfigNodePropertyBoolean getFilterEnableSafeUserAgents() {
    return filterEnableSafeUserAgents;
  }

  @JsonProperty("filter.enable.safe.user.agents")
  public void setFilterEnableSafeUserAgents(@Nullable ConfigNodePropertyBoolean filterEnableSafeUserAgents) {
    this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterSafeUserAgents(@Nullable ConfigNodePropertyArray filterSafeUserAgents) {
    this.filterSafeUserAgents = filterSafeUserAgents;
    return this;
  }

  /**
   * Get filterSafeUserAgents
   * @return filterSafeUserAgents
   */
  @Valid 
  @Schema(name = "filter.safe.user.agents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.safe.user.agents")
  public @Nullable ConfigNodePropertyArray getFilterSafeUserAgents() {
    return filterSafeUserAgents;
  }

  @JsonProperty("filter.safe.user.agents")
  public void setFilterSafeUserAgents(@Nullable ConfigNodePropertyArray filterSafeUserAgents) {
    this.filterSafeUserAgents = filterSafeUserAgents;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterExcludedPaths(@Nullable ConfigNodePropertyArray filterExcludedPaths) {
    this.filterExcludedPaths = filterExcludedPaths;
    return this;
  }

  /**
   * Get filterExcludedPaths
   * @return filterExcludedPaths
   */
  @Valid 
  @Schema(name = "filter.excluded.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.excluded.paths")
  public @Nullable ConfigNodePropertyArray getFilterExcludedPaths() {
    return filterExcludedPaths;
  }

  @JsonProperty("filter.excluded.paths")
  public void setFilterExcludedPaths(@Nullable ConfigNodePropertyArray filterExcludedPaths) {
    this.filterExcludedPaths = filterExcludedPaths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCsrfImplCSRFFilterProperties comAdobeGraniteCsrfImplCSRFFilterProperties = (ComAdobeGraniteCsrfImplCSRFFilterProperties) o;
    return Objects.equals(this.filterMethods, comAdobeGraniteCsrfImplCSRFFilterProperties.filterMethods) &&
        Objects.equals(this.filterEnableSafeUserAgents, comAdobeGraniteCsrfImplCSRFFilterProperties.filterEnableSafeUserAgents) &&
        Objects.equals(this.filterSafeUserAgents, comAdobeGraniteCsrfImplCSRFFilterProperties.filterSafeUserAgents) &&
        Objects.equals(this.filterExcludedPaths, comAdobeGraniteCsrfImplCSRFFilterProperties.filterExcludedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterMethods, filterEnableSafeUserAgents, filterSafeUserAgents, filterExcludedPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCsrfImplCSRFFilterProperties {\n");
    sb.append("    filterMethods: ").append(toIndentedString(filterMethods)).append("\n");
    sb.append("    filterEnableSafeUserAgents: ").append(toIndentedString(filterEnableSafeUserAgents)).append("\n");
    sb.append("    filterSafeUserAgents: ").append(toIndentedString(filterSafeUserAgents)).append("\n");
    sb.append("    filterExcludedPaths: ").append(toIndentedString(filterExcludedPaths)).append("\n");
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

